package co.simplon.poleEmploi.patrimoine.modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "CITIES")
public class Ville {

	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY )
	private Long id;
	@Column (name = "NAME")
	private String nom;
	@Column (name = "LONGITUDE")
	private double longitude;
	@Column (name = "LATITUDE")
	private double latitude; 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
}
