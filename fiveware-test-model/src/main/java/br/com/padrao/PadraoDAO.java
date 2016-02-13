package br.com.padrao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PadraoDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("fireware");

	protected EntityManager manager;

	public PadraoDAO() {
		manager = factory.createEntityManager();
	}

	public void insert(Object product) {
		manager.getTransaction().begin();
		manager.persist(product);
		manager.getTransaction().commit();
	}

	public void delete(Object product) {
		manager.getTransaction().begin();
		manager.remove(product);
		manager.getTransaction().commit();
	}

	public void update(Object product) {
		manager.getTransaction().begin();
		manager.merge(product);
		manager.getTransaction().commit();
	}

	public Object findByPK(Class<?> c, Object obj) {
		
		manager.getTransaction().begin();
		Object o = manager.find(c, obj);
		manager.getTransaction().commit();

		return o;
	}

	// public ArrayList<Class> findAll() {
	// Query query = _entityManager.createQuery("from Product" );
	// return (ArrayList&lt;Product&gt;) query.getResultList();
	// }
	//
	// public EntityManagerFactory get_entityManagerFactory() {
	// return _entityManagerFactory;
	// }
	//
	// public void set_entityManagerFactory(EntityManagerFactory managerFactory)
	// {
	// _entityManagerFactory = managerFactory;
	// }
	//
	// public EntityManager get_entityManager() {
	// return _entityManager;
	// }
	//
	// public void set_entityManager(EntityManager manager) {
	// _entityManager = manager;
	// }

}
