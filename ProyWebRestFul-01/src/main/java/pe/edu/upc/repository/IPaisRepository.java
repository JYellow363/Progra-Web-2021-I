package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.model.Pais;

@Repository
public interface IPaisRepository extends JpaRepository<Pais, Integer> {

}
