package co.simplon.poleEmploi.patrimoine;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import co.simplon.poleEmploi.patrimoine.dao.DaoFactory;

public class DaoFactoryTest {
	private static DaoFactory dao;
	
	@Before
	public void setUp() {
		System.out.println("Démarrage du test BDD");
	}
	
	@Test
	public void testVide() {	
		dao = new DaoFactory();
		assertNotNull(dao.getEntityManager());
		System.out.println("Test => La connection et l'accès à la BDD via fabrique DAO pour accéder aux services villes, monuments...");
	}
	@After
	public void tearDown() {
		System.out.println("Fermeture EntityManager");
		dao.closeEntityManager();
	}
	@AfterClass
	public static void afterAll() {
		System.out.println("Fermeture EntityManagerFactory");
		dao.closeEntityManagerFactory();
	}
	
}
