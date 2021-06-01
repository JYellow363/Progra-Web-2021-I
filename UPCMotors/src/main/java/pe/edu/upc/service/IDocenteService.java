package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Docente;

public interface IDocenteService {
	public void insertar(Docente docente);
	public List<Docente> listar();
	public void eliminar(int idDocente);	
}
