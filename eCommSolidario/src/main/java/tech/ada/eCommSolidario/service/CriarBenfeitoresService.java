package tech.ada.eCommSolidario.service;

import org.springframework.stereotype.Service;
import tech.ada.eCommSolidario.dto.BenfeitoresDTO;
import tech.ada.eCommSolidario.dto.BenfeitorRequestDTO;
import tech.ada.eCommSolidario.mapper.BenfeitoresMapper;
import tech.ada.eCommSolidario.mapper.BenfeitorRequestMapper;
import tech.ada.eCommSolidario.repository.BenfeitorRepository;

@Service
public class CriarBenfeitoresService {

    private final BenfeitorRepository benfeitorRepository;
    private final BenfeitoresMapper benfeitoresMapper;
    private final BenfeitorRequestMapper benfeitorRequestMapper;

    public CriarBenfeitoresService(BenfeitorRepository benfeitorRepository, BenfeitoresMapper benfeitoresMapper,
                                   BenfeitorRequestMapper benfeitorRequestMapper) {
        this.benfeitorRepository = benfeitorRepository;
        this.benfeitoresMapper = benfeitoresMapper;
        this.benfeitorRequestMapper = benfeitorRequestMapper;
    }

    /**
     * Método para criar uma pessoa, usando o mapstruct
     *
     * @param benfeitor
     * @return
     */
    public BenfeitoresDTO executar(BenfeitorRequestDTO benfeitor) {
        var entity = benfeitorRequestMapper.toEntity(benfeitor);
            entity = benfeitorRepository.save(entity);
        return benfeitoresMapper.toDto(entity);
    }


}
