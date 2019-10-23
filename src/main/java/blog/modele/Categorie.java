package blog.modele;

public class Categorie {
	
	private Integer categorieId;
	
	private String libelle;

	public Categorie() {
		super();
	}

	public Integer getCategorieId() {
		return categorieId;
	}

	public void setCategorieId(Integer categorieId) {
		this.categorieId = categorieId;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
