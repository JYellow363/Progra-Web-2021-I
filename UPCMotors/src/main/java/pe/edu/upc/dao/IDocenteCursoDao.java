package pe.edu.upc.dao;

import java.util.List;
import pe.edu.upc.entity.DocenteCurso;

public interface IDocenteCursoDao {
	public void insertar(DocenteCurso docenteCurso);
	public List<DocenteCurso> listar();
	public void eliminar(int idDocenteCurso);	
}