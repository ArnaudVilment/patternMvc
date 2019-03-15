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
 * Servlet implementation class ProduitsServlet
 */
@WebServlet("/produits")
public class ProduitsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProduitBusiness produits = new ProduitBusiness();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProduitsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<Produit> listProduit = produits.getProduits();
		
		request.setAttribute("listProduit", listProduit);
		request.getServletContext().getRequestDispatcher("/WEB-INF/pages/produit/listProduit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
