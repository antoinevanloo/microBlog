package blog.dao;

import javax.persistence.EntityManager;

import blog.modele.Personne;

public class PersonneDao {

	private EntityManager em;
	
	public PersonneDao(EntityManager em) {
		
		this.em = em;
	}
	
	public Personne get(Integer id) {
		return em.find(Personne.class, id);
	}
	
	public void create(Personne p) {
		em.persist(p);
	}
	
	public void supprimer(Personne p) {
		em.remove(p);
	}
}
