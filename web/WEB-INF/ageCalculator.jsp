<%-- 
    Document   : ageCalculator
    Created on : 28-Sep-2020
    Author     : Sooeun Kim 817949
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="number" name="age_input" value="" min="0"><br>
            <input type="submit" value="Age next birthday">
        </form>
        <div>
            <c:if test="${validInput == true}">
                <p>Your age next birthday will be ${nextAge}.</p>
            </c:if>
            <c:if test="${validInput == false}">
                <p>You must give your current age.</p>
            </c:if>
        </div>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
