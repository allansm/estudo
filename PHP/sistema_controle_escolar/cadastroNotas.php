<div class='col-md-12 text-center midmargintop midmarginbottom'>
	<?php
		include_once("class.php");
		print("<div class='text-left blackbg whitefont display lrbox outsetborder '>");
		print("<h3 class='halfbox nomargin text-center'>Cadastro de notas</h3>");
	?>
		<form method='post' action='./?p=cadastrarNota.php'>
			Bimestre:<br/>
			<select name='bimestre' class="textfield">
				<option value='1 bimestre'>1° bimestre</option>
				<option value='2 bimestre'>2° bimestre</option>
				<option value='3 bimestre'>3° bimestre</option>
			</select><br/><br/>
			ano:<br/>
			<input type='text' name='ano' class="textfield"><br/><br/>
			nota:<br/>
			<input type='text' name='nota' class="textfield"><br/><br/>
			<?php
				print("disciplina:<br/>");
				print("<select name='disciplina' class='textfield'>");
				$r = gestao::getDisciplina();
				while($row = mysqli_fetch_assoc($r)){
					print("<option value='".$row["id"]."'>".$row["nome"]."</option>");
				}
				print("</select><br/><br/>");
				print("matricula:<br/>");
				print("<select name='matricula' class='textfield'>");
				$r = gestao::getMatricula();
				while($row = mysqli_fetch_assoc($r)){
					print("<option value='".$row["matricula"]."'>".$row["nome"]."</option>");
				}
				print("</select><br/><br/>");
			?>
			<input type="submit" value="cadastrar" class="bt">
		</form>
	<?php
		print("</div>");
	?>
</div>