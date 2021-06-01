package pe.edu.upc.spring.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.spring.model.Dueno;
import pe.edu.upc.spring.model.Race;

public interface IDuenoService {
	public boolean insertar(Dueno dueno);

	public boolean modificar(Dueno dueno);

	public void eliminar(int idDueno);

	public Optional<Dueno> listarId(int idDueno);

	List<Dueno> listar();

	List<Dueno> buscarNombre(String nameDueno);
}
