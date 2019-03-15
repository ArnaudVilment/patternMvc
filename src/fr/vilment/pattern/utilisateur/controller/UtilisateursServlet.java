package fr.vilment.pattern.utilisateur.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.vilment.pattern.utilisateur.beans.Utilisateur;
import fr.vilment.pattern.utilisateur.business.UtilisateurBusiness;

/**
 * Servlet implementation class UtilisateursServlet
 */
@WebServlet("/utilisateurs")
public class UtilisateursServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UtilisateurBusiness utilisateurs = new UtilisateurBusiness();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UtilisateursServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<Utilisateur> listUtilisateur = utilisateurs.getUtilisateurs();
		
		request.setAttribute("listUtilisateur", listUtilisateur);
		request.getServletContext().getRequestDispatcher("/WEB-INF/pages/utilisateur/listUtilisateur.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
