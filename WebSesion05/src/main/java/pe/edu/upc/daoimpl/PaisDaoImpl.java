package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPaisDao;
import pe.edu.upc.entity.Pais;

public class PaisDaoImpl implements IPaisDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="b")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Pais pais) {
		em.persist(pais);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pais> listar() {
		List<Pais> lista = new ArrayList<Pais>();
		Query q =em.createQuery("select p from Pais p");
		lista = (List<Pais>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idPais) {
		Pais pais= new Pais();
		pais = em.getReference(Pais.class, idPais);
		em.remove(pais);
	}

}
