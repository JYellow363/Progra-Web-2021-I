package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IParteDao;
import pe.edu.upc.entity.Parte;
import pe.edu.upc.service.IParteService;

@Named
@RequestScoped

public class ParteServiceImpl implements IParteService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IParteDao mD;
	
	@Override
	public void insertar(Parte parte) {
		mD.insertar(parte);
	}

	@Override
	public List<Parte> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idParte) {
		mD.eliminar(idParte);
	}

}
