package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Ciudad;
import pe.edu.upc.service.ICiudadService;

@Named
@RequestScoped

public class CiudadController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ICiudadService cService;
	private Ciudad ciudad;
	List<Ciudad> listaCiudades;
	
	@PostConstruct
	public void init() {
		this.listaCiudades = new ArrayList<Ciudad>();
		this.ciudad = new Ciudad();
		this.listar();
	}
	
	public String nuevoCiudad() {
		this.setCiudad(new Ciudad());
		return "ciudad.xhtml";
	}
	
	public void insertar() {
		cService.insertar(ciudad);
		limpiarCiudad();
	}
	
	public void listar() {
		listaCiudades = cService.listar();
	}
	
	public void limpiarCiudad() {
		this.init();
	}
	
	public void eliminar(Ciudad ciudad) {
		cService.eliminar(ciudad.getIdCiudad());
		this.listar();
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public List<Ciudad> getListaCiudades() {
		return listaCiudades;
	}

	public void setListaCiudades(List<Ciudad> listaCiudades) {
		this.listaCiudades = listaCiudades;
	}	
	
}
