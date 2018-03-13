<%-- 
    Document   : RsServico
    Created on : Sep 27, 2016, 2:38:57 PM
    Author     : hiro
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
