const mongoose = require("mongoose");
const Loja = mongoose.Schema("Loja");

class LojaController {

// GET /
index (req, res, next ) {
    Loja.find({ }).select("_id nome cnpj email telefones endereco")
    .then ( Lojas => res.send({ Lojas }))
    .catch(next);
}

// GET /:id
show (req, res, next ) {
    Loja.findByid(req.params.id).select("_id nome cnpj email telefones endereco")
    .then( Loja => res.send({ Loja }) )
    .catch(next);
}
// POST /
store (req, res, next ) {
    const { nome, cnpj, email, telefones, endereco } = req.body; 
    const error = []; 
    if(!nome) error.push("nome");
    if(!cnpj) error.push("cnpj");
    if(!email) error.push("email");
    if(!telefones) error.push("telefones");
    if(!endereco) error.push("endereco");
    if(error.length > 0 )  return res.status(422).json( {error: "required", payload: error });  

    const loja = new Loja ({nome, cnpj, email, telefones, endereco});
    loja.save().then(() => res.send({loja})).catch(next);
}

// PUT /:id

update (req, res, next ) {
    const {nome, cnpj, email, telefones, endereco}= req.body; 
    Loja.findByid(req.params.id).then( loja => { 
    if(!loja) return res.status(422).send({error: "Loja não existe."});

    if(nome)      loja.nome = nome ;
    if(cnpj)      loja.cnpj = cnpj ;
    if(email)      loja.email = email ;
    if(telefones) loja.telefones = telefones;
    if(endereco)  loja.endereco = endereco ;
    
    loja.save().then(() => res.send({loja})).catch(next);   
    }).catch(next);
}

// DELETE /:id


remove (req, res, next ) {

    Loja.findByid(req.params.id).then( loja => { 
        if(!loja) return res.status(422).send({error: "Loja não existe."});
    
        loja.remove().then(() => res.send({deleted: true })).catch(next);   
        }).catch(next);
}


}

module.exports = LojaController;