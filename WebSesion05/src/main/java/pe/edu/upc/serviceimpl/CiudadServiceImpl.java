package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ICiudadDao;
import pe.edu.upc.entity.Ciudad;
import pe.edu.upc.service.ICiudadService;

@Named
@RequestScoped

public class CiudadServiceImpl implements ICiudadService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private ICiudadDao mD;
	
	@Override
	public void insertar(Ciudad ciudad) {
		mD.insertar(ciudad);
	}

	@Override
	public List<Ciudad> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idCiudad) {
		mD.eliminar(idCiudad);
	}

}
