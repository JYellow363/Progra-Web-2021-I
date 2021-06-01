package pe.edu.upc.controller;



import java.io.Serializable;

import java.util.ArrayList;

import java.util.List;



import javax.annotation.PostConstruct;

import javax.enterprise.context.RequestScoped;

import javax.inject.Inject;

import javax.inject.Named;



import pe.edu.upc.entity.Propietario;

import pe.edu.upc.entity.Automovil;



import pe.edu.upc.service.IPropietarioService;

import pe.edu.upc.service.IAutomovilService;



@Named

@RequestScoped



public class AutomovilController implements Serializable {



	private static final long serialVersionUID = 1L;

	

	@Inject

	private IPropietarioService pService;

	

	@Inject

	private IAutomovilService aService;	

	

	private Propietario propietario;

	private Automovil automovil;

	

	List<Propietario> listaPropietarios;

	List<Automovil> listaAutomoviles;

	

	@PostConstruct

	public void init() {

		propietario = new Propietario();

		automovil = new Automovil();

		

		listaPropietarios = new ArrayList<Propietario>();

		listaAutomoviles= new ArrayList<Automovil>();

		

		this.listar();

		this.listAutomovil();

	}

	

	public String nuevoAutomovil() {

		this.setAutomovil(new Automovil());

		return "automovil.xhtml";

	}

	

	public void insertar() {

		aService.insertar(automovil);

		limpiarAutomovil();

		this.listAutomovil();

	}

	

	public void listar() {

		listaPropietarios = pService.listar();

	}

	

	public void listAutomovil() {

		listaAutomoviles = aService.listar();

	}

	

	public void limpiarAutomovil() {

		this.init();

	}

	

	public void eliminar(Automovil automovil) {

		aService.eliminar(automovil.getIdAutomovil());

		this.listAutomovil();

	}



	public Propietario getPropietario() {

		return propietario;

	}



	public void setPropietario(Propietario propietario) {

		this.propietario = propietario;

	}



	public Automovil getAutomovil() {

		return automovil;

	}



	public void setAutomovil(Automovil automovil) {

		this.automovil = automovil;

	}



	public List<Propietario> getListaPropietarios() {

		return listaPropietarios;

	}



	public void setListaPropietarios(List<Propietario> listaPropietarios) {

		this.listaPropietarios = listaPropietarios;

	}



	public List<Automovil> getListaAutomoviles() {

		return listaAutomoviles;

	}



	public void setListaAutomoviles(List<Automovil> listaAutomoviles) {

		this.listaAutomoviles = listaAutomoviles;

	}



}
