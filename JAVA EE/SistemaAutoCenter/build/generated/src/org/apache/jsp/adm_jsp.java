package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.login_usuario != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("<html lang=\"pt-br\">\r\n");
          out.write("  <head>\r\n");
          out.write("    <meta charset=\"utf-8\">\r\n");
          out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
          out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
          out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
          out.write("    <!--[if lt IE 9]>\r\n");
          out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
          out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
          out.write("    <![endif]-->\r\n");
          out.write("    <link rel=\"stylesheet\" href=\"css/adm.css\">\r\n");
          out.write("  </head>\r\n");
          out.write("  <body>\r\n");
          out.write("\t<nav class=\"navbar black\" role=\"navigation\">\r\n");
          out.write("\t\t<div class=\"navbar-header\">\r\n");
          out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\r\n");
          out.write("\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\r\n");
          out.write("\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
          out.write("\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
          out.write("\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
          out.write("\t\t\t</button>\r\n");
          out.write("\t\t\t<a class=\"navbar-brand\" href=\"#\">Sistema Auto Center</a>\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t\t<div class=\"collapse navbar-collapse navbar-ex1-collapse\">\r\n");
          out.write("\t\t\t<ul class=\"nav navbar-nav\">\r\n");
          out.write("\t\t\t\t<li class=\"active\"><a href=\"./adm.jsp?p=FrmProduto.jsp\">Cadastro de produtos</a></li>\r\n");
          out.write("\t\t\t\t<li><a href=\"./adm.jsp?p=FrmServico.jsp\">Cadastro de serviços</a></li>\r\n");
          out.write("\t\t\t\t<li><a href=\"./adm.jsp?p=FrmUsuario.jsp\">Cadastro de usuario</a></li>\r\n");
          out.write("\t\t\t\t<li><a href=\"BuscaProduto\">Buscar produtos</a></li>\r\n");
          out.write("\t\t\t\t<li><a href=\"BuscaServico\">Buscar serviços</a></li>\r\n");
          out.write("\t\t\t\t<li><a href=\"BuscaCliente\">Buscar Clientes</a></li>\r\n");
          out.write("\t\t\t</ul>\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t<li class=\"dropdown\">\r\n");
          out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
            return;
          out.write("<b class=\"caret\"></b></a>\r\n");
          out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
          out.write("\t\t\t\t\t\t<li><a href=\"LogoutUsuario\">Sair</a></li>\r\n");
          out.write("\t\t\t\t\t</ul>\r\n");
          out.write("\t\t\t\t</li>\r\n");
          out.write("\t\t\t</ul>\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t</nav>\r\n");
          out.write("        ");
 String pag = request.getParameter("p"); 
          out.write("\r\n");
          out.write("        ");
 pag = (pag == null)?"":pag; 
          out.write("\r\n");
          out.write("        ");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response,  pag , out, false);
          out.write("\r\n");
          out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
          out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
          out.write("  </body>\r\n");
          out.write("\r\n");
          out.write("</html>\r\n");
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.login_usuario}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.login_usuario == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    ");
        if (true) {
          _jspx_page_context.forward("FrmLoginUsuario.jsp");
          return true;
        }
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
