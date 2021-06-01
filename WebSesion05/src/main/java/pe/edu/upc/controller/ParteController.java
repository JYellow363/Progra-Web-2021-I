package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Tormo;
import pe.edu.upc.entity.Parte;
import pe.edu.upc.service.IMotorService;
import pe.edu.upc.service.IParteService;

@Named
@RequestScoped

public class ParteController implements Serializable {

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private IMotorService mService;
	
	@Inject
	private IParteService pService;	
				
	private Tormo motor;
	List<Tormo> listaMotores;
	
	private Parte parte;
	List<Parte> listaPartes;
	
	@PostConstruct
	public void init() {
		listaMotores = new ArrayList<Tormo>();
		motor = new Tormo();
		listaPartes = new ArrayList<Parte>();
		parte = new Parte();
		this.listar();
		this.listarParte();
	}
	
	public String nuevoParte() {
		this.setParte(new Parte());
		return "parte.xhtml";
	}
	
	public void insertar() {
		pService.insertar(parte);
		limpiarParte();		
		this.listarParte();
	}
	
	public void listarParte() {
		listaPartes = pService.listar();
	}
	
	public void listar() {
		listaMotores = mService.listar();
	}
	
	public void limpiarParte() {
		this.init();
	}
	
	public void eliminar(Parte parte) {
		pService.eliminar(parte.getIdParte());
		this.listarParte();
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

	public Parte getParte() {
		return parte;
	}

	public void setParte(Parte parte) {
		this.parte = parte;
	}

	public List<Parte> getListaPartes() {
		return listaPartes;
	}

	public void setListaPartes(List<Parte> listaPartes) {
		this.listaPartes = listaPartes;
	}

}
