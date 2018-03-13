<?php
	//compra conta usuario pessoa
	class Conexao{
		public function getConnection(){
			return new PDO("mysql:host=localhost;dbname=economy","root","");
		}
	}
?>