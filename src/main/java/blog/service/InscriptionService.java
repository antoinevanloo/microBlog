package blog.service;

import blog.InscriptionInvalideException;
import blog.modele.Personne;

public class InscriptionService {
	
	public Personne inscrire(String nom,String prenom, String motDePasse, String confirmationMotDePasse, boolean approbation) throws InscriptionInvalideException {
		InscriptionInvalideException ex = new InscriptionInvalideException();
		
		if (nom == null || ! nom.contains("@")) {
			ex.addMessage("nom", "Le nom est invalide !");
		}
		if (prenom == null || ! prenom.contains("@")) {
			ex.addMessage("prenom", "Le prenom est invalide !");
		}
		if (motDePasse == null || motDePasse.length() < 8) {
			ex.addMessage("motDePasse", "Le mot de passe doit contenir au moins 8 caractères !");
		}
		if (!motDePasse.equals(confirmationMotDePasse)) {
			ex.addMessage("confirmationMotDePasse", "Les deux mots de passe ne sont pas identiques !");
		}
		if (! approbation) {
			ex.addMessage("approbation", "Vous devez accepter les conditions.");
		}
		if (ex.mustBeThrown()) {
			throw ex;
		}
		
		Personne personne =  new Personne();
		personne.setMdp(motDePasse);
		personne.setNom(nom);
		personne.setPrenom(prenom);
		return personne;
	}
	
}
