<?php
	class UsuarioDao{
		private $con;
		
		public function __construct(){
			$this->con = new Conexao();
			$this->con = $this->con->getConnection();
		}
		public function insert($usuario){
			$sql = "insert into usuario(login,senha) values(:1,md5(:2))";
			$stmt = $this->con->prepare($sql);
			$stmt->bindValue(":1",$usuario->get("login"));
			$stmt->bindValue(":2",$usuario->get("senha"));
			$stmt->execute();
		}
		public function select(){
			$sql = "select * from usuario";
			$stmt = $this->con->prepare($sql);
			$stmt->execute();
			return $stmt;
		}
		public function selectBy($usuario){
			$sql = "select * from usuario where login=:1 and senha=md5(:2)";
			$stmt = $this->con->prepare($sql);
			$stmt->bindValue(":1",$usuario->get("login"));
			$stmt->bindValue(":2",$usuario->get("senha"));
			$stmt->execute();
			return $stmt;
		}
	}
?>