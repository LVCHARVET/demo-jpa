package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnexionJpa {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		Regions r = em.find(Regions.class, 3);
		if (r != null) {
			System.out.println(r);
		}
		
		em.getTransaction().begin();
		
		Regions newRegion = new Regions();
		newRegion.setNomRegion("Valorant");
		
		em.persist(newRegion);

		em.getTransaction().commit();
		em.close();
		entityManagerFactory.close();

	}

}
