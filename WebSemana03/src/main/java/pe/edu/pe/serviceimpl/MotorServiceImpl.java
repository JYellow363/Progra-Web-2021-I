package pe.edu.pe.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.pe.dao.IMotorDao;
import pe.edu.pe.entity.Motor;
import pe.edu.pe.service.IMotorService;

@Named
@RequestScoped
public class MotorServiceImpl implements IMotorService, Serializable {

	@Inject
	private IMotorDao mD;
	
	private static final long serialVersionUID = 1L;

	@Override
	public void insertar(Motor motor) {
		mD.insertar(motor);
	}

	@Override
	public List<Motor> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idMotor) {
		mD.eliminar(idMotor);
	}

}
