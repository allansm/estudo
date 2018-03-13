<%-- 
    Document   : FrmConCliente
    Created on : 13/09/2016, 19:40:27
    Author     : Aluno
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<c:if test="${sessionScope.usuario != null}">
<html>
    <%-- <%@include file="head.jsp" %> --%>
    <c:import url="head.jsp" />
    <body>
        <div class="container">
            <%-- <%@include file="menu.jsp" %>--%>
            <c:import url="menu.jsp"/>
            <fieldset>
                <legend>Pesquisa Cliente</legend>
                <form method="post" action="ConCliente">
                    nome do cliente:<input type="text" name="nome"><br/><br/><input type="submit" value="buscar" class="bt">
                </form>
            </fieldset>
        </div>
    </body>
</html>
</c:if>
