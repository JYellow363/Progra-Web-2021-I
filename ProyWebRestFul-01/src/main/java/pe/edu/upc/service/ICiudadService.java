package pe.edu.upc.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.model.Ciudad;

public interface ICiudadService {
	
	public boolean registrar(Ciudad ciudad);

	public void eliminar(int idCiudad);

	public Optional<Ciudad> listarId(int idCiudad);

	List<Ciudad> listar();
	
}
