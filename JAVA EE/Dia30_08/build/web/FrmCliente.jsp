<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<c:if test="${sessionScope.usuario != null}">
<html>
    <%-- <%@include file="head.jsp" %> --%>
    <c:import url="head.jsp" />
    <body>
        <div class="container">
            <%-- <%@include file="menu.jsp" %> --%>
            <c:import url="menu.jsp"/>
            <form method="post" action="CadCliente" >
                 <fieldset>
                     <legend>Dados pessoais</legend>
                     Nome:<br/>
                         <input type="text" name="nome"><br/><br/>
                     E-mail:<br/>
                         <input type="text" name="email"><br/><br/>
                     Telefone:<br/>
                         <input type="text" name="telefone"><br/><br/>
                         <input type="submit" value="cadastrar" class="bt" >
                 </fieldset>
            </form>
         </div>
    </body>
</html>
</c:if>
