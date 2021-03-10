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
        Country :
        <form:select path="country">
<%--            <form:option value="Brazil" label="Brazil"/>--%>
<%--            <form:option value="France" label="France"/>--%>
<%--            <form:option value="Germany" label="Germany"/>--%>
<%--            <form:option value="India" label="India"/>--%>
            <form:options items="${student.countryOptions}"/>
        </form:select>
        <br><br>
        Favorite Language:

        Java <form:radiobutton path="favoriteLanguage" value="Java"/>
        C# <form:radiobutton path="favoriteLanguage" value="C$"/>
        PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
        Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
        <br><br>

        Operating Systems:

        Linux <form:checkbox path="operatingSystems" value="Linux"/>
        Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
        Windows <form:checkbox path="operatingSystems" value="Windows"/>
        <br><br>
        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
