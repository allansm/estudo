<?php
	include("src/connection/Conexao.php");
	include("src/entity/Pessoa.php");
	include("src/entity/Usuario.php");
	include("src/persistence/PessoaDao.php");
	include("src/persistence/UsuarioDao.php");
	include("src/entity/Conta.php");
	include("src/persistence/ContaDao.php");
	include("src/entity/Compra.php");
	include("src/persistence/CompraDao.php");
	
	try{
		$compraDao = new CompraDao();
		$stmt = $compraDao->select();
		$msg = "";
		$gasto = 0;
		while($row = $stmt->fetch(PDO::FETCH_ASSOC)){
			$msg .= "<div style='border:1px dashed black;padding:10px;margin:10px;width:33.3%;text-align:center'><form method='post' action='./src/controller/deletar.php'><input type='text' name='idCompra' style='display:none' value='".$row["id"]."'>produto: ".$row["produto"]."<br/><br/>custo: ".$row["valor"]."<br/><br/>data: ".$row["data"]."<br/><br/><input type='submit' value='deletar'></form></div>";
			$gasto+=$row["valor"];
		}
		$_SESSION["msg"] = $msg;
		$_SESSION["saldoAtual"] = $_SESSION["saldo"]-$gasto;
	}catch(Exception $e){
		print("error!!");
	}
?>