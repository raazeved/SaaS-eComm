package tech.ada.eCommSolidario.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import tech.ada.eCommSolidario.dto.BenfeitoresDTO;
import tech.ada.eCommSolidario.mapper.BenfeitoresMapper;
import tech.ada.eCommSolidario.repository.BenfeitorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BuscarBenfeitorService {

    private final BenfeitorRepository benfeitoresRepository;
    private final BenfeitoresMapper benfeitoresMapper;

    public BuscarBenfeitorService(BenfeitorRepository benfeitoresRepository, BenfeitoresMapper benfeitoresMapper) {
        this.benfeitoresRepository = benfeitoresRepository;
        this.benfeitoresMapper = benfeitoresMapper;
    }

    public Optional<BenfeitoresDTO> buscarBenfeitorCpf(String cpf) {
        return benfeitoresRepository.findBenfeitorByCpf(cpf).map(benfeitoresMapper::toDto);
    }

    public List<BenfeitoresDTO> buscarTodas() {
        return benfeitoresRepository
                .findAll()
                .stream()
                .map(benfeitoresMapper::toDto)
                .toList();
    }

    public Page<BenfeitoresDTO> buscarPaginada(Pageable pageable) {
        return benfeitoresRepository
                .findAll(pageable)
                .map(benfeitoresMapper::toDto);
    }

    public List<BenfeitoresDTO> buscarPessoasPorUf(String cidade) {
        return benfeitoresRepository
                .findByUf(cidade)
                .stream()
                .map(benfeitoresMapper::toDto)
                .toList();
    }
}

