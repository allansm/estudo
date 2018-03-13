<?php
	include("../connection/Conexao.php");
	include("../entity/Pessoa.php");
	include("../entity/Usuario.php");
	include("../persistence/PessoaDao.php");
	include("../persistence/UsuarioDao.php");
	include("../entity/Conta.php");
	include("../persistence/ContaDao.php");
	
	session_start();
	foreach($_SESSION as $field=>$value){
		$$field = $value;
	}
	$saldo = $saldo+$_POST["valor"];
	$conta = new Conta();
	$conta->set("id",$id);
	$conta->set("saldo",$saldo);
	try{
		$contaDao = new ContaDao();
		$contaDao->depositar($conta);
		$_SESSION["saldo"] = $saldo;
		header("location:../../index.php");
	}catch(Exception $e){
		print("erro ao depositar valor");
	}
?>