package fr.vilment.pattern.produit.beans;

public class Produit {

	String nom;
	String urlImg;
	
	public Produit(String nom, String urlImg) {
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
