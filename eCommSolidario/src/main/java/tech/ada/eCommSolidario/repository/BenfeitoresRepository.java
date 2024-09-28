package tech.ada.eCommSolidario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tech.ada.eCommSolidario.model.Benfeitores;

import java.util.List;
import java.util.Optional;

@Repository
public interface BenfeitoresRepository extends JpaRepository<Benfeitores, Long>{

    Optional<Benfeitores> findPessoaByCpf(String cpf);

    @Query("SELECT p FROM Pessoa p WHERE p.endereco.uf = :uf")
    List<Pessoa> findByUf(String uf);

    @Query(value = "SELECT p.* FROM pessoa p INNER JOIN endereco e ON p.endereco_id = e.id WHERE e.uf = :uf", nativeQuery = true)
    List<Pessoa> findByUfNativa(String uf);
}