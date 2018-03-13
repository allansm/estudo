<?php
	class gestao{
		public static function cadastrarAluno(){
			$erro = 0;
			foreach($_POST as $campo=>$value){
				if($value == "" || $value == null){
					$erro++;
				}
				$$campo = $value;
			}
			include("conn.php");
			$sql = "insert into cadastro_aluno (nome,endereco,telefone,email) values ('$nome','$endereco','$telefone','$email')";
			($erro == 0)?$flag = true:$flag = false;
			(mysqli_query($con,$sql))?$query = true:$query = false;
			($flag && $query)?alert("cadastro efetuado com sucesso"):alert("não foi possivel cadastrar $nome");
			href("index.php");
		}
		public static function cadastrarProfessor(){
			$erro = 0;
			foreach($_POST as $campo=>$value){
				if($value == "" || $value == null){
					$erro++;
				}
				$$campo = $value;
			}
			include("conn.php");
			$sql = "insert into cadastro_professor (nome,telefone,email,cpf) values ('$nome','$telefone','$email','$cpf')";
			($erro == 0)?$flag = true:$flag = false;
			(mysqli_query($con,$sql))?$query = true:$query = false;
			($flag && $query)?alert("cadastro efetuado com sucesso"):alert("não foi possivel cadastrar $nome");
			href("index.php");
		}
		public static function cadastrarNota(){
			$erro = 0;
			$msg = "não foi possivel cadastrar a nota";
			foreach($_POST as $campo=>$value){
				if($campo == "nota"){
					if($value > 10 || $value < 0){
						$erro++;
						$msg = "valor da nota é invalido";
					}
				}
				if($value == "" || $value == null){
					$erro++;
				}
				$$campo = $value;
			}
			include("conn.php");
			$sql = "insert into nota (bimestre,ano,nota,idDisciplina,matricula) values ('$bimestre','$ano','$nota','$disciplina','$matricula')";
			($erro == 0)?$flag = true:$flag = false;
			(mysqli_query($con,$sql))?$query = true:$query = false;
			($flag && $query)?alert("cadastro efetuado com sucesso"):alert($msg);
			href("index.php");
		}
		public static function consultarAlunos(){
			include("conn.php");
			$sql ="select * from cadastro_aluno ;";
			$result = mysqli_query($con,$sql);
			while($row = mysqli_fetch_assoc($result)){
				print("<div class='bdashedborder  box'>");
				foreach($row as $campo=>$value){
					print("$campo : $value<br/><br/>");
				}
				print("</div>");
			}
		}
		public static function getDisciplina(){
			include("conn.php");
			$sql = "select * from disciplina";
			$result = mysqli_query($con,$sql);
			return $result;
		}
		public static function getMatricula(){
			include("conn.php");
			$sql = "select * from cadastro_aluno";
			$result = mysqli_query($con,$sql);
			return $result;
		}
	}
?>