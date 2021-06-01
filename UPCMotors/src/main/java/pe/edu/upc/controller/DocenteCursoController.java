package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Docente;
import pe.edu.upc.entity.Curso;
import pe.edu.upc.entity.DocenteCurso;


import pe.edu.upc.service.IDocenteService;
import pe.edu.upc.service.ICursoService;
import pe.edu.upc.service.IDocenteCursoService;

@Named
@RequestScoped
public class DocenteCursoController implements Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IDocenteService dService;

	@Inject
	private ICursoService cService;	

	@Inject
	private IDocenteCursoService dcService;	

	private Docente docente;
	private Curso curso;
	private DocenteCurso docentecurso;

	List<Docente> listaDocentes;
	List<Curso> listaCursos;
	List<DocenteCurso> listaDocenteCursos;

	@PostConstruct
	public void init() {
		System.out.println("init");
		docente = new Docente();
		curso = new Curso();
		docentecurso= new DocenteCurso();

		listaDocentes = new ArrayList<Docente>();
		listaCursos= new ArrayList<Curso>();
		listaDocenteCursos = new ArrayList<DocenteCurso>();
		
		this.listDocenteCurso();
		this.listDocente();
		this.listCurso();
	}

	public String nuevoDocenteCurso() {
		System.out.println("nuevo docente-curso");
		this.setDocentecurso(new DocenteCurso());
		System.out.println("antes de devolver el string");
		return "docenteCurso.xhtml";
	}

	public void insertar() {
		System.out.println("Método insertar");
		dcService.insertar(docentecurso);
		limpiarDocenteCurso();
		this.listDocenteCurso();
	}

	public void listDocenteCurso() {
		listaDocenteCursos = dcService.listar();
	}

	public void listDocente() {
		listaDocentes = dService.listar();
	}
	
	public void listCurso() {
		listaCursos = cService.listar();
	}

	public void limpiarDocenteCurso() {
		this.init();
	}

	public void eliminar(DocenteCurso docentecurso) {
		dcService.eliminar(docentecurso.getIdDocenteCurso());
		this.listDocenteCurso();
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public DocenteCurso getDocentecurso() {
		return docentecurso;
	}

	public void setDocentecurso(DocenteCurso docentecurso) {
		this.docentecurso = docentecurso;
	}

	public List<Docente> getListaDocentes() {
		return listaDocentes;
	}

	public void setListaDocentes(List<Docente> listaDocentes) {
		this.listaDocentes = listaDocentes;
	}

	public List<Curso> getListaCursos() {
		return listaCursos;
	}

	public void setListaCursos(List<Curso> listaCursos) {
		this.listaCursos = listaCursos;
	}

	public List<DocenteCurso> getListaDocenteCursos() {
		return listaDocenteCursos;
	}

	public void setListaDocenteCursos(List<DocenteCurso> listaDocenteCursos) {
		this.listaDocenteCursos = listaDocenteCursos;
	}

	
}
