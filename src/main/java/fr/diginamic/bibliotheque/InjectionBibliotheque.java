package fr.diginamic.bibliotheque;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InjectionBibliotheque {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque");
		EntityManager em = emf.createEntityManager();
		
		Livre l = em.find(Livre.class, 1);
		if (l != null) {
			System.out.println(l);
		}
	}
}