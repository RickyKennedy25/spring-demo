<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ricky.kennedy
  Date: 3/10/2021
  Time: 4:31 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Confimation</title>
</head>
<body>
    The student is confirmed : ${student.firstName} ${student.lastName}

    <br><br>
    Country : ${student.country}
    <br><br>
    Favorite Language : ${student.favoriteLanguage}
    <br><br>
    Operating Systems
    <ul>
        <c:forEach var="temp" items="${student.operatingSystems}">
            <li>${temp}</li>
        </c:forEach>
    </ul>
</body>
</html>
