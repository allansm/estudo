<form method="post" action="UpdateCliente">
    <div class="autocentralizar hf  vermelho" id="servico" style=''>
        <h1>Configuração</h1>
    </div>
    <div  class='col-md-12 nopadding' style='padding-left:300px;padding-right:300px;padding-bottom:50px;margin:auto'>
        
        <%
            String[] l = {"nome","email","telefone","endereco"};
            for(String s:l){
                out.println(s+"<br/><br/><input type='text' name='"+s+"' value='"+request.getAttribute(s)+"'><br/><br/>");
            }
        %>
        nova senha:<br/><br/><input type="password" name="pass" value=""><br/><br/>
        <input type="submit" value="Atualizar">
    </div>
</form>

