package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Ciudad;

public interface ICiudadService {
	public void insertar(Ciudad ciudad);
	public List<Ciudad> listar();
	public void eliminar(int idCiudad);
}
