package br.com.skeleton.business.repository;

import br.com.skeleton.business.entity.Entity_Equipamentos;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class SchemaGeneration {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("DeggaPersistence");
		EntityManager em = emf.createEntityManager();
		TypedQuery<Entity_Equipamentos> lista = em.createQuery("from Entity_Equipamentos", Entity_Equipamentos.class);

		System.out.println(lista);

		em.close();
		emf.close();
	}
}
