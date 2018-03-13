<?php
	class CompraDao{
		private $con;
		
		public function __construct(){
			$this->con = new Conexao();
			$this->con = $this->con->getConnection();
		}
		
		public function insert($compra){
			$sql = "insert into compra (idConta,produto,valor,data) values(:1,:2,:3,:4)";
			$stmt = $this->con->prepare($sql);
			$stmt->bindValue(":1",$compra->get("idConta"));
			$stmt->bindValue(":2",$compra->get("produto"));
			$stmt->bindValue(":3",$compra->get("valor"));
			$stmt->bindValue(":4",$compra->get("data"));
			$stmt->execute();
		}
		
		public function select(){
			$sql = "select * from compra";
			$stmt = $this->con->prepare($sql);
			$stmt->execute();
			return $stmt;
		}
		
		public function deletar($compra){
			$sql = "delete from compra where id=:1";
			$stmt = $this->con->prepare($sql);
			$stmt->bindValue(":1",$compra->get("id"));
			$stmt->execute();
		}
	}
?>