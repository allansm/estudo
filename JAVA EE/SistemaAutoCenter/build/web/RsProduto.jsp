<%-- 
    Document   : RsProduto
    Created on : 26/09/2016, 21:25:12
    Author     : Aluno
--%>

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
