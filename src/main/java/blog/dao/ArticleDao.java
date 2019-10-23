package blog.dao;

import java.util.List;

import javax.persistence.EntityManager;

import blog.modele.Article;

public class ArticleDao {
	
private EntityManager em;
	
	public ArticleDao(EntityManager em) {
		this.em = em;
	}
	
	public Article get(Integer id) {
		return em.find(Article.class, id);
	}
	
	public List<Article> get() {
		return em.createQuery("select u from Utilisateur u", Article.class)
				.getResultList();
	}
	
	public void create(Article a) {
		em.persist(a);
	}
	
	public void supprimer(Article a) {
		em.remove(a);
	}
}
