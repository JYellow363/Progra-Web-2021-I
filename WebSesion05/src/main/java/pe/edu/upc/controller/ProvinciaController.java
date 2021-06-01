package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Departamento;
import pe.edu.upc.entity.Provincia;
import pe.edu.upc.service.IDepartamentoService;
import pe.edu.upc.service.IProvinciaService;

@Named
@RequestScoped
public class ProvinciaController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IDepartamentoService mService;
	
	@Inject
	private IProvinciaService pService;
			
	private Departamento departamento;
	private Provincia provincia;
	
	List<Departamento> listaDepartamentos;
	List<Provincia> listaProvincias;
	
	@PostConstruct
	public void init() {
		departamento = new Departamento();
		provincia = new Provincia();
		listaDepartamentos = new ArrayList<Departamento>();
		listaProvincias = new ArrayList<Provincia>();
		
		this.listar();
		this.listProvincia();
	}
	
	public String nuevoProvincia() {
		this.setProvincia(new Provincia());
		return "provincia.xhtml";
	}
	
	public void insertar() {
		try {
			pService.insertar(provincia);
			limpiarProvincia();
			this.listProvincia();
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
	
	public void listProvincia() {
		try {
			listaProvincias = pService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarProvincia() {
		this.init();
	}
	
	public void eliminar(Provincia provincia) {
		try {
			pService.eliminar(provincia.getIdProvincia());
			this.listProvincia();
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

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public List<Departamento> getListaDepartamentos() {
		return listaDepartamentos;
	}

	public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
		this.listaDepartamentos = listaDepartamentos;
	}

	public List<Provincia> getListaProvincias() {
		return listaProvincias;
	}

	public void setListaProvincias(List<Provincia> listaProvincias) {
		this.listaProvincias = listaProvincias;
	}
	
}
