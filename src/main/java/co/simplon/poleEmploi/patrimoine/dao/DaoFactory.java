package co.simplon.poleEmploi.patrimoine.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DaoFactory {

	private EntityManagerFactory emf;
	private EntityManager em;
	private static final String PERSISTANCE_UNIT_NAME = "BasePatrimoine";
	
	public DaoFactory() {
		// Cr�ation d'une instance de l'unit� de persistence PERSISTANCE_UNIT_NAME d�crite dans le fichier de conf persistence.xml
		// id�alement, instanciation de l'interface emf � r�alisation � l'initialisation de l'application
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
	 * Lib�ration des ressources
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
