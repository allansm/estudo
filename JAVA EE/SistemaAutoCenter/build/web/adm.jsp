<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:if test="${sessionScope.login_usuario != null}">
<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <link rel="stylesheet" href="css/adm.css">
  </head>
  <body>
	<nav class="navbar black" role="navigation">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Sistema Auto Center</a>
		</div>
		<div class="collapse navbar-collapse navbar-ex1-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="./adm.jsp?p=FrmProduto.jsp">Cadastro de produtos</a></li>
				<li><a href="./adm.jsp?p=FrmServico.jsp">Cadastro de serviços</a></li>
				<li><a href="./adm.jsp?p=FrmUsuario.jsp">Cadastro de usuario</a></li>
				<li><a href="BuscaProduto">Buscar produtos</a></li>
				<li><a href="BuscaServico">Buscar serviços</a></li>
				<li><a href="BuscaCliente">Buscar Clientes</a></li>
			</ul>
			
			<ul class="nav navbar-nav navbar-right">
				
				<li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><c:out value="${sessionScope.login_usuario}" /><b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="LogoutUsuario">Sair</a></li>
					</ul>
				</li>
			</ul>
		</div>
	</nav>
        <% String pag = request.getParameter("p"); %>
        <% pag = (pag == null)?"":pag; %>
        <jsp:include page="<%= pag %>"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>

</html>
</c:if>
<c:if test="${sessionScope.login_usuario == null}">
    <jsp:forward page="FrmLoginUsuario.jsp"/>
</c:if>