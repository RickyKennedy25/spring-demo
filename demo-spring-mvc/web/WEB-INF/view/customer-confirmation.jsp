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
    <title>Customer Confirmation</title>
</head>
<body>
    The customer is confirmed : ${customer.firstName} ${customer.lastName}
    <br><br>
    Free passes : ${customer.freePasses}
</body>
</html>
