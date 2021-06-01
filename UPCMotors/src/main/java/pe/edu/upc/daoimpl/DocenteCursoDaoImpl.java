package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDocenteCursoDao;
import pe.edu.upc.entity.DocenteCurso;

public class DocenteCursoDaoImpl implements IDocenteCursoDao, Serializable {
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(DocenteCurso docentecurso) {
		em.persist(docentecurso);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DocenteCurso> listar() {
		List<DocenteCurso> lista = new ArrayList<DocenteCurso>();
		Query q = em.createQuery("select dc from DocenteCurso dc");
		lista = (List<DocenteCurso>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idDocenteCurso) {
		DocenteCurso docentecurso = new DocenteCurso();
		docentecurso= em.getReference(DocenteCurso.class, idDocenteCurso);
		em.remove(docentecurso);		
	}

}
