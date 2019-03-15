package fr.vilment.pattern.produit.business;

import java.util.ArrayList;

import fr.vilment.pattern.produit.beans.Produit;
import fr.vilment.pattern.produit.business.impl.IProduitBusiness;

public class ProduitBusiness implements IProduitBusiness {

	public ArrayList<Produit> getProduits() {
		
		ArrayList<Produit> Produits = new ArrayList<Produit>();
		String dossierImg = "ressources/images/produit/";
		
		Produit axe = new Produit("Axe Spay", dossierImg + "axe.jpg");
		Produit cafe = new Produit("Cafe", dossierImg + "cafe.jpg");
		Produit evian = new Produit("Evian", dossierImg + "evian.jpg");
		Produit lait = new Produit("Lait", dossierImg + "lait.jpg");
		
		Produits.add(axe);
		Produits.add(cafe);
		Produits.add(evian);
		Produits.add(lait);
		
		return Produits;
	}
}
