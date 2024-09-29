package tech.ada.eCommSolidario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tech.ada.eCommSolidario.model.Benfeitor;
import tech.ada.eCommSolidario.model.Estabelecimento;

import java.util.List;
import java.util.Optional;

@Repository
public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {

    Optional<Estabelecimento> findEstabelecimentoByCnpj(String cnpj);

    @Query("SELECT e FROM Estabelecimento e WHERE e.uf = :uf")
    List<Estabelecimento> findByUf(String uf);

    @Query(value = "SELECT e.* FROM Estabelecimento WHERE e.uf = :uf", nativeQuery = true)
    List<Estabelecimento> findByUfNativa(String uf);

}