package pe.edu.upc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.model.Repartidor;

@Repository
public interface IRepartidorRepository extends JpaRepository<Repartidor, Integer>{
	@Query("select count(r.ruc) from Repartidor r where r.ruc = :ruc")
	public int searchRucRepartidor(@Param("ruc") String ruc);
	
	@Query("select r from Repartidor r where r.nameRepartidor like %:nameRepartidor%")
	List<Repartidor> findByName(String nameRepartidor);
	
	@Query("select r from Repartidor r where r.ruc like %:ruc%")
	List<Repartidor> findByRUC(String ruc);
}
