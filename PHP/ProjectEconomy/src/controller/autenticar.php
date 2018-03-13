<?php
	include("../connection/Conexao.php");
	include("../entity/Pessoa.php");
	include("../entity/Usuario.php");
	include("../persistence/PessoaDao.php");
	include("../persistence/UsuarioDao.php");
	include("../entity/Conta.php");
	include("../persistence/ContaDao.php");
	
	$usuario = new Usuario();
	foreach($_POST as $field=>$value){
		$$field = $value;
	}
	$usuario->set("login",$login);
	$usuario->set("senha",$senha);
	try{
		$usuarioDao = new UsuarioDao();
		$stmt = $usuarioDao->selectBy($usuario);
		
		if($row = $stmt->fetch(PDO::FETCH_ASSOC)){
			session_start();
			$_SESSION["id"] = $row["id"];
			$_SESSION["login"] = $row["login"];
			$_SESSION["senha"] = $row["senha"];
			$contaDao = new ContaDao();
			$stmt = $contaDao->select();
			while($row = $stmt->fetch(PDO::FETCH_ASSOC)){
				if($row["usuario"] == $_SESSION["id"]){
					$_SESSION["conta"] = $row["id"];
					$_SESSION["saldo"] = $row["saldo"];
					$_SESSION["pessoa"] = $row["pessoa"];
				}
			}
			header("location:../../index.php");
		}else{
			print("login e senha invalidos");
		}
	}catch(Exception $e){
		print("erro!!!");
	}
?>