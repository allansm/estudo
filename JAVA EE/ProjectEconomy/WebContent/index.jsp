<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<link rel="stylesheet" href="css/style.css">
	</head>
	<body>
		<%
			if(request.getSession().getAttribute("login") != null){
		%>
		<div class="category">
			<h2>Conta</h2>
			Conta: ${sessionScope.conta}
			<br/><br/>
			Numero usuario: ${sessionScope.id}
			<br/><br/>
			Login: ${sessionScope.login}
			<br/><br/>
			Senha: ${sessionScope.senha}
			<br/><br/>
			SaldoTotal: R$ ${sessionScope.saldo}
			<br/><br/>
			<form method="get" action="./Autenticar"><input type="submit" value="logout"></form>
		</div>
		
		<div class="category">
			<h2>Deposito</h2>
			<form method="post" action="./Depositar">
				Valor: <br/><br/><input type="text" name="valor"><br/><br/><input type="submit" value="depositar">
			</form>
		</div>
		
		<div class="category">
			<h2>Registrar</h2>
			<form method="post" action="./CadastrarCompra">
				Produto:<br/><br/><input type="text" name="produto"><br/><br/>
				Valor:<br/><br/><input type="text" name="valorProduto"><br/><br/>
				Data:<br/><br/><input type="date" name="data"><br/><br/>
				<input type="submit" value="Cadastrar Produto">
			</form>
		</div>
		
		<div class="category">
			<h2>Compras</h2>
			<form method="post" action="./Atualizar"><input type="submit" value="Atualizar/Exibir"></form>
			<br/><br/>
			Saldo Atual : R$${sessionScope.saldoAtual}
			<br/><br/>
			${sessionScope.compras}
		</div>
		<%
			}else{
		%>
		<div class="category vertical">
			<form method="post" action="./Autenticar">
				Login:<br/><br/><input type="text" name="login"><br/><br/> 
				Senha:<br/><br/><input type="password" name="senha"><br/><br/>
				<input type="submit" value="Autenticar">&nbsp;<a href="./cadastro.jsp">Cadastre-se aqui</a>
			</form>
		</div>
		<%
			}
		%>
	</body>
</html>