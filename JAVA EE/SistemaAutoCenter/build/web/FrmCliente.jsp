<form method="post" action="CadCli">
    <div class="autocentralizar hf  vermelho" id="servico" style=''>
        <h1>Cadastro</h1>
    </div>
    <div  class='col-md-12 nopadding' style='padding-left:300px;padding-right:300px;padding-bottom:50px;margin:auto'>
        
        <%
            String[] l = {"nome","email","telefone","endereco"};
            for(String s:l){
                out.println(s+"<br/><br/><input type='text' name='"+s+"'><br/><br/>");
            }
        %>
        senha:<br/><br/><input type="password" name="pass"><br/><br/>
        confirmar-senha:<br/><br/><input type="password" name="cpass"><br/><br/>
        <input type="submit" value="cadastrar">
    </div>
</form>
