<?php
	class Usuario{
		private $id;
		private $login;
		private $senha;
		
		public function get($var){
			return $this->$var;
		}
		public function set($var,$value){
			$this->$var = $value;
		}
	}
?>