package fr.diginamic.bibliotheque;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "COMPO")

public class Compo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", length = 10)
	private int id;

	@ManyToOne
	@JoinColumn(name = "ID_LIVRE", referencedColumnName = "ID")
	private Livre livre;

	@ManyToOne
	@JoinColumn(name = "ID_EMPRUNT", referencedColumnName = "ID")
	private Emprunt emprunt;

	public Compo() {
	}

	@Override
	public String toString() {
		return "Compo [id=" + id + ", livre=" + livre + ", emprunt=" + emprunt + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Livre getLivre() {
		return livre;
	}

	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	public Emprunt getEmprunt() {
		return emprunt;
	}

	public void setEmprunt(Emprunt emprunt) {
		this.emprunt = emprunt;
	}

}
