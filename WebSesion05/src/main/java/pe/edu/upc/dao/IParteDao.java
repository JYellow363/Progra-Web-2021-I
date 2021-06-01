package pe.edu.upc.dao;

import java.util.List;
import pe.edu.upc.entity.Parte;

public interface IParteDao {
	public void insertar(Parte parte);
	public List<Parte> listar();
	public void eliminar(int idParte);
}
