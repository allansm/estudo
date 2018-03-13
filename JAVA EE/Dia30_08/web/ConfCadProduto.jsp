<%-- 
    Document   : ConfCadProduto
    Created on : 15/09/2016, 20:40:03
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
                <legend style=''>Produto</legend>
                <h2>Descricao:${param.descricao}<br/><br/>Quantidade em estoque:${param.quant}<br/><br/>Preço Unitario:${param.precoUnitario}<br/><br/>Preço de venda:${param.precoVenda}<br/><br/><%=response.getHeader("msg") %></h2>
            </fieldset>
        </div>
    </body>
</html>
</c:if>
