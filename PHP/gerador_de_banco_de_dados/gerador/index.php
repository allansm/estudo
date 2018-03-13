<html>
	<head>
		<script>
			function submit(){
				document.getElementById("f").submit();
			}
		</script>
	</head>
	<body>
		<h1>Gerador de banco de dados</h1>
		<form method='post' action='#' id='f' >
		<?php
			include_once "functions.php";
			
			if(!isset($_POST["sz"])){
				$size = "Quantidade de campos:&nbsp;<select name='sz' onchange='submit()' value='0'>";
				for($i = 0;$i<100;$i++){
					$size .= "<option value='$i'>$i</option>";
				}
				$size .= "</select>";
				print($size);
			}else if(!isset($_POST["g"])){
				print("<input type='text' name='sz' value='".$_POST['sz']."' style='display:none'>");
				print("nome da tabela:<br/><br/><input type='text' name='tbln'><br/><br/>");
				for($i =1;$i <= $_POST['sz'];$i++){
					print("campo $i:<br/><br/><input type='text' name='c$i'><br/><br/>");
				}
				print("<input type='submit' value='gerar' name='g'>");
			}else{
				print(generateSQL());
				//include_once "conexao.php";
			}
			
		?>
		</form>
	</body>
</html>