<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Information du Produit</title>
<link rel="stylesheet" href="ressources/css/produit/produitInfo.css"/>
</head>
<body>
	<h1>Informations du produit</h1>
	
	<div class="block_produit">
          <img src="${ produit.urlImg }"/>
       	<div class="description">${ produit.nom }</div>
   	</div>
	<br/>
	 <br/>
	 <a href="produits">retour</a>
</body>
</html>