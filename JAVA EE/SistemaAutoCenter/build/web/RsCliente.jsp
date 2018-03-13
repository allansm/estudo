<%-- 
    Document   : RsCliente
    Created on : 26/09/2016, 20:45:49
    Author     : Aluno
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="head.jsp"/>
    <body>
        <jsp:include page="menu.jsp"/>
        <div class='resultado'>
            <center><h2 style='color:#eee'>Resultados</h2></center>
            <%= "<div class='txt'>"+response.getHeader("res")+"</div>" %>
        </div>
        <jsp:include page="script.jsp" />
    </body>
</html>
