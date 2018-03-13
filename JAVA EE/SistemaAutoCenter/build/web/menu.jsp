<nav class="navbar black" role="navigation">
        <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Sistema Auto Center</a>
        </div>
        <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav">
                        <li class="active"><a href="./adm.jsp?p=FrmProduto.jsp">Cadastro de produtos</a></li>
                        <li><a href="./adm.jsp?p=FrmServico.jsp">Cadastro de serviços</a></li>
                        <li><a href="./adm.jsp?p=FrmUsuario.jsp">Cadastro de usuario</a></li>
                        <li><a href="BuscaProduto">Buscar produtos</a></li>
                        <li><a href="BuscaServico">Buscar serviços</a></li>
                        <li><a href="BuscaCliente">Buscar Clientes</a></li>
                </ul>

                <ul class="nav navbar-nav navbar-right">

                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown"><%= session.getAttribute("login_usuario") %><b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                        <li><a href="LogoutUsuario">Sair</a></li>
                                </ul>
                        </li>
                </ul>
        </div>
</nav>
