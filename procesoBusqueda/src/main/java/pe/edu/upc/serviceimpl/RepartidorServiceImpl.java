package pe.edu.upc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.model.Repartidor;
import pe.edu.upc.repository.IRepartidorRepository;
import pe.edu.upc.service.IRepartidorService;

@Service
public class RepartidorServiceImpl implements IRepartidorService {

	@Autowired
	private IRepartidorRepository rR;

	@Override
	@Transactional
	public Integer insertar(Repartidor repartidor) {
		int rpta = rR.searchRucRepartidor(repartidor.getRuc());
		if (rpta == 0)
			rR.save(repartidor);
		return rpta;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Repartidor> listar() {
		List<Repartidor> lista = rR.findAll();
		for (Repartidor r : lista) {
			double calculo;
			int cantidadEntregas = r.getCantidad();
			calculo = cantidadEntregas * r.getMontoPagar();

			if (cantidadEntregas >= 8 && cantidadEntregas <= 10) {
				calculo = calculo * 1.10;
			}

			if (cantidadEntregas >= 11 && cantidadEntregas <= 14) {
				calculo = calculo * 1.12;
			}

			if (cantidadEntregas >= 15) {
				calculo = calculo * 1.15;
			}

			r.setNetoPagar(calculo);
		}
		return lista;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Repartidor> findByName(String nameRepartidor) {
		List<Repartidor> lista = rR.findByName(nameRepartidor);
		for (Repartidor r : lista) {
			double calculo;
			int cantidadEntregas = r.getCantidad();
			calculo = cantidadEntregas * r.getMontoPagar();

			if (cantidadEntregas >= 8 && cantidadEntregas <= 10) {
				calculo = calculo * 1.10;
			}

			if (cantidadEntregas >= 11 && cantidadEntregas <= 14) {
				calculo = calculo * 1.12;
			}

			if (cantidadEntregas >= 15) {
				calculo = calculo * 1.15;
			}

			r.setNetoPagar(calculo);
		}
		return lista;
	}

	@Override
	public List<Repartidor> findByRUC(String ruc) {
		List<Repartidor> lista = rR.findByRUC(ruc);
		for (Repartidor r : lista) {
			double calculo;
			int cantidadEntregas = r.getCantidad();
			calculo = cantidadEntregas * r.getMontoPagar();

			if (cantidadEntregas >= 8 && cantidadEntregas <= 10) {
				calculo = calculo * 1.10;
			}

			if (cantidadEntregas >= 11 && cantidadEntregas <= 14) {
				calculo = calculo * 1.12;
			}

			if (cantidadEntregas >= 15) {
				calculo = calculo * 1.15;
			}

			r.setNetoPagar(calculo);
		}
		return lista;
	}
}
