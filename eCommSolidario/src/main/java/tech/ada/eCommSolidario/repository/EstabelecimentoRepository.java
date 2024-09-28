package tech.ada.eCommSolidario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tech.ada.eCommSolidario.model.Estabelecimento;

import java.util.List;
import java.util.Optional;

@Repository
public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {

    // Método para buscar Estabelecimento por nome
    Optional<Estabelecimento> findEstabelecimentoByNome(String nome);

    // Método customizado para buscar por tipo de estabelecimento
    @Query("SELECT e FROM Estabelecimento e WHERE e.tipo = :tipo")
    List<Estabelecimento> findByTipo(String tipo);

    // Método customizado para buscar por UF
    @Query("SELECT e FROM Estabelecimento e WHERE e.uf = :uf")
    List<Estabelecimento> findByUf(String uf);
}