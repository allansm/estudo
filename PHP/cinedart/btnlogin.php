<?php 
	if(!session_start()){ session_start();} 
    if(isset($_SESSION['login']) && $_SESSION['senha']){
		print('<li class="dropdown">
			<a href="#" class="dropdown-toggle" data-toggle="dropdown">'.$_SESSION["login"].' <b class="caret"></b></a>
			<ul class="dropdown-menu">
				<li><a href="./?p=exit.php" class="">Sair</a></li>
			</ul>
		</li>
		');
    }else{
		print("<li><a href='#' data-toggle='modal' data-target='#myModal'><span class='glyphicon glyphicon-lock'></span>&nbsp;login</a></li>");
    } 
?> 