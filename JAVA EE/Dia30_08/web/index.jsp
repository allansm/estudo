<%-- 
    Document   : FrmLogin
    Created on : 27/09/2016, 18:46:40
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<c:if test="${sessionScope.usuario == null}">
<html>
    <%-- <%@include file="head.jsp" %> --%>
    <c:import url="head.jsp" />
    <body>
        <div class="container">
            <header class="titulo">
                <h1>Sistema de vendas</h1>
            </header>
            <form method="post" action="Login">
                <fieldset>
                    <legend>Login</legend>
                    Usuario:<input type="text" name="usuario"><br/><br/>
                    senha:<input type="password" name="pass"><br/><br/>
                    <input type="submit" value="logar" class="bt">
                </fieldset>
            </form>
        </div>
    </body>
</html>
</c:if>
<c:if test="${sessionScope.usuario != null}">
    <jsp:forward page="home.jsp"/>
</c:if>
