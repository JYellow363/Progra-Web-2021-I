package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Tormo;
import pe.edu.upc.service.IMotorService;

@Named
@RequestScoped

public class MotorController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IMotorService mService;
	private Tormo motor;
	List<Tormo> listaMotores;
	
	@PostConstruct
	public void init() {
		this.listaMotores = new ArrayList<Tormo>();
		this.motor = new Tormo();
		this.listar();
	}
	
	public String nuevoMotor() {
		this.setMotor(new Tormo());
		return "motor.xhtml";
	}
	
	public void insertar() {
		mService.insertar(motor);
		limpiarMotor();
	}
	
	public void listar() {
		listaMotores = mService.listar();
	}
	
	public void limpiarMotor() {
		this.init();
	}
	
	public void eliminar(Tormo motor) {
		mService.eliminar(motor.getId());
		this.listar();
	}

	public Tormo getMotor() {
		return motor;
	}

	public void setMotor(Tormo motor) {
		this.motor = motor;
	}

	public List<Tormo> getListaMotores() {
		return listaMotores;
	}

	public void setListaMotores(List<Tormo> listaMotores) {
		this.listaMotores = listaMotores;
	}
	
}
