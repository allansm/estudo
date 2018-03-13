<div class='col-md-12 text-center highmargintop'>
	<?php
		print("<div class='text-left blackbg whitefont display lrbox outsetborder '>");
		print("<h3 class='halfbox nomargin text-center'>Login</h3>");
		createForm("Logar","#","usuario","senha");
		foreach($_POST as $campo=>$value){
			$$campo = $value;
		}
		print("</div>");
		include_once("conn.php");
		if(isset($usuario)){
			$sql ="select * from login where login='$usuario' and senha='".md5($senha)."';";
			$result = mysqli_query($con,$sql);
			if(mysqli_num_rows($result) > 0){
				$row = mysqli_fetch_assoc($result);
				if($row["login"] == $usuario && $row["senha"] == md5($senha)){
					$_SESSION["login"] = $row["login"];
					$_SESSION["senha"] = $row["senha"];
					href("index.php");
				}else{
					alert('login ou senha invalido');
					href('index.php');
				}				
			}else{
				alert("login ou senha invalido");
			}
		}
	?>
</div>