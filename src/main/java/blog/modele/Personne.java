package blog.modele;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Personne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer personneId;
	
	private String mdp;
	
	private String nom;
	
	private String prenom;
	
	@OneToMany
	private List<Article> articles = new ArrayList<>();

	public Personne() {
		super();
	}

	public Integer getPersonneId() {
		return personneId;
	}

	public void setPersonneId(Integer personneId) {
		this.personneId = personneId;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
}
