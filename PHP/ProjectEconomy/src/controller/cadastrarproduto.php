<?php
	include("../connection/Conexao.php");
	include("../entity/Pessoa.php");
	include("../entity/Usuario.php");
	include("../persistence/PessoaDao.php");
	include("../persistence/UsuarioDao.php");
	include("../entity/Conta.php");
	include("../persistence/ContaDao.php");
	include("../entity/Compra.php");
	include("../persistence/CompraDao.php");
	
	session_start();
	
	$compra = new Compra();
	$compra->set("idConta",$_SESSION["conta"]);
	$compra->set("produto",$_POST["produto"]);
	$compra->set("valor",$_POST["valorProduto"]);
	$compra->set("data",$_POST["data"]);
	
	try{
		$compraDao = new CompraDao();
		$compraDao->insert($compra);
		header("location:../../index.php");
	}catch(Exception $e){
		print("erro ao cadastrar produto");
	}
?>