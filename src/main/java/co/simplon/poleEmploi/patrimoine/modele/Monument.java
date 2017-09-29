package co.simplon.poleEmploi.patrimoine.modele;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the monuments database table.
 * 
 */
@Entity
@Table(name="monuments")
@NamedQuery(name="Monument.findAll", query="SELECT m FROM Monument m")
public class Monument implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name="CITIES_ID")
	private int citiesId;

	@Column (name = "NAME")
	private String nom;

	public Monument() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCitiesId() {
		return this.citiesId;
	}

	public void setCitiesId(int citiesId) {
		this.citiesId = citiesId;
	}

	public String getNom() {
		return this.nom;
	}

	public void setName(String nom) {
		this.nom = nom;
	}

}