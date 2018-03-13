<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Cinema</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <link href="css/estilo.css" rel="stylesheet">
    <link rel="stylesheet" href="css/media.css">
    <script src="js/script.js"></script>
  </head>
  <body onload="" class="img">
        <div id="fb-root"></div>
        <script>(function(d, s, id) {
          var js, fjs = d.getElementsByTagName(s)[0];
          if (d.getElementById(id)) return;
          js = d.createElement(s); js.id = id;
          js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.6";
          fjs.parentNode.insertBefore(js, fjs);
        }(document, 'script', 'facebook-jssdk'));</script>
		<nav class="navbar blackbg opacity" role="navigation">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand scroll" href="#inicio"></a>
			</div>
			<div class="collapse navbar-collapse navbar-ex1-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a class="" href="./?p=home.php" onclick=""><span class="glyphicon glyphicon-home"></span>&nbsp;Home</a></li>
					<li><a class="" href="./?p=emcartaz.php" onclick=""><span class="glyphicon glyphicon-list-alt"></span>&nbsp;Em cartaz</a></li>
					<li><a href="./?p=promocoes.php" onclick=""><span class="glyphicon glyphicon-tag"></span>&nbsp;Promoções</a></li>
					<li><a href="./?p=ingressos.php" onclick=""><span class='glyphicon glyphicon-calendar'></span>&nbsp;ingressos</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="./?p=cadastro.php" onclick=""><span class="glyphicon glyphicon-user"></span>&nbsp;cadastro</a></li>
					<?php include_once("btnlogin.php");?>
				</ul>
			</div>
		</nav>
        <div id="myModal" class="modal fade  bluefont well" role="dialog">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header blackbg noborder">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Login</h4>
              </div>
              <div class="modal-body blackbg noborder">
                <form method="post" action="./?p=login.php">
                    usuario:<br/><input type="text" name="luser" id="input" class="form-control" value="" required="required" pattern="[a-zA-Z0-9]+"  title="somente letras e numeros">
                    <br/><br/>
                    senha:<br/><input type="password" name="lpass" id="input" class="form-control" required="required" title="">
                    <br/><br/>
                    <button type="submit" class="bt blackhover outsetborder outsetshadow  clearfix">Logar</button>
                </form>
              </div>
              <div class="modal-footer blackbg noborder">
                
              </div>
            </div>

          </div>
        </div>
		<div class="container pagebg outsetborder outsetshadow whitefont well bgopacity afastacima">
  			<header id="inicio" class="outsetborder outsetshadow display well">
  				<div id="trailer" class="col-md-8 well trailer" style="display:none">
  					
  				</div>
				<div id="carousel-example-generic" class="carousel slide col-md-8 well " data-ride="carousel">
					<ol class="carousel-indicators" style="">
						<li data-target="#carousel-example-generic" data-slide-to="0" class="active"> </li>
						<li data-target="#carousel-example-generic" data-slide-to="1"> </li>
						<li data-target="#carousel-example-generic" data-slide-to="2"> </li>
					</ol>
					<div class="carousel-inner insetborder insetshadow">
						<div class="item active pointer" >
							<img src="img/carousel1.jpg" alt="First slide" href="#carousel-example-generic" data-slide="next"/>
						</div>
						<div class="item pointer">
							<img src="img/carousel2.jpg" alt="Second slide" href="#carousel-example-generic" data-slide="next"/>
						</div>
						<div class="item pointer">
							<img src="img/carousel3.jpg" alt="Third slide" href="#carousel-example-generic" data-slide="next"/>
						</div>
					</div>
				</div>
				<div class="col-md-4 col-xs-12 col-sm-12 display" style="">
				<?php
                    include_once("class.php");
                    include_once("configuration.php");
                    include_once("funcoes.php");
                    include_once("info.php");
                    include_once("emdestaque.php");
				?>
				</div>
  			</header>
  			<section class="">
  			    <div class="">
                    <?php
                        include_once("section.php");
                    ?>
                </div>
  			</section>
	  	</div>
		<footer class=" blackbg navbar-bottom bluefont display opacity fill well text-">
			<div class="col-md-4  well nopaddingtop" style="">
                <h2></h2>
                <form action="./?p=enviar.php" method="" role="form">
                    <legend class="bluefont">Fale conosco</legend>

                    <div class="form-group">
                        <label for="">nome</label>
                        <input type="text" class="form-control" name='fNome'  required>
                    </div>
                    <div class="form-group">
                        <label for="">email</label>
                        <input type="text" class="form-control" name="fEmail" required>
                    </div>
                    <div class="form-group">
                        <label for="">Assunto</label>
                        <input type="text" class="form-control" name="fAssunto"  required>
                    </div>
                    <div class="form-group">
                        <label for="">mensagem</label>
                        <textarea name="fMenssage" id="input" class="form-control" rows="3" required="required"></textarea>

                    </div>

                    <button type="submit" class="bt blackhover outsetborder outsetshadow  clearfix">Submit</button>
                </form>

			</div>
			<div class="col-md-4 well">
               <div class='col-md-12 text-center'>
                <legend class="bluefont display text-center" >Site desenvolvido por</legend>
                       <?php
                            $desenvolvedores = array("Allan de souza melo","Adenilson Pereira","Maxwel Silva","luan lee","bruno mesquita");
                            foreach($desenvolvedores as $value){
                                print("
                                    <div class='col-md-12 col-xs-12 col-sm-12'>
                                        <p >$value</p>
                                    </div>
                                ");
                            }
                        ?>
                </div>
                   
                <div class='col-md-12  display fill  nopadding'>
				<?php
                    links();
                ?>
                </div>
			</div>
			<div class="col-md-4 well nopaddingleft nopaddingright " style="">
	    		<div class="col-md-12 " style="">
	    			<legend class="bluefont">Social</legend>
	    			
	    			
	    		</div>
	    		<div class="col-md-12 nopaddingleft nopaddingright text-center">
					<div class="fb insetborder insetshadow round "></div>
					<div class="tw insetborder insetshadow round "></div>
					<div class="ins insetborder insetshadow round "></div>
    			</div>
	    		<div class="col-md-12">
		    		<legend class="bluefont">Aceitamos Cartões</legend>
			    	<img src="img/cart.png" alt="" class="fill">
				</div>
			</div>
			
			<div class="col-md-12 well ">
			   Não me responsabilizo pelo conteúdo aqui presente, Não comercializo nenhum dos conteudos aqui presentes,imagens e texto retirados da internet e direito reservado a seus autores,  Caso algum arquivo seja de sua autoria e esteja sendo utilizado sem sua permissão, entre em contato, o conteúdo sera  removido assim que possível.tudo desenvolvido aqui tem a finalidade de aprimorar os conhecimentos em web.
			</div>
		</footer>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scroll.js"></script>
  </body>
</html>