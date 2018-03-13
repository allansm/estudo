<?php
	class ContaDao{
		private $con;
		
		public function __construct(){
			$this->con = new Conexao();
			$this->con = $this->con->getConnection();
		}
		
		public function insert($conta){
			$sql = "insert into conta (pessoa,usuario,saldo) values(:1,:2,:3)";
			$stmt = $this->con->prepare($sql);
			$stmt->bindValue(":1",$conta->get("pessoa"));
			$stmt->bindValue(":2",$conta->get("usuario"));
			$stmt->bindValue(":3",$conta->get("saldo"));
			$stmt->execute();
		}
		public function select(){
			$sql = "select * from conta";
			$stmt = $this->con->prepare($sql);
			$stmt->execute();
			return $stmt;
		}
		public function depositar($conta){
			$sql = "update conta set saldo=:1 where id=:2";
			$stmt = $this->con->prepare($sql);
			$stmt->bindValue(":1",$conta->get("saldo"));
			$stmt->bindValue(":2",$conta->get("id"));
			$stmt->execute();
		}
	}
?>