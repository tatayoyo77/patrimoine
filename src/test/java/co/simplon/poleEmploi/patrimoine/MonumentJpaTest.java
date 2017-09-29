package co.simplon.poleEmploi.patrimoine;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import co.simplon.poleEmploi.patrimoine.modele.Monument;

public class MonumentJpaTest {
	private Long idRecherche;
	private EntityManagerFactory emf;
	private EntityManager em;
	
	@Before
	public void setUp() throws Exception {
		System.out.println("------------------");
		emf = Persistence.createEntityManagerFactory("BasePatrimoine");
		em = emf.createEntityManager();
	}

	@Test
	public void le_monument_109_estPyramide() {
		// GIVEN
		idRecherche = 109L;

		// WHEN		
		Monument monument = em.find(Monument.class, idRecherche);

		// THEN
		assertEquals(idRecherche, monument.getId());
		assertEquals("Pyramide", monument.getNom());
		assertEquals(33914, monument.getCitiesId());
	}
	
}
