package tech.ada.eCommSolidario.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import tech.ada.eCommSolidario.dto.BenfeitorDTO;
import tech.ada.eCommSolidario.mapper.BenfeitorMapper;
import tech.ada.eCommSolidario.repository.BenfeitorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BuscarBenfeitorService {

    private final BenfeitorRepository benfeitoresRepository;
    private final BenfeitorMapper benfeitoresMapper;

    public BuscarBenfeitorService(BenfeitorRepository benfeitoresRepository, BenfeitorMapper benfeitoresMapper) {
        this.benfeitoresRepository = benfeitoresRepository;
        this.benfeitoresMapper = benfeitoresMapper;
    }

    public Optional<BenfeitorDTO> buscarBenfeitorCpf(String cpf) {
        return benfeitoresRepository.findBenfeitorByCpf(cpf).map(benfeitoresMapper::toDto);
    }

    public List<BenfeitorDTO> buscarTodas() {
        return benfeitoresRepository
                .findAll()
                .stream()
                .map(benfeitoresMapper::toDto)
                .toList();
    }

    public Page<BenfeitorDTO> buscarPaginada(Pageable pageable) {
        return benfeitoresRepository
                .findAll(pageable)
                .map(benfeitoresMapper::toDto);
    }

    public List<BenfeitorDTO> buscarPessoasPorUf(String cidade) {
        return benfeitoresRepository
                .findByUf(cidade)
                .stream()
                .map(benfeitoresMapper::toDto)
                .toList();
    }
}

