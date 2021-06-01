package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.DocenteCurso;

public interface IDocenteCursoService {
	public void insertar(DocenteCurso docentecurso);
	public List<DocenteCurso> listar();
	public void eliminar(int idDocenteCurso);	
}
