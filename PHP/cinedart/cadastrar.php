<?php
	$erro =0;
	foreach($_POST as $campo=>$valor){
		if($campo != "repetir_senha"){
			if($valor == "" || $valor == null){
				$erro++;
			}
		}else if($campo == "repetir_senha"){
			if($valor != $_POST["senha"]){
				$erro++;
			}
		}
	}
	if($erro == 0){
		include_once("connection.php");
		$select = "select * from cadastro";
		$crip = md5($_POST['senha']);
		$insert = "insert into cadastro (nome,sobrenome,email,telefone,sexo,login,senha) values ('".$_POST['nome']."','".$_POST['sobrenome']."','".$_POST['email']."','".$_POST['telefone']."','".$_POST['sexo']."','".$_POST['login']."','".$crip."');";
		$result = mysql_query($select,$con);
		while($fetch = mysql_fetch_assoc($result)){
			if($fetch['login'] == $_POST['login'] || $fetch['email'] == $_POST['email']){
				print("<script>alert('usuario ou email ja existe');</script>");
				print("<script>location.href='./?p=home.php'</script>");
			}
		}
		if(mysql_query($insert,$con)){
			print("<script>alert('cadastro efetuado com sucesso');</script>");
		}else{
			print("<script>alert('erro ao cadastrar');</script>");
		}
	}else{
		print("<script>alert('falha na autenticação');</script>");
	}
	
?>
<script>location.href="./?p=home.php";</script>