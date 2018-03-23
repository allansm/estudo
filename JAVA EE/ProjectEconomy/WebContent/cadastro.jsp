<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<link rel="stylesheet" href="css/style.css">
	</head>
	
	<body>
		<div class="category">
			<form method="post" action="./Cadastrar">
				nome:<br/><br/><input type="text" name="nome"><br/><br/>
				sobrenome:<br/><br/><input type="text" name="sobrenome"><br/><br/>
				email:<br/><br/><input type="text" name="email"><br/><br/>
				telefone:<br/><br/><input type="text" name="telefone"><br/><br/>
				login:<br/><br/><input type="text" name="login"><br/><br/>
				senha:<br/><br/><input type="password" name="senha"><br/><br/>
				confirmar senha:<br/><br/><input type="password" name="csenha"><br/><br/>
				<input type="submit" value="cadastrar">
			</form>
		</div>
	</body>
</html>