package pe.edu.pe.dao;

import java.util.List;

import pe.edu.pe.entity.Motor;

public interface IMotorDao {
	public void insertar(Motor motor);
	public List<Motor> listar();
	public void eliminar(int idMotor);
}
