<%-- 
    Document   : FrmFunc
    Created on : 01/09/2016, 18:44:24
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
            <%
                String[] func = {"nome","endereco","bairro","cidade","uf"};
                out.println("<form method=\"post\" action=\"CadFunc\">");
                out.println("<fieldset>");
                out.println("<legend>Cadastro de funcionario</legend>");
                for(String s : func){
                    out.print(s+":<br/><input type=\"text\" name=\""+s+"\"><br/><br/>");
                }
                //out.print("<input type='submit' value='cadastrar'>");
                out.println("</fieldset>");
                //out.println("</form>");
            %>
                <fieldset>
                    <legend>Cadastro de usuario</legend>
                    usuario:<br/><input type="text" name="usuario"><br/><br/>
                    senha:<br/><input type="password" name="senha"><br/><br/>
                    confirmar senha:<br/><input type="password" name="confsenha"><br/><br/>
                    <input type="submit" value="cadastrar" class="bt">
                </fieldset>
            </form>
         </div>
    </body>
</html>
</c:if>
