package tech.ada.eCommSolidario.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import tech.ada.eCommSolidario.dto.EstabelecimentoRequestDTO;
import tech.ada.eCommSolidario.model.Estabelecimento;

@Mapper(componentModel = "spring")
public interface EstabelecimentoRequestMapper {

    EstabelecimentoRequestMapper INSTANCE = Mappers.getMapper(EstabelecimentoRequestMapper.class);

    // Mapeia de entidade para DTO
    EstabelecimentoRequestDTO toDto(Estabelecimento estabelecimento);

    // Mapeia de DTO para entidade
    Estabelecimento toEntity(EstabelecimentoRequestDTO estabelecimentoRequestDTO);
}