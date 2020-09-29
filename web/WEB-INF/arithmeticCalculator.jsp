<%-- 
    Document   : arithmeticCalculator
    Created on : 28-Sep-2020
    Author     : Sooeun Kim 817949
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="number" name="number_input1" value="${firstNumber}"><br>
            Second: <input type="number" name="number_input2" value="${secondNumber}"><br>
            <button name="calculate_button" type="submit" value="plus">+</button>
            <button name="calculate_button" type="submit" value="minus">-</button>
            <button name="calculate_button" type="submit" value="multiply">*</button>
            <button name="calculate_button" type="submit" value="modulus">%</button>
        </form>
        <div>
            <p>Result: 
                <c:if test="${noCalculation == true}">
                    ---
                </c:if>
                <c:if test="${validInput == false}">
                    invalid
                </c:if>
                <c:if test="${validInput == true}">
                    ${calculatedOutput}
                </c:if>
            </p>
        </div>
        <a href="age">Age Calculator</a>
    </body>
</html>