package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css\">\n");
      out.write("    <title>Auto Center</title>\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"estilo.css\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->\n");
      out.write("    <!-- ALERTA: Respond.js não funciona se você visualizar uma página file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-fixed-top container  bcustom\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n");
      out.write("                <span class=\"sr-only fbranco\">Toggle navigation</span>\n");
      out.write("                <span class=\"icon-bar fbranco\"></span>\n");
      out.write("                <span class=\"icon-bar fbranco\"></span>\n");
      out.write("                <span class=\"icon-bar fbranco\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"nohover\" href=\"index.jsp\"><span class=\"fa fa-home\" style=\"font-size:50px;\"></span></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"collapse navbar-collapse navbar-ex1-collapse \">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <li><a href=\"./?p=FrmCompraProduto.jsp\"> Produtos</a></li>\n");
      out.write("                <li><a href=\"./?p=FrmCompraServico.jsp\"> Serviços</a></li>\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" href=\"./?p=dicas.jsp\">Dicas</a>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#contato\" class=\"scroll\"> Contato</a></li>\n");
      out.write("                <li><a href=\"./?p=FrmCliente.jsp\"> Cadastro</a></li>\n");
      out.write("            </ul>\n");
      out.write("            ");
 if(session.getAttribute("nome") != null){ 
      out.write("\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\" style='margin-right:2px'>\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <b class=\"caret\"></b></a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                    <li><a href=\"HistoricoCliente\">Historico</a></li>\n");
      out.write("                                    <li><a href=\"LogoutCliente\">Sair</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                    </li>\n");
      out.write("            </ul>\n");
      out.write("            ");
}else{
      out.write("\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\" style='margin-right:2px'>\n");
      out.write("                <li><a href=\"./?p=FrmLoginCliente.jsp\"> Logar</a></li>\n");
      out.write("            </ul>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"\" style=\"padding-top:60px;padding-bottom:30px\">\n");
      out.write("    <header class=\"container\">\n");
      out.write("        <div id=\"carousel-example-generic\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("            <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\"> </li>\n");
      out.write("                <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"> </li>\n");
      out.write("                <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"> </li>\n");
      out.write("            </ol>\n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("                <div class=\"item active\">\n");
      out.write("                    <img src=\"img/fundo.jpg\" alt=\"First slide\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img src=\"img/fundo2.jpg\" alt=\"Second slide\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img src=\"img/fundo3.jpg\" alt=\"Third slide\"/>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"item\">\n");
      out.write("                    <img src=\"img/logofox.jpg\" alt=\"Third slide\"/>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    <section class=\"container\">\n");
      out.write("        ");
 String pag = request.getParameter("p"); 
      out.write("\n");
      out.write("        ");
 pag = (pag == null)?"":pag; 
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response,  pag , out, false);
      out.write("\n");
      out.write("        <script>\n");
      out.write("            (function(d, s, id) {\n");
      out.write("            var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("            if (d.getElementById(id)) return;\n");
      out.write("            js = d.createElement(s); js.id = id;\n");
      out.write("            js.src = \"//connect.facebook.net/pt_BR/sdk.js#xfbml=1&version=v2.6\";\n");
      out.write("            fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("            }(document, 'script', 'facebook-jssdk'));\n");
      out.write("        </script>\n");
      out.write("        <div class=\"painelfacebook\">\n");
      out.write("             <div class=\"fb-page\" data-href=\"https://www.facebook.com/facebook\" data-tabs=\"timeline\" data-width=\"500\" data-height=\"600\" data-small-header=\"true\" data-adapt-container-width=\"false\" data-hide-cover=\"true\" data-show-facepile=\"false\"><blockquote cite=\"https://www.facebook.com/facebook\" class=\"fb-xfbml-parse-ignore\"><a href=\"https://www.facebook.com/facebook\">Facebook</a></blockquote></div>\n");
      out.write("             <img src=\"img/facebook.png\" alt=\"\">\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <footer class=\"container\">\n");
      out.write("        <div class=\"col-md-6 text-center\" id=\"contato\">\n");
      out.write("            <h3 class=\"text-center vermelhof\">Fox Auto Center</h3>\n");
      out.write("            <h3 class=\"text-center branco\">asdsaassa, Nº0000<br>\n");
      out.write("            Bairro, Cidade -RJ</h3>\n");
      out.write("            <h3 class=\"text-center branco\">(XX) - 7XXX - XXXX</h3>\n");
      out.write("            <h3 class=\"text-center branco\">(XX) - X 7XXX - XXXX</h3> \n");
      out.write("            <h3 class=\"text-center branco\">(XX) - 9 9777 - XXXX</h3>\n");
      out.write("            <h3 class=\"text-center branco\">XXXXXXXXX@XXXXX.COM</h3>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6 mapa txtfooter\">\n");
      out.write("            <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d117761.59558166543!2d-43.56716484028969!3d-22.726388007560995!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x995d694889f955%3A0x23ff502568217834!2sNova+Igua%C3%A7u%2C+RJ!5e0!3m2!1spt-BR!2sbr!4v1466640117734\" width=\"570\" height=\"360\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>\n");
      out.write("        </div>\n");
      out.write("        <br><i class=\"branco col-md-12 txtfooter\" style='padding:20px'>© COPYRIGHT 2016 - A.L.E.M., TODOS OS DIREITOS RESERVADOS.</i> \n");
      out.write("    </footer>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/scripts.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
