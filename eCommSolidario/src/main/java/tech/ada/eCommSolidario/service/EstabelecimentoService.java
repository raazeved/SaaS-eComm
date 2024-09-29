package tech.ada.eCommSolidario.service;


import tech.ada.eCommSolidario.model.Estabelecimento;
import tech.ada.eCommSolidario.repository.EstabelecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstabelecimentoService {

    @Autowired
    private EstabelecimentoRepository repository;

    public List<Estabelecimento> listarTodos() {
        return repository.findAll();
    }

    public Optional<Estabelecimento> obterPorId(Long id) {
        return repository.findById(id);
    }

    public Estabelecimento salvar(Estabelecimento estabelecimento) {
        return repository.save(estabelecimento);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}