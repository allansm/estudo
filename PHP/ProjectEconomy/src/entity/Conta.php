<?php
	class Conta{
		private $id;
		private $pessoa;
		private $usuario;
		private $saldo;
		
		public function get($var){
			return $this->$var;
		}
		public function set($var,$value){
			$this->$var = $value;
		}
	}
?>