package co.simplon.poleEmploi.patrimoine.dao;

import co.simplon.poleEmploi.patrimoine.modele.Ville;

public interface VilleDao {
	Ville getVilleById (Long id);
	Ville createVille (Ville ville);
	void updateVille (Ville ville);
	void deleteVille (Long id);

}
