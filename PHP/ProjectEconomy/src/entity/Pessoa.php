<?php
	class Pessoa{
		private $id;
		private $nome;
		private $sobrenome;
		private $telefone;
		private $email;
		
		public function get($var){
			return $this->$var;
		}
		public function set($var,$value){
			$this->$var = $value;
		}
	}
?>