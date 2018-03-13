<?php
	include("../connection/Conexao.php");
	include("../entity/Pessoa.php");
	include("../entity/Usuario.php");
	include("../persistence/PessoaDao.php");
	include("../persistence/UsuarioDao.php");
	include("../entity/Conta.php");
	include("../persistence/ContaDao.php");
	
	$pessoa = new Pessoa();
	$usuario = new Usuario();
	foreach($_POST as $field=>$value){
		$$field = $value;
	}
	$pessoa->set("nome",$nome);
	$pessoa->set("sobrenome",$sobrenome);
	$pessoa->set("email",$email);
	$pessoa->set("telefone",$telefone);
	
	$usuario->set("login",$login);
	$usuario->set("senha",$senha);
	
	if($usuario->get("senha") == $csenha){
		try{
			$pessoaDao = new PessoaDao();
			$pessoaDao->insert($pessoa);
			
			$usuarioDao = new UsuarioDao();
			$usuarioDao->insert($usuario);
			
			$conta = new Conta();
			
			$pessoaDao = new PessoaDao();
			$stmt = $pessoaDao->select();
			while($row = $stmt->fetch(PDO::FETCH_ASSOC)){
				if($row["nome"] == $pessoa->get("nome")){
					$conta->set("pessoa",$row["id"]);
				}
			}
			
			$usuarioDao = new UsuarioDao();
			$stmt = $usuarioDao->select();
			while($row = $stmt->fetch(PDO::FETCH_ASSOC)){
				if($row["login"] == $usuario->get("login")){
					$conta->set("usuario",$row["id"]);
				}
			}
			
			$contaDao = new ContaDao();
			$conta->set("saldo",0);
			$contaDao->insert($conta);
			print("cadastro efetuado com sucesso");
		}catch(Exception $e){
			print("erro ao cadastrar");
		}
	}
?>