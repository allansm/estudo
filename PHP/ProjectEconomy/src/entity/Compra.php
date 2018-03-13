<?php
	class Compra{
		private $id;
		private $idConta;
		private $produto;
		private $valor;
		private $data;
		
		public function get($var){
			return $this->$var;
		}
		public function set($var,$value){
			$this->$var = $value;
		}
	}
?>