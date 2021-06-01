package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDocenteDao;
import pe.edu.upc.entity.Docente;

public class DocenteDaoImpl implements IDocenteDao, Serializable {
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Docente docente) {
		em.persist(docente);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Docente> listar() {
		List<Docente> lista = new ArrayList<Docente>();
		Query q = em.createQuery("select d from Docente d");
		lista = (List<Docente>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idDocente) {
		Docente docente = new Docente();
		docente= em.getReference(Docente.class, idDocente);
		em.remove(docente);		
	}

}
