package pe.edu.upc.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.model.Pais;

public interface IPaisService {

	public boolean registrar(Pais pais);

	public void eliminar(int idPais);

	public Optional<Pais> listarId(int idPais);

	List<Pais> listar();

}
