package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ICiudadDao;
import pe.edu.upc.entity.Ciudad;

public class CiudadDaoImpl implements ICiudadDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="b")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Ciudad ciudad) {
		em.persist(ciudad);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ciudad> listar() {
		List<Ciudad> lista = new ArrayList<Ciudad>();
		Query q =em.createQuery("select c from Ciudad c");
		lista = (List<Ciudad>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idCiudad) {
		Ciudad ciudad= new Ciudad();
		ciudad = em.getReference(Ciudad.class, idCiudad);
		em.remove(ciudad);
	}

}
