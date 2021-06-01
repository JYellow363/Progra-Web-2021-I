package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Tormo;

public interface IMotorService {
	public void insertar(Tormo motor);
	public List<Tormo> listar();
	public void eliminar(int idMotor);
}
