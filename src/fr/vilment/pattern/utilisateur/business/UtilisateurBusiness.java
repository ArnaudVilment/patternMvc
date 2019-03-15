package fr.vilment.pattern.utilisateur.business;

import java.util.ArrayList;

import fr.vilment.pattern.utilisateur.beans.Utilisateur;
import fr.vilment.pattern.utilisateur.business.impl.IUtilisateurBusiness;


public class UtilisateurBusiness implements IUtilisateurBusiness {

	public ArrayList<Utilisateur> getUtilisateurs() {
		
		ArrayList<Utilisateur> Utilisateurs = new ArrayList<Utilisateur>();
		String dossierImg = "ressources/images/utilisateur/";
		
		Utilisateur julia = new Utilisateur("Julia Roberts", dossierImg + "juliaRoberts.jpg");
		Utilisateur morgan = new Utilisateur("Morgan Freeman", dossierImg + "morganFreeman.jpg");
		Utilisateur robert = new Utilisateur("Robert Deniro", dossierImg + "robertDeniro.jpg");
		Utilisateur tom = new Utilisateur("Tom Hanks", dossierImg + "tomHanks.jpg");
		
		Utilisateurs.add(julia);
		Utilisateurs.add(morgan);
		Utilisateurs.add(robert);
		Utilisateurs.add(tom);
		
		return Utilisateurs;
	}
}
