<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<link rel="stylesheet" href="css/style.css">
	</head>
	<body>
		<?php
			session_start();
			if(isset($_GET["p"]) && file_exists("views/".$_GET["p"].".php")){
				include("views/".$_GET["p"].".php");
			}else{
				if(!isset($_SESSION["id"])){
					include("views/login.php");
				}else{
					include("views/panel.php");
				}
			}
			if(isset($_GET["logout"])){
				session_destroy();
			}
		?>
	</body>
</html>