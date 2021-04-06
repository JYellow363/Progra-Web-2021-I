package pe.edu.pe.service;

import java.util.List;

import pe.edu.pe.entity.Motor;


public interface IMotorService {
	public void insertar(Motor motor);
	public List<Motor> listar();
	public void eliminar(int idMotor);
}
