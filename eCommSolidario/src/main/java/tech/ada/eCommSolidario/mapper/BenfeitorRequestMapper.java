package tech.ada.eCommSolidario.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import tech.ada.eCommSolidario.dto.BenfeitorRequestDTO;
import tech.ada.eCommSolidario.model.Benfeitor;

@Mapper(componentModel = "spring")
public interface BenfeitorRequestMapper {


    BenfeitorRequestMapper INSTANCE = Mappers.getMapper(BenfeitorRequestMapper.class);

    BenfeitorRequestDTO toDto(Benfeitor benfeitor);

    Benfeitor toEntity(BenfeitorRequestDTO benfeitorRequestDTO);
}

