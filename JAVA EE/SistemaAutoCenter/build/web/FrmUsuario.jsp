<%-- 
    Document   : FrmUsuario
    Created on : Sep 28, 2016, 12:43:56 PM
    Author     : 
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${sessionScope.login_usuario != null}">
    <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link rel="stylesheet" href="css/formulario.css">
        </head>
        <body>
            <form method="post" action="CadUsuario">
                <fieldset>
                    <legend>Cadastro de usuario</legend>
                    usuario:<br/><br/><input type="text" name="usuario"><br/><br/>
                    senha:<br/><br/><input type="password" name="pass"><br/><br/>
                    confirmar-senha:<br/><br/><input type="password" name="cpass"><br/><br/>
                    <input type="submit" value="cadastrar">
                </fieldset>
            </form>
        </body>
    </html>
</c:if>