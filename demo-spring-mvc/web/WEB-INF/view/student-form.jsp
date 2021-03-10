<%--
  Created by IntelliJ IDEA.
  User: ricky.kennedy
  Date: 3/10/2021
  Time: 4:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
    <%--@elvariable id="student" type=""--%>
    <form:form action="processForm" modelAttribute="student">
        First Name : <form:input path="firstName"/>
        <br><br>
        Last Name : <form:input path="lastName"/>
        <br><br>
        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
