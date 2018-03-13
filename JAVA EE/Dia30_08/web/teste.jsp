<%-- 
    Document   : teste
    Created on : Sep 14, 2016, 10:36:00 AM
    Author     : hiro
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="a" value="10" />
        <c:out value="${a}"/>
        <br/>
        <c:forEach begin="1" end="10" step="1" var="i">
            <c:out value="${i}"/>
        </c:forEach>
    </body>
</html>
