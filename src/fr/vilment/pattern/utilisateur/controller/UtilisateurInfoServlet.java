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
 * Servlet implementation class UtilisateurInfoServlet
 */
@WebServlet("/utilisateurInfo")
public class UtilisateurInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UtilisateurBusiness utilisateurs = new UtilisateurBusiness();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UtilisateurInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<Utilisateur> listUtilisateur = utilisateurs.getUtilisateurs();
		
		Utilisateur utilisateur = listUtilisateur.get(Integer.parseInt(request.getParameter("id")));
		
		request.setAttribute("utilisateur", utilisateur);
		request.getServletContext().getRequestDispatcher("/WEB-INF/pages/utilisateur/utilisateurInfo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
