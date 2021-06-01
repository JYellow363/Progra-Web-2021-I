package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Departamento;
import pe.edu.upc.service.IDepartamentoService;

@Named
@RequestScoped
public class DepartamentoController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IDepartamentoService mService;
	private Departamento departamento;
	List<Departamento> listaDepartamentos;
	
	@PostConstruct
	public void init() {
		this.listaDepartamentos = new ArrayList<Departamento>();
		this.departamento = new Departamento();
		this.listar();
	}
	
	public String nuevoDepartamento() {
		this.setDepartamento(new Departamento());
		return "departamento.xhtml";
	}
	
	public void insertar() {
		try {
			mService.insertar(departamento);
			limpiarDepartamento();
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void listar() {
		try {
			listaDepartamentos = mService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void limpiarDepartamento() {
		this.init();
	}
	
	public void eliminar(Departamento de) {
		try {
			mService.eliminar(de.getIdDepartamento());
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Departamento> getListaDepartamentos() {
		return listaDepartamentos;
	}

	public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
		this.listaDepartamentos = listaDepartamentos;
	}

	
}
