package tech.ada.eCommSolidario.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import tech.ada.eCommSolidario.model.Benfeitor;
import tech.ada.eCommSolidario.dto.BenfeitorDTO;

@Mapper(componentModel = "spring")
public interface BenfeitoresMapper {


    BenfeitoresMapper INSTANCE = Mappers.getMapper(BenfeitoresMapper.class);

    BenfeitorDTO toDto(Benfeitor benfeitores);

    Benfeitor toEntity(BenfeitorDTO benfeitoresDTO);

}
