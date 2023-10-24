package fr.diginamic.bibliotheque;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LIVRE")
public class Livre {

	@Id
	int id;

	@Column(name = "TITRE", length = 255, nullable = false)
	String titre;

	@Column(name = "AUTEUR", length = 50, nullable = false)
	String auteur;

	@ManyToMany
	@JoinTable(name = "COMPO", joinColumns = @JoinColumn(name = "ID_LIVRE", referencedColumnName = "ID"), 
	inverseJoinColumns = @JoinColumn(name = "ID_EMPRUNT", referencedColumnName = "ID"))
	List<Emprunt> emprunts;
	
	
	public Livre() {
	}

	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

}
