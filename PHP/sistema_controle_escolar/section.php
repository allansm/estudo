<?php
	include_once("funcoes.php");
	if(session_start());
	if(isset($_SESSION["login"]) && isset($_SESSION["senha"])){
		include_once("gestaoEscolar.php");
	}else{
		include_once("login.php");
	}
?>