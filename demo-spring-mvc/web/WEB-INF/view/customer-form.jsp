<%--
  Created by IntelliJ IDEA.
  User: ricky.kennedy
  Date: 3/10/2021
  Time: 4:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Customer Registration Form</title>

    <style>
        .error {color:red}
    </style>
</head>
<body>

    <i>Fill out the form. Asterisk(*) means required</i>
    <br>
    <form:form action="processForm" modelAttribute="customer">
        First Name : <form:input path="firstName"/>
        <br><br>
        Last Name (*) : <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/>
        <br><br>
        Free passes : <form:input path="freePasses"/>
        <form:errors path="freePasses" cssClass="error"/>
        <br><br>
        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
