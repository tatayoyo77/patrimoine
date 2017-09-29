package co.simplon.poleEmploi.patrimoine;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import co.simplon.poleEmploi.patrimoine.modele.Ville;

public class VilleJpaTest {
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
	public void la_ville_d_identifiant_25925_doit_etre_Forstfeld() {
		// GIVEN
		idRecherche = 25925L;

		// WHEN		
		Ville ville = em.find(Ville.class, idRecherche);

		// THEN
		assertEquals(idRecherche, ville.getId());
		assertEquals("Forstfeld", ville.getNom());
	}
	
	
	@Test
	public void la_ville_33_est_de_longitude_526667() {
		// GIVEN
		idRecherche = 33L;
		Ville villeATrouver = new Ville();
		villeATrouver.setId(idRecherche);
		villeATrouver.setNom("La Tranclière");
		villeATrouver.setLongitude(5.266667);
		villeATrouver.setLatitude(46.116667);

		// WHEN		
		Ville ville = em.find(Ville.class, villeATrouver.getId());

		// THEN
		assertEquals(villeATrouver.getId(), ville.getId());
		assertEquals(villeATrouver.getNom(), ville.getNom());		
		assertEquals(villeATrouver.getLongitude(), ville.getLongitude(), 0.0);		
		assertEquals(villeATrouver.getLatitude(), ville.getLatitude(), 0.0);
	}
}
