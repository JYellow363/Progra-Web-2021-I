package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IDocenteDao;
import pe.edu.upc.entity.Docente;
import pe.edu.upc.service.IDocenteService;

@Named
@RequestScoped

public class DocenteServiceImpl implements IDocenteService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IDocenteDao mD;
	
	@Override
	public void insertar(Docente docente) {
		mD.insertar(docente);
	}

	@Override
	public List<Docente> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idDocente) {
		mD.eliminar(idDocente);		
	}

}
