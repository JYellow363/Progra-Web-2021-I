package pe.edu.upc.serviceimpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.model.Ciudad;
import pe.edu.upc.repository.ICiudadRepository;
import pe.edu.upc.service.ICiudadService;

@Service
public class CiudadServiceImpl implements ICiudadService {

	@Autowired
	private ICiudadRepository dCiudad;

	@Override
	@Transactional
	public boolean registrar(Ciudad ciudad) {
		Ciudad objCiudad = dCiudad.save(ciudad);
		if (objCiudad == null)
			return false;
		else
			return true;
	}

	@Override
	@Transactional
	public void eliminar(int idCiudad) {
		dCiudad.deleteById(idCiudad);

	}

	@Override
	public Optional<Ciudad> listarId(int idCiudad) {
		return dCiudad.findById(idCiudad);
	}

	@Override
	public List<Ciudad> listar() {
		return dCiudad.findAll();
	}

}
