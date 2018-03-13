function err(element){
	document.getElementById(element).style.border="1px solid #ff0000";
}
function ok(element){
	document.getElementById(element).style.border="1px solid #00ff00";
}
function limpar(){
	document.getElementById("nome").style.border="1px solid #708090";
	document.getElementById("sobrenome").style.border="1px solid #708090";
	document.getElementById("cpf").style.border="1px solid #708090";
	document.getElementById("telefone").style.border="1px solid #708090";
	document.getElementById("email").style.border="1px solid #708090";
	document.getElementById("senha").style.border="1px solid #708090";
	document.getElementById("csenha").style.border="1px solid #708090";
	document.getElementById("nome").value = "";
	document.getElementById("sobrenome").value = "";
	document.getElementById("cpf").value = "";
	document.getElementById("telefone").value = "";
	document.getElementById("email").value = "";
	document.getElementById("senha").value = "";
	document.getElementById("csenha").value = "";
}
function verificarEmail(email){
	var conf1,conf2,aux;
	conf1 = false;
	conf2 = false;
	for(var i = 0; i < email.length -1; i++){
		if(email.charAt(i) == "@"){
			conf1 = true;
		} 
	}
	aux = ""+ email.charAt(email.length - 4)+ email.charAt(email.length - 3) + email.charAt(email.length - 2) + email.charAt(email.length - 1);
	if(aux == ".com"){
		conf2 = true;
	}else{
		aux = ""+ email.charAt(email.length -3)+ email.charAt(email.length -2)+ email.charAt(email.length - 1);
		if(aux == ".br"){
			conf2 = true;
		}else{
			conf2 = false;
		}
	}
	if(conf1 == true && conf2 == true){
		return true;
	}else{
		return false;
	}
}
function testaLogin(){
	var log,pass,email,senha;
	log = "allan@hotmail.com";
	pass = "123456";
	email = document.getElementById("emailLogin").value;
	senha = document.getElementById("senhaLogin").value;
	function limpa(){
		email = document.getElementById("emailLogin").value = "";
		senha = document.getElementById("senhaLogin").value = "";
	}
	if(email == log && senha == pass){
		alert("login efetuado com sucesso");
		limpa();
	}else{
		alert("email ou senha invalidos");
		limpa();
	}
}
function autenticar(){
	var nome,sobrenome,cpf,telefone,email,senha,csenha,curso,sexo,alerta;
	alerta = 0;
	nome = document.getElementById("nome").value;
	sobrenome = document.getElementById("sobrenome").value;
	cpf = document.getElementById("cpf").value;
	telefone = document.getElementById("telefone").value;
	email = document.getElementById("email").value;
	senha = document.getElementById("senha").value;
	csenha = document.getElementById("csenha").value;
	
	if(nome == "" || nome == null || nome.length < 3){
		err("nome");
		alerta++;
	}else{
		ok("nome");
	}
	if(sobrenome == "" || sobrenome == null || sobrenome.length < 3){
		err("sobrenome");
		alerta++;
	}else{
		ok("sobrenome");
	}
	if(cpf == "" || cpf == null || cpf.length < 11){
		err("cpf");
		alerta++;
	}else{
		ok("cpf");
	}
	if(telefone == "" || telefone == null || telefone.length < 8){
		err("telefone");
		alerta++;
	}else{
		ok("telefone");
	}
	if(email == "" || email == null || verificarEmail(email) == false){
		err("email");
		alerta++;
	}else{
		ok("email");
	}
	if(senha == "" || senha == null || senha.length < 6){
		err("senha");
		alerta++;
	}else{
		ok("senha");
	}
	if(senha != csenha || csenha == "" || csenha == null || csenha.length < 6){
		err("csenha");
		alerta++;
	}else{
		ok("csenha");
	}
	if(alerta > 0){
		alert("Os campos não foram preenchidos corretamente");
	}else{
		alert("Cadastro efetuado com sucesso");
		limpar();
	}
}
function faleConosco(){
	var nome,email,assunto,mensagem,alerta;
	alerta = 0;
	nome = document.getElementById("nome").value;
	email = document.getElementById("email").value;
	assunto = document.getElementById("assunto").value;
	mensagem = document.getElementById("msg").value;
	function limpa(){
		nome = document.getElementById("nome").style.border="1px solid #708090";
		email = document.getElementById("email").style.border="1px solid #708090";
		assunto = document.getElementById("assunto").style.border="1px solid #708090";
		mensagem = document.getElementById("msg").style.border="1px solid #708090";
		nome = document.getElementById("nome").value = "";
		email = document.getElementById("email").value = "";
		assunto = document.getElementById("assunto").value = "";
		mensagem = document.getElementById("msg").value = "";
	}
	
	if(nome == "" || nome == null || nome.length < 3){
		err("nome");
		alerta++;
	}else{
		ok("nome");
	}
	if(email == "" || email == null || verificarEmail(email) == false){
		err("email");
		alerta++;
	}else{
		ok("email");
	}
	if(assunto == "" || assunto == null || assunto.length < 4){
		err("assunto");
		alerta++;
	}else{
		ok("assunto");
	}
	if(mensagem == "" || mensagem == null || mensagem.length < 10){
		err("msg");
		alerta++;
	}else{
		ok("msg");
	}
	if(alerta > 0){
		alert("Os campos não foram preenchidos corretamente");
	}else{
		alert("Mensagem enviada com sucesso");
		limpa();
	}
}