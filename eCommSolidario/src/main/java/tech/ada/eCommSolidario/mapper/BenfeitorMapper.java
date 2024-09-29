package tech.ada.eCommSolidario.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import tech.ada.eCommSolidario.dto.BenfeitorDTO;
import tech.ada.eCommSolidario.model.Benfeitor;

@Mapper(componentModel = "spring")
public interface BenfeitorMapper {

    BenfeitorMapper INSTANCE = Mappers.getMapper(BenfeitorMapper.class);

    BenfeitorDTO toDto(Benfeitor benfeitores);

    Benfeitor toEntity(BenfeitorDTO benfeitoresDTO);

}
