<?php
	$con = mysqli_connect("localhost","root","","generic") or die("falha na conexao");
	$query = mysqli_query($con,generateSQl()) or die ("error");
	print("tabela criada com sucesso");
?>