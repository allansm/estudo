<%-- 
    Document   : arquivo
    Created on : 25/08/2016, 20:59:36
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
            <form method="post" action="CadProdutos" >
                <fieldset>
                    <legend>Cadastro de produtos</legend>
                    descrição:<br/>
                        <input type="text" name="descricao"><br/><br/>
                    quantidade em estoque:<br/>
                        <input type="text" name="quant"><br/><br/>
                    preço unitario:<br/>
                        <input type="text" name="precoUnitario"><br/><br/>
                    preço de venda:<br/>
                        <input type="text" name="precoVenda"><br/><br/>
                        <input type="submit" value="cadastrar" class="bt">
                </fieldset>
           </form>
       </div>
    </body>
</html>
</c:if>
