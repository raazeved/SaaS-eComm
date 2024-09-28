package tech.ada.eCommSolidario.mapper;

import org.springframework.stereotype.Component;
import tech.ada.eCommSolidario.dto.EstabelecimentoDTO;
import tech.ada.eCommSolidario.dto.EstabelecimentoRequestDTO;
import tech.ada.eCommSolidario.model.Estabelecimento;

@Component
public class EstabelecimentosMapper {

    // Converte de Entidade para DTO
    public EstabelecimentoDTO toDTO(Estabelecimento estabelecimento) {
        return new EstabelecimentoDTO(
                estabelecimento.getIdEstabelecimento(),
                estabelecimento.getNome(),
                estabelecimento.getTipo(),
                estabelecimento.getEndereco(),
                estabelecimento.getContato(),
                estabelecimento.getNecessidades(),
                estabelecimento.getHistorico(),
                estabelecimento.getUf()
        );
    }

    // Converte de DTO para Entidade
    public Estabelecimento toEntity(EstabelecimentoRequestDTO estabelecimentoRequestDTO) {
        return new Estabelecimento(
                estabelecimentoRequestDTO.getNome(),
                estabelecimentoRequestDTO.getTipo(),
                estabelecimentoRequestDTO.getEndereco(),
                estabelecimentoRequestDTO.getContato(),
                estabelecimentoRequestDTO.getNecessidades(),
                estabelecimentoRequestDTO.getHistorico(),
                estabelecimentoRequestDTO.getUf()
        );
    }
}