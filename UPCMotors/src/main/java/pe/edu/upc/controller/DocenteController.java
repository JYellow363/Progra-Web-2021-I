package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Docente;
import pe.edu.upc.service.IDocenteService;

@Named
@RequestScoped

public class DocenteController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IDocenteService mService;
	
	private Docente docente;
	List<Docente> listaDocentes;
	
	@PostConstruct
	public void init() {
		this.listaDocentes = new ArrayList<Docente>();
		this.docente = new Docente();
		this.listar();
	}
	
	public String nuevoDocente() {
		this.setDocente(new Docente());
		return "docente.xhtml";
	}
	
	public void insertar() {
		mService.insertar(docente);
		limpiarDocente();
		this.listar();
	}
	
	public void listar() {
		listaDocentes = mService.listar();
	}
	
	public void limpiarDocente() {
		this.init();
	}
	
	public void eliminar(Docente docente) {
		mService.eliminar(docente.getIdDocente());
		this.listar();
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public List<Docente> getListaDocentes() {
		return listaDocentes;
	}

	public void setListaDocentes(List<Docente> listaDocentes) {
		this.listaDocentes = listaDocentes;
	}

}
