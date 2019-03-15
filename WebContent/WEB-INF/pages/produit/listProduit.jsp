<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des produits</title>
<link rel="stylesheet" href="ressources/css/produit/produit.css"/>
</head>
<body>
	<h1>Liste des produits</h1>
	
	<c:forEach items="${ listProduit }" var="mapProduits" varStatus="boucle">
	    
        <%-- Affichage des propriétés du bean Produit --%>         	
    	<div class="block_produit">
           	<a href="produitInfo?id=${ boucle.index }"><img src="${ mapProduits.urlImg }"/></a>
        	<div class="description">${ mapProduits.nom }</div>
    	</div>
	        
	 </c:forEach>
	 <br/>
	 <br/>
	 <a href="accueil">Accueil</a>
</body>
</html>