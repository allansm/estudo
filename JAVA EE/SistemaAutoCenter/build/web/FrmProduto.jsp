<%-- 
    Document   : FrmProduto
    Created on : 26/09/2016, 21:09:05
    Author     : Aluno
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
            <form method="post" action="CadProduto">
                <fieldset>
                    <legend>Cadastro de produtos</legend>
                    <%
                        String[] l = {"nome","quantidade","precoUnitario",};
                        for(String s:l){
                            out.println(s+"<br/><br/><input type='text' name='"+s+"'><br/><br/>");
                        }
                    %>
                    nome da imagem:<input type="text" name="url"><br/><br/>
                    <input type="submit" value="cadastrar">
                </fieldset>
            </form>
        </body>
    </html>
</c:if>

