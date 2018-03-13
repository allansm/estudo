<div class=''>
	<nav class="navbar navbar-fixed-top darkbg opacity outsetborder outsetshadow whitefont  noradius" role="navigation">

		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Sistema de Gestão Escolar</a>
		</div>
		<div class="collapse navbar-collapse navbar-ex1-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="./?p=cadastroAluno.php">Cadastro aluno</a></li>
				<li><a href="./?p=cadastroProfessor.php">Cadastro Professor</a></li>
				<li><a href="./?p=consultarAlunos.php">Exibir Alunos</a></li>
				<li><a href="./?p=cadastroNotas.php">Cadastro de notas</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">			
				<li class="dropdown">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown"><?php print($_SESSION["login"]);?> <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="./?p=sair.php">Sair</a></li>
					</ul>
				</li>
			</ul>
		</div>
	</nav>
	<?php
		if(isset($_GET["p"]) && $_GET["p"] != "login.php" && file_exists($_GET["p"])){
			include_once($_GET["p"]);
		}
	?>
</div>