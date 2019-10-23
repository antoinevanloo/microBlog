<%@page pageEncoding="UTF-8" isErrorPage="true" contentType="text/html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
  <head>
  	<meta charset="UTF-8">
    <title>Java EE</title>
  </head>
  <body>
	<div>Votre user a bien été prise en compte le
		 <fmt:formatDate type="date" dateStyle="long" value="${user.date}"/> à
		 <fmt:formatDate type="time" value="${user.date}"/>
		 pour le nom <c:out value="${user.nom}"/>.
		 pour le prenom <c:out value="${user.prenom}"/>.
	</div>
	<div>
	  	<a href="<c:url value="/"/>">Retour à l'accueil</a>
	</div>
  </body>
</html>
