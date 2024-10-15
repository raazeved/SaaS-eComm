package tech.ada.eCommSolidario.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import tech.ada.eCommSolidario.dto.CampanhaDTO;
import tech.ada.eCommSolidario.dto.ConsultaCampanhaDTOResponse;
import tech.ada.eCommSolidario.model.CampanhaEntity;


@Mapper(componentModel = "spring")
public interface CampanhaMapper {
    CampanhaEntity toEntity(CampanhaDTO dto);

    CampanhaDTO toDTO(CampanhaEntity entity);
    ConsultaCampanhaDTOResponse toDTOConsulta(CampanhaEntity entity);
    @AfterMapping
    default void afterMapping(@MappingTarget CampanhaEntity campanhaEntity) {
        campanhaEntity.getLocacoes().forEach(l -> l.setCampanha(campanhaEntity));
        campanhaEntity.getPersonagens().forEach(p -> p.setCampanha(campanhaEntity));
    }
}
