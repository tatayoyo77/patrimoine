package co.simplon.poleEmploi.patrimoine;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import co.simplon.poleEmploi.patrimoine.dao.DaoFactory;
import co.simplon.poleEmploi.patrimoine.dao.VilleDao;
import co.simplon.poleEmploi.patrimoine.modele.Ville;

public class VilleDaoJpaTest {
	private Long idRecherche;
	private VilleDao villeDao;
	private DaoFactory dao;
	
	@Before
	public void setUp() throws Exception {
		System.out.println("------------------");
		dao = new DaoFactory();
		villeDao = dao.getVilleDao();
	}

	@Test
	public void test_getVilleById() {
		// GIVEN
		idRecherche = 1965L;

		// WHEN		
		Ville ville = villeDao.getVilleById(idRecherche);

		// THEN
		assertEquals(idRecherche, ville.getId());
		assertEquals("Furmeyer", ville.getNom());
		
	}
	@Test
	public void test_createVille() {
		//33979
		// GIVEN		
		Ville ville = new Ville();
		ville.setId(null);
		ville.setNom("Test createVille(ville)");
		ville.setLongitude(5.266667);
		ville.setLatitude(46.116667);

		//WHEN
		villeDao.createVille(ville);
		
		// THEN
		System.out.println(ville);
		assertEquals("Test createVille(ville)", ville.getNom());
		
	}
}
