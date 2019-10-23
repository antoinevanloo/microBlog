<%@page pageEncoding="UTF-8" isErrorPage="true" contentType="text/html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Java EE</title>
</head>
<body>
<header>
    <jsp:include page="WEB-INF/jsp/menu.jsp"/>
</header>
    <table border="1">
        <thead>
        <tr>
            <th>titre</th>
            <th>contenu</th>
            <th>categorie</th>
            <th>personneId</th>
            <th>date de publication</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="article" items="${articles}">
            <tr>
                <td><c:out value="${article.titre}"/></td>
                <td><c:out value="${article.contenu}"/></td>
                <td><c:out value="${article.categorie}"/></td>
                <td><c:out value="${article.personne}"/></td>
                <td><c:out value="${article.datePublication}"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>