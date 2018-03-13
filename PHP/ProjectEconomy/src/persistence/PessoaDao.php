<?php
	class PessoaDao{
		private $con;
		public function __construct(){
			$this->con = new Conexao();
			$this->con = $this->con->getConnection();
		}
		public function insert($pessoa){
			$sql = "insert into pessoa(nome,sobrenome,email,telefone) values(:1,:2,:3,:4)";
			$stmt = $this->con->prepare($sql);
			$stmt->bindValue(":1",$pessoa->get("nome"));
			$stmt->bindValue(":2",$pessoa->get("sobrenome"));
			$stmt->bindValue(":3",$pessoa->get("email"));
			$stmt->bindValue(":4",$pessoa->get("telefone"));
			$stmt->execute();
		}
		public function select(){
			$sql = "select * from pessoa";
			$stmt = $this->con->prepare($sql);
			$stmt->execute();
			return $stmt;
		}
	}
?>