<?php
	$erro = 0;
	$fNome = $_POST["fNome"];
	$fEmail = $_POST["fEmail"];
	$fMenssage = $_POST["fMenssage"];
	$fAssunto = $_POST["fAssunto"];
	if($erro == 0){
		try{
			$to = "allan_de_souza_melo@hotmail.com";
			$mensagem = "Mensagem enviada por: ".$fNome." em: ".date("d/m/Y - H:i")."\n <br />
			E-mail: ".$fEmail."\n <br />
			Assunto: ".$fAssunto."\n <br />
			Menssagem: \n <br />
			".$fMenssage;
			$headers = "MIME-Version: 1.0\r\n";
			$headers .= "Content-type: text/html; charset=iso-8859-1\r\n";
			$headers .= "From: $fEmail <$fEmail>\r\n";
			if($flag = mail($to,$fAssunto,$mensagem,$headers)){
				print("<script>alert('mensagem enviada com sucesso');</script>");
				print("<script>location.href='./?p=home.php'</script>");
			}else{
				print("<script>alert('falha no envio');</script>");
				print("<script>location.href='./?p=home.php'</script>");
			}
		}catch(Exception $e){
			print("<script>alert('erro ao enviar');</script>");
			print("<script>location.href='./?p=home.php'</script>");
		}
	}else{
		print("<script>alert('campos invalidos')</script>");
		print("<script>location.href='./?p=home.php'</script>");
	}
?>