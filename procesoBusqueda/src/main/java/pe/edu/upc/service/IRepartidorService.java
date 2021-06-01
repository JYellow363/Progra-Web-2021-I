package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.model.Repartidor;

public interface IRepartidorService {
	public Integer insertar(Repartidor repartidor);
	List<Repartidor> listar();
	List<Repartidor> findByName(String nameRepartidor);
	List<Repartidor> findByRUC(String ruc);
}
