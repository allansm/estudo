<div class='col-md-12 text-center midmargintop midmarginbottom'>
	<?php
		include_once("class.php");
		print("<div class='text-left blackbg whitefont display lrbox outsetborder '>");
		print("<h3 class='halfbox nomargin text-center bdashedborder'>Resultados</h3>");
		gestao::consultarAlunos();
		print("</div>");
	?>
</div>