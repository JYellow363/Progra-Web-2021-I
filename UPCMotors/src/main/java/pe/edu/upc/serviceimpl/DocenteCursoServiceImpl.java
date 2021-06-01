package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IDocenteCursoDao;
import pe.edu.upc.entity.DocenteCurso;
import pe.edu.upc.service.IDocenteCursoService;

@Named
@RequestScoped

public class DocenteCursoServiceImpl implements IDocenteCursoService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IDocenteCursoDao mD;
	
	@Override
	public void insertar(DocenteCurso docentecurso) {
		mD.insertar(docentecurso);
	}

	@Override
	public List<DocenteCurso> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idDocenteCurso) {
		mD.eliminar(idDocenteCurso);		
	}

}
