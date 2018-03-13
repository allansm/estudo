<%-- 
    Document   : ResConsCliente
    Created on : 15/09/2016, 21:08:17
    Author     : Aluno
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<c:if test="${sessionScope.usuario != null}">
<html>
    <%-- <%@include file="head.jsp" %> --%>
     <c:import url="head.jsp"/>
    <body>
        <div class="container">
            <%-- <%@include file="menu.jsp" %> --%>
            <c:import url="menu.jsp"/>
            <fieldset style='width:50%'>
                <legend style=''>Relatorio de Clientes</legend>
                <%= response.getHeader("result") %>
            </fieldset>
        </div>
    </body>
</html>
</c:if>
