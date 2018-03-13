<?php
    class cartaz{
        public $img;
        public $nome;
        public $genero;
        public $elenco;
        public $direcao;
        public $duracao;
        public $classificacao;
        public $distribuidor;
        function __construct($img,$nome,$genero,$elenco,$direcao,$duracao,$classificacao,$distribuidor){
            $this->img = $img;
            $this->nome = $nome;
            $this->genero = $genero;
            $this->elenco = $elenco;
            $this->direcao = $direcao;
            $this->duracao = $duracao;
            $this->classificacao = $classificacao;
            $this->distribuidor = $distribuidor;
        }
    }
    class trailer{
        public $img;
        public $duration;
        public $title;
		public $url;
        function __construct($img,$duration,$title,$url){
            $this->img = $img;
            $this->duration = $duration;
            $this->title = $title;
			$this->url = $url;
        }
    }
    class sinopse{
        public $img;
        public $titulo;
        public $txt;
        function __construct($img,$titulo,$txt){
            $this->img = $img;
            $this->titulo = $titulo;
            $this->txt = $txt;
        }
    }
	class ingresso{
		public $filme;
		public $sala;
		public $tipo;
		public $horario;
		function __construct($filme,$sala,$tipo,$horario){
            $this->filme = $filme;
            $this->sala = $sala;
            $this->tipo = $tipo;
			$this->horario = $horario;
        }
	}
	class compra{
		public $entrada;
		public $valor;
		public $ingresso;
		function __construct($entrada,$valor,$ingresso){
            $this->entrada = $entrada;
            $this->valor = $valor;
			$this->ingresso = $ingresso;
        }
	}
?>