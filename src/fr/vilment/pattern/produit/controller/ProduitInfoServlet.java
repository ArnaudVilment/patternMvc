package fr.vilment.pattern.produit.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.vilment.pattern.produit.beans.Produit;
import fr.vilment.pattern.produit.business.ProduitBusiness;

/**
 * Servlet implementation class ProduitInfo
 */
@WebServlet("/produitInfo")
public class ProduitInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProduitBusiness produits = new ProduitBusiness();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProduitInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<Produit> listProduit = produits.getProduits();
		
		Produit produit = listProduit.get(Integer.parseInt(request.getParameter("id")));
		
		request.setAttribute("produit", produit);
		request.getServletContext().getRequestDispatcher("/WEB-INF/pages/produit/produitInfo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
