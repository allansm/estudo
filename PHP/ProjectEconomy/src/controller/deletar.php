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
	
	$compra = new Compra();
	$compra->set("id",$_POST["idCompra"]);
	try{
		$compraDao = new CompraDao();
		$compraDao->deletar($compra);
		header("location:../../index.php");
	}catch(Exception $e){
		print("error");
	}
?>