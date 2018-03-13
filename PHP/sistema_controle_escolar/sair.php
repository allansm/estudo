<?php
	session_destroy();
	unset($_SESSION["login"]);
	unset($_SESSION["senha"]);
	href("index.php");
?>