package pe.edu.upc.dao;

import java.util.List;
import pe.edu.upc.entity.Docente;

public interface IDocenteDao {
	public void insertar(Docente docente);
	public List<Docente> listar();
	public void eliminar(int idDocente);	
}

