<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header class="titulo">
    <h1>Sistema de vendas</h1>
</header>
<nav class="menu">
    <ul>
        <li><a href="home.jsp">home</a></li>
        <li><a href="FrmCliente.jsp">cliente</a></li>
        <li><a href="FrmConCliente.jsp">Consulta cliente</a></li>
        <li><a href="ConsCliente">Relatorio de Clientes</a>
        <li><a href="FrmFunc.jsp">funcionario</a></li>
        <li><a href="FrmProduto.jsp">Produto</a></li>
        <li><a href="">venda</a></li>
        <li><a href="deslogar">sair</a></li>
    </ul>
</nav>
<div style="padding:5px;background:#777;display:inline-block" >
    <%="Usuario:"+session.getAttribute("username") %>
</div>
<span style="clear:both"></span>
