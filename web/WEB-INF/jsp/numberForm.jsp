<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <spring:url value="/css/style.css" var="urlCss"/>
        <link rel="stylesheet" href="${urlCss}" type="text/css" /> 
        <title>Validation</title>
    </head>
    <body>

        <form:form method="POST" action="numbers.htm" 
                   modelAttribute="numbers">

            <p><label>Amount:</label>
                <form:input path="amount" size="7" maxLength="10"/>&nbsp; 
                            
            </p>

            <p><label>Number1:</label>
                <form:input path="number1" size="7" maxLength="10"/>&nbsp;
                
            </p>

            <p><label>Number2:</label>
                <form:input path="number2" size="7" maxLength="10"/>&nbsp;
                       
            </p>
            <p><input type="submit" value="Submit" /></p>

        </form:form>
    </body>
</html>
