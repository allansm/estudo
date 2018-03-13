<div class="col-md-8 well display" style="" id="cont5">
    <?php
        print("<div class='col-md-12 well bluefont outsetborder outsetshadow display'>");
        print("<h2 class='well nopadding'><span class='glyphicon glyphicon-user'></span>Cadastro</h2>");
        $cadastro = array("nome"=>@$_POST["nome"],"sobrenome"=>@$_POST["sobrenome"],"email"=>@$_POST["email"],"telefone"=>@$_POST["telefone"],"sexo"=>@$_POST["sexo"],"login"=>@$_POST["login"],"senha"=>@$_POST["senha"],"repetir_senha"=>@$_POST["repetir_senha"]);
        print("<form method='post' action='./?p=cadastrar.php'>");
		$n = 0;
		$pattern = " pattern='[a-zA-Z0-9]+'  title='somente letras e numeros'";
		$passpattern = " pattern='[a-zA-Z0-9]{8,}'  title='somente letras e numeros de no minimo 8 caracteres'";
		$telpattern = " pattern='^\d{4,5}-\d{4}$' title='xxxx-xxxx ou xxxxx-xxxx'";
		$emailpattern = "/^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$/";
		foreach($cadastro as $campo=>$valor){
			if($n < 2){
				$grid = "col-md-6 col-sm-6 col-xs-12";
			}else{
				$grid = "col-md-4 col-sm-4 col-xs-12";
			}if($n == 5){
				$grid = "col-md-4 col-sm-4 col-xs-12 clearfix";
			}

			if($campo == "sexo"){
				print("<div class='$grid'>$campo:<br/>
					<select name='$campo' class='form-control'>
							<option value='M'>Masculino</option>
							<option value='F'>Feminino</option>
					</select></div>"
				);$n++;
			}else if($campo == "senha" || $campo == "repetir_senha"){
				print(
						"<div class='$grid'>$campo:<br/><input type='password' name='$campo' id='input'class=' form-control' required='required' $passpattern></div>"
				);$n++;

			}else{
				if($campo == "email"){
					$format = $emailpattern;
				}else{
					$format = ($campo == "telefone")?$telpattern:$pattern;
				}
				print("
					<div class='$grid'>$campo:<br/><input type='text' name='$campo' id='input' class=' form-control'  required='required'  $format></div>

				");$n++;
			}
		}
        print("<div class='col-md-12 col-sm-12 col-xs-12 well'><button type='submit' class='bt blackhover outsetborder outsetshadow  clearfix'>Cadastrar</button></div>");
        print("</form>");
        print("</div>");
    ?>
</div>