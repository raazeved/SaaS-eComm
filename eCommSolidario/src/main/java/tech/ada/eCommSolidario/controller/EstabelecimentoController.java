package tech.ada.eCommSolidario.controller;


import tech.ada.eCommSolidario.model.Estabelecimento;
import tech.ada.eCommSolidario.service.EstabelecimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estabelecimentos")
public class EstabelecimentoController {

    @Autowired
    private EstabelecimentoService service;

    @GetMapping
    public List<Estabelecimento> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estabelecimento> obterPorId(@PathVariable Long id) {
        Optional<Estabelecimento> estabelecimento = service.obterPorId(id);
        return estabelecimento.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Estabelecimento salvar(@RequestBody Estabelecimento estabelecimento) {
        return service.salvar(estabelecimento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estabelecimento> atualizar(@PathVariable Long id, @RequestBody Estabelecimento estabelecimento) {
        Optional<Estabelecimento> estabelecimentoExistente = service.obterPorId(id);

        if (estabelecimentoExistente.isPresent()) {
            estabelecimento.setId(id);
            return ResponseEntity.ok(service.salvar(estabelecimento));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        Optional<Estabelecimento> estabelecimento = service.obterPorId(id);

        if (estabelecimento.isPresent()) {
            service.excluir(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}