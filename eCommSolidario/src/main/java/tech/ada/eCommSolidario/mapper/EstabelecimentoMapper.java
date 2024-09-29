package tech.ada.eCommSolidario.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import tech.ada.eCommSolidario.dto.EstabelecimentoDTO;
import tech.ada.eCommSolidario.model.Estabelecimento;


@Mapper(componentModel = "spring")
public interface EstabelecimentoMapper {

    tech.ada.eCommSolidario.mapper.EstabelecimentoMapper INSTANCE = Mappers.getMapper(tech.ada.eCommSolidario.mapper.EstabelecimentoMapper.class);

    EstabelecimentoDTO toDto(Estabelecimento estabelecimento);

    Estabelecimento toEntity(EstabelecimentoDTO estabelecimentoDTO);

}