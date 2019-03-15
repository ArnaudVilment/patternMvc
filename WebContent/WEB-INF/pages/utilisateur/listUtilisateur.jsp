<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des utilisateurs</title>
<link rel="stylesheet" href="ressources/css/utilisateur/utilisateur.css"/>
</head>
<body>
	<h1>Liste des utilisateurs</h1>
	
	<c:forEach items="${ listUtilisateur }" var="mapUtilisateurs" varStatus="boucle">
	    
        <%-- Affichage des propriétés du bean Produit --%>       
        <div class="block_produit">
        	<a href="utilisateurInfo?id=${ boucle.index }"><img src="${ mapUtilisateurs.urlImg }"/></a>
        	<div class="description">${ mapUtilisateurs.nom }</div>
    	</div>
	        
	 </c:forEach>
	 <br/>
	 <br/>
	 <a href="accueil">Accueil</a>
</body>
</html>