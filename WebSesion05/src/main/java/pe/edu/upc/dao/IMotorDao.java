package pe.edu.upc.dao;

import java.util.List;
import pe.edu.upc.entity.Tormo;

public interface IMotorDao {
	public void insertar(Tormo motor);
	public List<Tormo> listar();
	public void eliminar(int idMotor);
}
