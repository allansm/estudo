<%-- 
    Document   : index
    Created on : 30/08/2016, 18:48:12
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<c:if test="${sessionScope.usuario != null}">
<html>
    <%-- <%@include file="head.jsp" %> --%>
    <c:import url="head.jsp" />
    <body>
        <div class="container">
            <%-- <%@include file="menu.jsp" %> --%>
            <c:import url="menu.jsp" />
        </div>
    </body>
</html>
</c:if>
<c:if test="${sessionScope.usuario == null}">
    <jsp:forward page="index.jsp"/>
</c:if>
