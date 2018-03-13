<?php
	$login = $_POST["luser"];
	$senha = md5($_POST["lpass"]);
	include_once("connection.php");
	$sql = "select * from cadastro where login='$login' and senha='$senha'";
	$result = mysql_query($sql,$con) or die("<div class='well'>Erro:não foi possivel se conectar ao servidor</div>");
	if((mysql_num_rows($result)) <=0){
		print("<script>alert('login ou senha invalidos');location.href='./?p=home.php'</script>");
		die();
	}else{
		$assoc = mysql_fetch_assoc($result);
		if($login == $assoc["login"] && $senha == $assoc["senha"]){
			$_SESSION['login'] = $assoc["login"];
			$_SESSION['senha'] = $assoc["senha"];
			print("<script>location.href='./?p=home.php'</script>");
		}else{
			print("<script>alert('login ou senha invalidos');location.href='./?p=home.php'</script>");
			die();
			print("<script>location.href='./?p=home.php'</script>");
		}
	}
	
?>