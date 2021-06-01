package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IMotorDao;
import pe.edu.upc.entity.Tormo;

public class MotorDaoImpl implements IMotorDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="b")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Tormo motor) {
		em.persist(motor);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tormo> listar() {
		List<Tormo> lista = new ArrayList<Tormo>();
		Query q =em.createQuery("select m from Tormo m");
		lista = (List<Tormo>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idMotor) {
		Tormo motor = new Tormo();
		motor = em.getReference(Tormo.class, idMotor);
		em.remove(motor);
	}

}
