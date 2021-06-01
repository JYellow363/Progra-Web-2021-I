package pe.edu.upc.dao;

import java.util.List;
import pe.edu.upc.entity.Ciudad;

public interface ICiudadDao {
	public void insertar(Ciudad ciudad);
	public List<Ciudad> listar();
	public void eliminar(int idCiudad);
}
