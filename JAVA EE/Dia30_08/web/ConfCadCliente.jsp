<%-- 
    Document   : ConfCadCliente
    Created on : 15/09/2016, 19:30:40
    Author     : Aluno
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:if test="${sessionScope.usuario != null}">
<!DOCTYPE html>
<html>
    <%-- <%@include file="head.jsp" %> --%>
    <c:import url="head.jsp"/>
    <body>
        <div class="container">
           <%-- <%@include file="menu.jsp"%> --%>
           
           <c:import url="menu.jsp"/>
            <fieldset style='width:50%'>
                <legend style=''>Dados do Cliente</legend>
                <h2>nome:${param.nome}<br/><br/>email:${param.email}<br/><br/>telefone:${param.telefone}<br/><br/><%=response.getHeader("msg")%></h2>
            </fieldset>
        </div>
    </body>
</html>
</c:if>
