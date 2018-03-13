<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css">
    <title>Auto Center</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/estilo.css">

    <!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->
    <!-- ALERTA: Respond.js não funciona se você visualizar uma página file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
    <nav class="navbar navbar-fixed-top container  bcustom">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                <span class="sr-only fbranco">Toggle navigation</span>
                <span class="icon-bar fbranco"></span>
                <span class="icon-bar fbranco"></span>
                <span class="icon-bar fbranco"></span>
            </button>
            <a class="nohover" href="index.jsp"><span class="fa fa-home" style="font-size:50px;"></span></a>
        </div>
        <div class="collapse navbar-collapse navbar-ex1-collapse ">
            <ul class="nav navbar-nav">
                <li><a href="./?p=FrmCompraProduto.jsp"> Produtos</a></li>
                <li><a href="./?p=FrmCompraServico.jsp"> Serviços</a></li>
                <li class="dropdown">
                    <a class="dropdown-toggle" href="./?p=dicas.jsp">Dicas</a>
                </li>
                <li><a href="#contato" class="scroll"> Contato</a></li>
                <li><a href="./?p=FrmCliente.jsp"> Cadastro</a></li>
            </ul>
            <% if(session.getAttribute("nome") != null){ %>
            <ul class="nav navbar-nav navbar-right" style='margin-right:2px'>
                    <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">${sessionScope.nome} <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                    <li><a href="HistoricoCliente">Historico</a></li>
                                    <li><a href="Configurar">Configurações</a></li>
                                    <li><a href="LogoutCliente">Sair</a></li>
                            </ul>
                    </li>
            </ul>
            <%}else{%>
            <ul class="nav navbar-nav navbar-right" style='margin-right:2px'>
                <li><a href="./?p=FrmLoginCliente.jsp"> Logar</a></li>
            </ul>
            <%}%>
        </div>
    </nav>
    <div class="" style="padding-top:60px;padding-bottom:30px">
    <header class="container">
        <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carousel-example-generic" data-slide-to="0" class="active"> </li>
                <li data-target="#carousel-example-generic" data-slide-to="1"> </li>
                <li data-target="#carousel-example-generic" data-slide-to="2"> </li>
            </ol>
            <div class="carousel-inner">
                <div class="item active">
                    <img src="img/fundo.jpg" alt="First slide"/>
                </div>
                <div class="item">
                    <img src="img/fundo2.jpg" alt="Second slide"/>
                </div>
                <div class="item">
                    <img src="img/fundo3.jpg" alt="Third slide"/>
                </div>
                 <div class="item">
                    <img src="img/logofox.jpg" alt="Third slide"/>
                </div>
            </div>
        </div>
    </header>
    <section class="container">
        <% String pag = request.getParameter("p"); %>
        <% pag = (pag == null)?"":pag; %>
        <jsp:include page="<%= pag %>"/>
        <script>
            (function(d, s, id) {
            var js, fjs = d.getElementsByTagName(s)[0];
            if (d.getElementById(id)) return;
            js = d.createElement(s); js.id = id;
            js.src = "//connect.facebook.net/pt_BR/sdk.js#xfbml=1&version=v2.6";
            fjs.parentNode.insertBefore(js, fjs);
            }(document, 'script', 'facebook-jssdk'));
        </script>
        <div class="painelfacebook">
             <div class="fb-page" data-href="https://www.facebook.com/facebook" data-tabs="timeline" data-width="500" data-height="600" data-small-header="true" data-adapt-container-width="false" data-hide-cover="true" data-show-facepile="false"><blockquote cite="https://www.facebook.com/facebook" class="fb-xfbml-parse-ignore"><a href="https://www.facebook.com/facebook">Facebook</a></blockquote></div>
             <img src="img/facebook.png" alt="">
        </div>
    </section>
    <footer class="container">
        <div class="col-md-6 text-center" id="contato">
            <h3 class="text-center vermelhof">Fox Auto Center</h3>
            <h3 class="text-center branco">asdsaassa, Nº0000<br>
            Bairro, Cidade -RJ</h3>
            <h3 class="text-center branco">(XX) - 7XXX - XXXX</h3>
            <h3 class="text-center branco">(XX) - X 7XXX - XXXX</h3> 
            <h3 class="text-center branco">(XX) - 9 9777 - XXXX</h3>
            <h3 class="text-center branco">XXXXXXXXX@XXXXX.COM</h3>
        </div>
        <div class="col-md-6 mapa txtfooter">
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d117761.59558166543!2d-43.56716484028969!3d-22.726388007560995!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x995d694889f955%3A0x23ff502568217834!2sNova+Igua%C3%A7u%2C+RJ!5e0!3m2!1spt-BR!2sbr!4v1466640117734" width="570" height="360" frameborder="0" style="border:0" allowfullscreen></iframe>
        </div>
        <br><i class="branco col-md-12 txtfooter" style='padding:20px'>© COPYRIGHT 2016 - A.L.E.M., TODOS OS DIREITOS RESERVADOS.</i> 
    </footer>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
</body>
</html>

