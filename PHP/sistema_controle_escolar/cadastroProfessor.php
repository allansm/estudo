<div class='col-md-12 text-center midmargintop midmarginbottom'>
	<?php
		print("<div class='text-left blackbg whitefont display lrbox outsetborder '>");
		print("<h3 class='halfbox nomargin text-center'>Cadastro de Professor</h3>");
		createForm("Cadastrar","./?p=cadastrarProfessor.php","nome","telefone","email","cpf");
		foreach($_POST as $campo=>$value){
			$$campo = $value;
		}
		print("</div>");
		include_once("conn.php");
	?>
</div>