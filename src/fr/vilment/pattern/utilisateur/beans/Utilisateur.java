package fr.vilment.pattern.utilisateur.beans;

public class Utilisateur {

	String nom;
	String urlImg;
	
	public Utilisateur(String nom, String urlImg) {
		super();
		this.nom = nom;
		this.urlImg = urlImg;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getUrlImg() {
		return urlImg;
	}

	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
}
