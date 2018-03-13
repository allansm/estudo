<?php
	function verifyPattern($value){
		if(strpos($value,"email") !== false){
			$pattern = 'pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" title="Exemplo : xxxx@xxxx.xxx.xx ou xxxx@xxxx.xxx"';
		}else if(strpos($value,"nome") !== false){
			$pattern = 'pattern="[A-Za-z]+" title="apenas letras"';
		}else if(strpos($value,"senha")!== false){
			$pattern = ' title="letras numeros e characters especiais"';
		}else if(strpos($value,"telefone")!== false){
			$pattern = 'pattern="\d{4,5}[\-]\d{4}" title="Exemplo : xxxx-xxxx ou xxxxx-xxxx"';
		}else if(strpos($value,"usuario")!== false || strpos($value,"login")!== false){
			$pattern = 'pattern="[a-zA-Z0-9]+" title="apenas letras e numeros"';
		}else if(strpos($value,"cpf")!== false){
			$pattern = 'pattern="\d{3}[\.]\d{3}[\.]\d{3}[\-]\d{2}" title="Exemplo : xxx.xxx.xxx-xx"';
		}else if(strpos($value,"data")!== false){
			$pattern = 'pattern="\d{2}[\/]\d{2}[\/]\d{4}" title="Exemplo : xx/xx/xxxx"';
		}else{
			$pattern = "";
		}
		return $pattern;
	}
	function createForm($bt,$action){
		$array = func_get_args();
		print("<form method='post' action='$action' class='formulario'>");
		foreach($array as $value){
			if($value != $bt && $value != $action){
				$pattern = verifyPattern($value);
				if(strpos($value,"senha") !== false){
					print("$value:<br/><input type='password' name='$value' class='passwordfield' required $pattern><br/><br/>");
				}else{
					print("$value:<br/><input type='text' name='$value' class='textfield' required $pattern><br/><br/>");
				}
			}
		}
		print("<input type='submit' value='$bt' class='bt'>");
		print("</form>");
	}
	function href($location){
		print("<script>location.href='$location'</script>");
	}
	function alert($text){
		print("<script>alert('$text');</script>");
	}
?>