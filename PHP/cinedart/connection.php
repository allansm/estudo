<?php
	@$con = mysql_connect($servername,$username,$password)or die("falha ao se conectar");
	$db = mysql_select_db($dbname,$con)or die("falha ao selecionar o banco");
?>