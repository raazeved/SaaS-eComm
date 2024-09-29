package tech.ada.eCommSolidario.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import tech.ada.eCommSolidario.dto. EstabelecimentoDTO;
import tech.ada.eCommSolidario.mapper.EstabelecimentoMapper;
import tech.ada.eCommSolidario.repository.EstabelecimentoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BuscarEstabelecimentoService {

    private final EstabelecimentoRepository estabelecimentoRepository;
    private final EstabelecimentoMapper estabelecimentoMapper;

    public BuscarEstabelecimentoService(EstabelecimentoRepository estabelecimentoRepository,
                                        EstabelecimentoMapper estabelecimentoMapper) {
        this.estabelecimentoRepository = estabelecimentoRepository;
        this.estabelecimentoMapper = estabelecimentoMapper;
    }

    public Optional<EstabelecimentoDTO> buscarestabelecimentoCcnpj  (String cnpj) {
        return estabelecimentoRepository.findEstabelecimentoByCnpj(cnpj).map(estabelecimentoMapper::toDto);
    }

    public List<EstabelecimentoDTO> buscarTodas() {
        return estabelecimentoRepository
                .findAll()
                .stream()
                .map(estabelecimentoMapper::toDto)
                .toList();
    }

    public Page<EstabelecimentoDTO> buscarPaginada(Pageable pageable) {
        return estabelecimentoRepository
                .findAll(pageable)
                .map(estabelecimentoMapper::toDto);
    }

    public List<EstabelecimentoDTO>  buscarestabelecimentobyUf (String cidade) {
        return estabelecimentoRepository
                .findByUf(cidade)
                .stream()
                .map(estabelecimentoMapper::toDto)
                .toList();
    }
}

