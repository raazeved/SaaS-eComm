package tech.ada.eCommSolidario.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import tech.ada.eCommSolidario.dto.BenfeitoresDTO;
import tech.ada.eCommSolidario.mapper.BenfeitoresMapper;
import tech.ada.eCommSolidario.model.Benfeitores;
import tech.ada.eCommSolidario.repository.BenfeitoresRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BuscarBenfeitoresService {

    private final BenfeitoresRepository benfeitoresRepository;
    private final BenfeitoresMapper benfeitoresMapper;

    public BuscarBenfeitoresService(BenfeitoresRepository benfeitoresRepository, BenfeitoresMapper benfeitoresMapper) {
        this.benfeitoresRepository = benfeitoresRepository;
        this.benfeitoresMapper = benfeitoresMapper;
    }

    public Optional<BenfeitoresDTO> buscarBenfeitorCpf(String cpf) {
        return pessoaRepository.findPessoaByCpf(cpf).map(pessoaMapper::toDto);
    }

    public List<PessoaDTO> buscarTodas() {
        return pessoaRepository
                .findAll()
                .stream()
                .map(pessoaMapper::toDto)
                .toList();
    }

    public Page<PessoaDTO> buscarPaginada(Pageable pageable) {
        return pessoaRepository
                .findAll(pageable)
                .map(pessoaMapper::toDto);
    }

    public List<PessoaDTO> buscarPessoasPorUf(String cidade) {
        return pessoaRepository
//                .findByUf(cidade)
                .findByUfNativa(cidade)
                .stream()
                .map(pessoaMapper::toDto)
                .toList();
    }
}


}
