package co.simplon.poleEmploi.patrimoine.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DaoFactory {

	private EntityManagerFactory emf;
	private EntityManager em;
	private static final String PERSISTANCE_UNIT_NAME = "BasePatrimoine";
	
	public DaoFactory() {
		// Création d'une instance de l'unité de persistence PERSISTANCE_UNIT_NAME décrite dans le fichier de conf persistence.xml
		// idéalement, instanciation de l'interface emf à réalisation à l'initialisation de l'application
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
		}
		// ouverture d'une connection vers la BDD
		em = emf.createEntityManager();
	}
	
	
	/**
	 * Accesseur 
	 * @return EntityManager
	 */
	public EntityManager getEntityManager() {
		return em;
	}
	
	/**
	 * Libération des ressources
	 */
	public void closeEntityManager() {
		if (em != null) {
			em.close();
		}
	}
	public void closeEntityManagerFactory() {
		if (emf != null) {
			emf.close();
		}
	}

	/**
	 * 
	 * @return
	 */
	public VilleDao getVilleDao () {
		return new VilleJpaDao(this);
	}

}
