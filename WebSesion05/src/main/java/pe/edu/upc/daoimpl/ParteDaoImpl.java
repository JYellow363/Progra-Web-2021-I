package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IParteDao;
import pe.edu.upc.entity.Parte;

public class ParteDaoImpl implements IParteDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="b")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Parte parte) {
		em.persist(parte);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Parte> listar() {
		List<Parte> lista = new ArrayList<Parte>();
		Query q =em.createQuery("select p from Parte p");
		lista = (List<Parte>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idParte) {
		Parte parte = new Parte();
		parte = em.getReference(Parte.class, idParte);
		em.remove(parte);
	}

}
