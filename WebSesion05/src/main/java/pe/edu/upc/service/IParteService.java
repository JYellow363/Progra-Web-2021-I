package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Parte;

public interface IParteService {
	public void insertar(Parte parte);
	public List<Parte> listar();
	public void eliminar(int idParte);
}
