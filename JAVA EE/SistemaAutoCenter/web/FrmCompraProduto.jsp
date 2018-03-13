<%@page import="entidade.Produto"%>
<%@page import="java.util.List"%>
<%@page import="persistencia.ProdutoDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="autocentralizar hf  vermelho" id="servico" style=''>
    <h1>Produtos</h1>
</div>
<%
    try{
        String select = null;
        String img = null;
        List<Produto> lista = new ProdutoDao().buscar();
        for(Produto p:lista){
            if(p.getQuantidade() > 0){
                img = (p.getImage() == null || p.getImage().equals(""))?"<img src='img/no-image.png' style='width:270px;height:270px;'>":"<img src='"+p.getImage()+"' style='width:270px;height:270px;'>";
                select = "<select name='quantidade'>";
                for(int i = 1; i <= p.getQuantidade();i++){
                    select+="<option value='"+i+"'>"+i+"</option>";
                }
                select+="</select>";
                out.println("<form method='post' action='CadVenda'><div class='motor col-md-4'><div class='texto text-center fpreto txtmotor'>"+p.getNome()+"</div><div class='imagens'>"+img+"</div><br/><br/><center><h4>A partir de:R$"+p.getPrecoUnitario()+"<br/><br/>Disponivel:"+p.getQuantidade()+"<br/><br/>Comprar:"+select+"<br/><br/><input type='text' name='produto' value='"+p.getId()+"' style='display:none'></h4></center><input type='submit' value='comprar' class='bt'></div></form>");
            }
        }
    }catch(Exception e){}
%>
        
