package tech.ada.eCommSolidario.service;

import org.springframework.stereotype.Service;
import tech.ada.eCommSolidario.dto.EstabelecimentoDTO;
import tech.ada.eCommSolidario.dto.EstabelecimentoRequestDTO;
import tech.ada.eCommSolidario.mapper.EstabelecimentoMapper;
import tech.ada.eCommSolidario.mapper.EstabelecimentoRequestMapper;
import tech.ada.eCommSolidario.repository.EstabelecimentoRepository;

@Service
public class CriarEstabelecimentoService {

    private final EstabelecimentoRepository estabelecimentoRepository;
    private final EstabelecimentoMapper estabelecimentoMapper;
    private final EstabelecimentoRequestMapper estabelecimentoRequestMapper;

    public CriarEstabelecimentoService(EstabelecimentoRepository estabelecimentoRepository,
                                       EstabelecimentoMapper estabelecimentoMapper,
                                       EstabelecimentoRequestMapper estabelecimentoRequestMapper) {
        this.estabelecimentoRepository = estabelecimentoRepository;
        this.estabelecimentoMapper = estabelecimentoMapper;
        this.estabelecimentoRequestMapper = estabelecimentoRequestMapper;
    }

    /**
     * Método para criar uma pessoa, usando o mapstruct
     *
     * @param estabelecimento
     * @return
     */
    public EstabelecimentoDTO executar(EstabelecimentoRequestDTO estabelecimento) {
        var entity = estabelecimentoRequestMapper.toEntity(estabelecimento);
        entity = estabelecimentoRepository.save(entity);
        return estabelecimentoMapper.toDto(entity);
    }



}
