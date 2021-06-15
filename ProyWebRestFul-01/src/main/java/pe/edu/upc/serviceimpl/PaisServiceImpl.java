package pe.edu.upc.serviceimpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.model.Pais;
import pe.edu.upc.repository.IPaisRepository;
import pe.edu.upc.service.IPaisService;

@Service
public class PaisServiceImpl implements IPaisService {

	@Autowired
	private IPaisRepository dPais;

	@Override
	@Transactional
	public boolean registrar(Pais pais) {
		Pais objPais = dPais.save(pais);
		if (objPais == null)
			return false;
		else
			return true;
	}

	@Override
	@Transactional
	public void eliminar(int idPais) {
		dPais.deleteById(idPais);

	}

	@Override
	public Optional<Pais> listarId(int idPais) {
		return dPais.findById(idPais);
	}

	@Override
	public List<Pais> listar() {
		return dPais.findAll();
	}

}
