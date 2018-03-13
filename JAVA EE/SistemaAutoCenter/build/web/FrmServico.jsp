<%-- 
    Document   : FrmServico
    Created on : Sep 27, 2016, 2:19:25 PM
    Author     : 
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:if test="${sessionScope.login_usuario != null}">
    <!DOCTYPE html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link rel="stylesheet" href="css/formulario.css">
        </head>
        <body>
            <form method="post" action="CadServico">
                <fieldset>
                    <legend>Cadastro de serviço</legend>
                    <%
                        String[] l = {"servico","custo"};
                        for(String s:l){
                            out.println(s+"<br/><br/><input type='text' name='"+s+"'><br/><br/>");
                        }
                    %>
                    nome da imagem:<input type="text" name="url"><br/><br/>
                    link para imagem:<input type="text" name="link"><br/><br/>
                    <input type="submit" value="enviar">
                </fieldset>
            </form>
        </body>
    </html>
</c:if>
