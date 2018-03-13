<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" media="screen" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/css/bootstrap.min.css">
        <title>@yield("title")</title>
        <style>
            .bdarkb{background:#111}
            .bdark{background:#222}
            .bdarka{background:#333}
            .bdarkc{background:#444}
            .bwhite{background:#eee}
            .well{
                background:none;
                border:none;
                padding:20px;
            }
            .pad{
                padding:20px;
            }
            section{
                color:#eee;
            }
            .navbar{
                border-radius:0px;
            }
            a{
                color:#eee;
            }
            a:hover{
                color:#fff;
            }
            .nav li a:hover{
                background:#222 !important;
                
            }
            .nav li a:focus{
                background:#222 !important;
                color:#eee !important;
            }
            .bt{
                background:#222;
            }
            .bt:hover{
                background:#000;
                color:#eee
            }
            .bt:focus{
                background:#000;
                color:#eee
            }
            .t1{
                width:33%;
                border-radius:5px;
                margin:auto;
            }
            .t1 tr{
                width:100%;
            }
            .t1 tr td{
                padding:10px;   
            }
            .t2{
                width:66%;
                border-radius:5px;
                margin:auto;
            }
            .t2 tr td{
                padding:15px;
            }
            
        </style>
    </head>
    <body class="bdark">
        <div class="container">
            <nav class="navbar bdarkb" role="navigation">
                <div class="navbar-header">
                   <!--
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    -->
                    @guest
                        <a class="navbar-brand" href="{{route("home")}}">Projeto Economia</a>
                    @endguest
                    @auth
                        <a class="navbar-brand" href="{{route("home")}}">{{strtoupper(auth()->user()->conta->dados->nome)}}</a>
                    @endauth
                </div>
                <div class="collapse navbar-collapse navbar-ex1-collapse">
                    <!--
                    <ul class="nav navbar-nav">
                        <li class=""><a href="{{route("home")}}">home</a></li>
                    </ul>
                    
                    <form class="navbar-form navbar-left" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Search">
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                    -->
                    <ul class="nav navbar-nav navbar-right">
                        @guest
                            <li><a href="{{route("login")}}">Logar</a></li>
                            <li><a href="{{route("cadastro")}}">Cadastrar</a></li>
                        @endguest
                        @auth
                            <li><a href="{{route("deposito")}}">Depositar</a></li>
                            <li><a href="{{route("compra")}}">Cadastrar compra</a></li>
                            <li><a href="{{route("historico")}}">Historico</a></li>
                            <li><a href="{{route("logout")}}">Logout</a></li>
                        @endauth
                        <!--
                        <li><a href=""></a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Action</a></li>
                                <li><a href="#">Another action</a></li>
                                <li><a href="#">Something else here</a></li>
                                <li><a href="#">Separated link</a></li>
                            </ul>
                        </li>
                        -->
                    </ul>
                </div>
            </nav>
            <section class="container col-md-12">
                @yield("content")
            </section>
            <footer>
                
            </footer>
        </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/js/bootstrap.min.js"></script>
        <script>

        </script>
    </body>
</html>
