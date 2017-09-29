package co.simplon.poleEmploi.patrimoine.dao;

import javax.persistence.EntityManager;

import co.simplon.poleEmploi.patrimoine.modele.Ville;

public class VilleJpaDao implements VilleDao {
	private EntityManager em;
	private DaoFactory daoFactory;
	
	
	/*
	 * Accès BDD
	 */
	public VilleJpaDao(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
		
	}


	@Override
	public Ville getVilleById(Long id) {
		Ville ville;
		
		try {
			em = daoFactory.getEntityManager();
			ville = em.find(Ville.class, id);
		} finally {
			daoFactory.closeEntityManager();
		}
		return ville;
	}

	@Override
	public Ville createVille(Ville ville) {
		try {
		      em = daoFactory.getEntityManager();
		      em.getTransaction().begin();
		      em.persist(ville);
		      em.getTransaction().commit();
		      
		   } finally {
		      daoFactory.closeEntityManager();
		   }
		return ville;
	}

	@Override
	public void updateVille(Ville ville) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteVille(Long id) {
		// TODO Auto-generated method stub

	}

}
