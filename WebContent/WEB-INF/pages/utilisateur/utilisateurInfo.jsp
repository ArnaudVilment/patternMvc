<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Information de l'utililsateur</title>
<link rel="stylesheet" href="ressources/css/utilisateur/utilisateurInfo.css"/>
</head>
<body>
	<h1>Information de l'utilisateur</h1>
	
	<div class="block_produit">
       	<img src="${ utilisateur.urlImg }"/>
       	<div class="description">${ utilisateur.nom }</div>
   	</div>
	<br/>
	 <br/>
	 <a href="utilisateurs">retour</a>
</body>
</html>