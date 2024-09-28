package tech.ada.eCommSolidario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tech.ada.eCommSolidario.model.Benfeitor;

import java.util.List;
import java.util.Optional;

@Repository
public interface BenfeitorRepository extends JpaRepository<Benfeitor, Long>{

    Optional<Benfeitor> findBenfeitorByCpf(String cpf);

    @Query("SELECT b FROM Benfeitor b WHERE b.uf = :uf")
    List<Benfeitor> findByUf(String uf);

}