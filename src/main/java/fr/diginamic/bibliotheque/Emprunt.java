package fr.diginamic.bibliotheque;

import java.security.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPRUNT")
public class Emprunt {

	@Id
	int id;

	@Column(name = "DATE_DEBUT", nullable = false)
	Timestamp dateDebut;

	@Column(name = "DELAI", length = 10)
	int delai;

	@Column(name = "DATE_FIN")
	Timestamp dateFin;

	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	Client clients;

	@ManyToMany(mappedBy = "emprunts")
	List<Livre> livres;

	public Emprunt() {
	}

	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", dateDebut=" + dateDebut + ", delai=" + delai + ", dateFin=" + dateFin
				+ ", clients=" + clients + ", livres=" + livres + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Timestamp dateDebut) {
		this.dateDebut = dateDebut;
	}

	public int getDelai() {
		return delai;
	}

	public void setDelai(int delai) {
		this.delai = delai;
	}

	public Timestamp getDateFin() {
		return dateFin;
	}

	public void setDateFin(Timestamp dateFin) {
		this.dateFin = dateFin;
	}

	public Client getClients() {
		return clients;
	}

	public void setClients(Client clients) {
		this.clients = clients;
	}

	public List<Livre> getLivres() {
		return livres;
	}

	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}

}
