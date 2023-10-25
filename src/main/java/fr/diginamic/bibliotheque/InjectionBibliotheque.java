package fr.diginamic.bibliotheque;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class InjectionBibliotheque {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque");
		EntityManager em = emf.createEntityManager();

		TypedQuery<Emprunt> query = em.createQuery("SELECT e FROM Emprunt e JOIN e.clients c WHERE c.id=:p",
				Emprunt.class);
		query.setParameter("p", 1);
		List<Emprunt> arrayEmprunts = query.getResultList();

		for (Emprunt emprunts : arrayEmprunts) {
			System.out.println(emprunts);
		}

		em.close();
		emf.close();

	}
}