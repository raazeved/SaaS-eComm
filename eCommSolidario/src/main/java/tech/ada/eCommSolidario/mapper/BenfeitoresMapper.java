package tech.ada.eCommSolidario.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import tech.ada.eCommSolidario.dto.BenfeitoresDTO;
import tech.ada.eCommSolidario.model.Benfeitores;

@Mapper(componentModel = "spring")
public interface BenfeitoresMapper {


    BenfeitoresMapper INSTANCE = Mappers.getMapper(BenfeitoresMapper.class);

    BenfeitoresDTO toDto(Benfeitores benfeitores);

    Benfeitores toEntity(BenfeitoresDTO benfeitoresDTO);

}
