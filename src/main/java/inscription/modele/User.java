package inscription.modele;

import java.util.Date;

public class User {

	private String email;
	private String motDePasse;
	private Date date;
	
	public User(String email, String password) {
		this.email = email;
		this.motDePasse = password;
		this.date = new Date();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
