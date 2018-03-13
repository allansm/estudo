<%@page import="entidade.Servico"%>
<%@page import="java.util.List"%>
<%@page import="persistencia.ServicoDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="autocentralizar hf  vermelho" id="servico" style=''>
    <h1>Serviços</h1>
</div>
<%
    try{
        String img = null;
        List<Servico> lista = new ServicoDao().buscar();
        for(Servico s:lista){
            img = (s.getImage() == null || s.getImage().equals(""))?"<img src='img/no-image.png' style='width:270px;height:270px;'>":"<img src='"+s.getImage()+"' style='width:270px;height:270px;'>";
            out.println("<form method='post' action='CadVendaServico'><div class='motor col-md-4' ><div class='texto text-center fpreto txtmotor'>"+s.getTipo()+"</div><div class='imagens'><a href='./?p="+s.getDica()+"'>"+img+"</a></div><br/><br/><h4><center>Custo:R$"+s.getPreco()+"<br/><br/><input type='text' name='servico' value='"+s.getId()+"' style='display:none'></h4><input type='submit' value='comprar' class='bt'></center></div></form>");

        }
    }catch(Exception e){}
%>
