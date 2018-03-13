/* valida.js*/

var cont = 1;
var i = 0;
var cadastro = [];
var indeX = i;
var deletados = 0;
var msg = "";

function contador(){
	var bg = "bg";
	if(cont >4){
		cont=1;
	}
	bolaCinza();
	document.getElementById("b"+cont).style.background = "#000";
	document.getElementById("bg").src = "img/"+bg+cont+".jpg";
	cont++;
}

function bolaCinza(){
	
	document.getElementById("b1").style.background = "#afafaf";
	document.getElementById("b2").style.background = "#afafaf";
	document.getElementById("b3").style.background = "#afafaf";
	document.getElementById("b4").style.background = "#afafaf";
}
function mudaFoto(n){
	var bg = "bg";
	bolaCinza();
	document.getElementById("b"+n).style.background = "#000";
	document.getElementById("bg").src = "img/"+bg+n+".jpg";
}

function Exibe1(){
	document.getElementById("conteudo1").style.display = "block";
	document.getElementById("conteudo2").style.display = "none";
	document.getElementById("conteudo3").style.display = "none";
	document.getElementById("conteudo4").style.display = "none";
	document.getElementById("conteudo5").style.display = "none";
	document.getElementById("conteudo6").style.display = "none";
}

function Exibe2(){
	document.getElementById("conteudo1").style.display = "none";
	document.getElementById("conteudo2").style.display = "block";
	document.getElementById("conteudo3").style.display = "none";
	document.getElementById("conteudo4").style.display = "none";
	document.getElementById("conteudo5").style.display = "none";
	document.getElementById("conteudo6").style.display = "none";
}

function Exibe3(){
	document.getElementById("conteudo1").style.display = "none";
	document.getElementById("conteudo2").style.display = "none";
	document.getElementById("conteudo3").style.display = "block";
	document.getElementById("conteudo4").style.display = "none";
	document.getElementById("conteudo5").style.display = "none";
	document.getElementById("conteudo6").style.display = "none";
}

function Exibe4(){
	document.getElementById("conteudo1").style.display = "none";
	document.getElementById("conteudo2").style.display = "none";
	document.getElementById("conteudo3").style.display = "none";
	document.getElementById("conteudo4").style.display = "block";
	document.getElementById("conteudo5").style.display = "none";
	document.getElementById("conteudo6").style.display = "none";
}

function Exibe5(){
	document.getElementById("conteudo1").style.display = "none";
	document.getElementById("conteudo2").style.display = "none";
	document.getElementById("conteudo3").style.display = "none";
	document.getElementById("conteudo4").style.display = "none";
	document.getElementById("conteudo5").style.display = "block";
	document.getElementById("conteudo6").style.display = "none";
}
function Exibe6(){
	document.getElementById("conteudo1").style.display = "none";
	document.getElementById("conteudo2").style.display = "none";
	document.getElementById("conteudo3").style.display = "none";
	document.getElementById("conteudo4").style.display = "none";
	document.getElementById("conteudo5").style.display = "none";
	document.getElementById("conteudo6").style.display = "block";
}
function autorizar(){
	var nome = document.getElementById("nome").value;
	var idade = document.getElementById("idade").value;
	var tel = document.getElementById("tel").value;
	var email = document.getElementById("email").value;
	var sexo = getRadioValue();
	var autorizacao = false;
	var erro = 0;
	if(nome == "" || nome == null){
		erro++;
		err("nome");
	}else{
		ok("nome");
	}
	if(idade == "" || idade == null){
		erro++;
		err("idade");
	}else{
		ok("idade");
	}
	if(tel == "" || tel == null){
		erro++;
		err("tel");
	}else{
		ok("tel");
	}
	if(email == "" || email == null || verificaEmail() == false){
		erro++;
		err("email");
	}else{
		ok("email");
	}
	if(sexo == "" || sexo == null){
		erro++;
	}
	if(erro == 0){
		autorizacao = true;
		//alert("usuario cadastrado");
	}else{
		msg = "falha na autenticação";
		mensagem();
	}
	return autorizacao;
}

function getRadioValue(){
	for (var i = 0; i < document.getElementsByName("sexo").length; i++){
    	if (document.getElementsByName("sexo")[i].checked){
    		return document.getElementsByName('sexo')[i].value;
    	}
    }
}
function restauraBorda(campo){
	document.getElementById(campo).style.border = "1px solid #546586";
}
function limpaBorda(){
	/*document.getElementById("nome").style.border = "1px solid #546586";
	document.getElementById("tel").style.border = "1px solid #546586";
	document.getElementById("email").style.border = "1px solid #546586";
	document.getElementById("idade").style.border = "1px solid #546586";
	document.getElementById("nomeB").style.border = "1px solid #546586";
	document.getElementById("emailB").style.border = "1px solid #546586";
	document.getElementById("areaDeTexto").style.border = "1px solid #546586";*/
	restauraBorda("nome");
	restauraBorda("tel");
	restauraBorda("email");
	restauraBorda("idade");
	restauraBorda("nomeB");
	restauraBorda("emailB");
	restauraBorda("areaDeTexto");
}
function limpaCampo(tipo){
	if(tipo == "formulario"){
		var nome = document.getElementById("nome").value = "";
		var idade = document.getElementById("idade").value = "";
		var tel = document.getElementById("tel").value = "";
		var email = document.getElementById("email").value = "";
		limpaBorda();
	}else if(tipo == "deletar"){
		var nome = document.getElementById("nome2").value = "";
	}else if(tipo == "consultar"){
		var id = document.getElementById("id").value = "";
		var nome = document.getElementById("nome3").value = "";
	}else if(tipo == "faleConosco"){
		var nome = document.getElementById("nomeB").value = "";
		var email = document.getElementById("emailB").value = "";
		var txt = document.getElementById("areaDeTexto").value = "";
	}
	
}
function ok(campo){
	document.getElementById(campo).style.border = "1px solid #0b0";
}
function err(campo){
	document.getElementById(campo).style.border = "1px solid red";
}


function adicionar(){
	if(autorizar() == true){
		var nome = document.getElementById("nome").value;
		var idade = document.getElementById("idade").value;
		var sexo = getRadioValue();
		var tel = document.getElementById("tel").value;
		var email = document.getElementById("email").value;
		cadastro[i] = {"nome":nome,"idade":idade,"sexo":sexo,"tel":tel,"email":email};
		i++;
		indeX = i-deletados;
		refresca("add");
		limpaCampo("formulario");
	}
	
}
function buscar(){
	var id = document.getElementById("id").value;
	//alert(cadastro[id].nome + " "+cadastro[id].idade+" "+cadastro[id].sexo+" "+cadastro[id].tel+" "+cadastro[id].email);
	if(id != "" && cadastro[id].nome != ""){
		//var campo = document.getElementById("dados").innerHTML = "<b>nome:</b>"+cadastro[id].nome+"<br/>"+"<b>idade:</b>"+cadastro[id].idade+"<br/>"+"<b>sexo:</b>"+cadastro[id].sexo+"<br/>"+"<b>tel:</b>"+cadastro[id].tel+"<br/>"+"<b>email:</b>"+cadastro[id].email;
		document.getElementById("nome").value = cadastro[id].nome;
		document.getElementById("idade").value = cadastro[id].idade;
		if(cadastro[id].sexo == "M"){
			document.getElementById("M").checked = true;
		}else if(cadastro[id].sexo == "F"){
			document.getElementById("F").checked = true;
		}
		document.getElementById("tel").value = cadastro[id].tel;
		document.getElementById("email").value = cadastro[id].email;
		msg = "usuario encontrado";
	}else{
		//var campo = document.getElementById("dados").innerHTML = "";
		document.getElementById("nome").value = "";
		document.getElementById("idade").value = "";
		//document.getElementById("sexo").value = "";
		document.getElementById("tel").value = "";
		document.getElementById("email").value = "";
		msg = "usuario não existe";
	}
	limpaCampo("consultar");
	Exibe2();
	mensagem();
}
function buscarNome(){
	var nome = document.getElementById("nome3").value;
	for(n = 0; n < i; n++){
		if(cadastro[n].nome == nome && nome != ""){
			//var campo = document.getElementById("dados").innerHTML = "<b>nome:</b>"+cadastro[n].nome+"<br/>"+"<b>idade:</b>"+cadastro[n].idade+"<br/>"+"<b>sexo:</b>"+cadastro[n].sexo+"<br/>"+"<b>tel:</b>"+cadastro[n].tel+"<br/>"+"<b>email:</b>"+cadastro[n].email;
			document.getElementById("nome").value = cadastro[n].nome;
			document.getElementById("idade").value = cadastro[n].idade;
			if(cadastro[n].sexo == "M"){
				document.getElementById("M").checked = true;
			}else if(cadastro[n].sexo == "F"){
				document.getElementById("F").checked = true;
			}
			//document.getElementById("sexo").value = cadastro[n].sexo;
			document.getElementById("tel").value = cadastro[n].tel;
			document.getElementById("email").value = cadastro[n].email;
			msg = "usuario encontrado";
			break;
			
		}else{
			//var campo = document.getElementById("dados").innerHTML = "";
			document.getElementById("nome").value = "";
			document.getElementById("idade").value = "";
			//document.getElementById("sexo").value = "";
			document.getElementById("tel").value = "";
			document.getElementById("email").value = "";
			msg = "usuario não existe";
		}
	}
	limpaCampo("consultar");
	Exibe2();
	mensagem();
}
function deletar(){
	var nome = document.getElementById("nome2").value;
	for(n = 0;n < i; n++){
		if(cadastro[n].nome == nome && nome != ""){
			cadastro[n] = {"nome":"","idade":"","tel":"","email":""};
			//alert("usuario deletado com sucesso");
			refresca("del");
			break;
		}
	}
	limpaCampo("deletar");
}

function verificaEmail(){
	var conf1 = false;
	var conf2 = false;
	var aux ;
	var email = document.getElementById("email").value;
	for(n = 0; n < email.length;n++){
		if(email.charAt(n) == "@"){
			conf1 = true;
		}
	}
	aux = ""+email.charAt(email.length - 4)+email.charAt(email.length - 3)+email.charAt(email.length - 2)+email.charAt(email.length - 1);
	if(aux == ".com"){
		conf2 = true;
	}else{
		aux = ""+email.charAt(email.length - 3)+email.charAt(email.length - 2)+email.charAt(email.length - 1);
		if(aux == ".br"){
			conf2 = true;
		}
	}
	if(conf1 == true && conf2 == true){
		return true;
	}else{
		return false;
	}
	
}
function mensagem(){
	document.getElementById("alerta").innerHTML = msg;
	setTimeout(function(){document.getElementById("alerta").innerHTML = "";},1500);
	
}
function refresca(tipo){
	
	if(tipo == "add"){
		var div = document.getElementById("contaUsuario").innerHTML = "<br/>Usuarios cadastrados:"+indeX;
		msg = "usuario cadastrado com sucesso";
	}else if(tipo == "del"){
		indeX--;
		deletados++;
		var div = document.getElementById("contaUsuario").innerHTML = "<br/>Usuarios cadastrados:"+indeX;
		msg = "usuario deletado com sucesso";
	}
	Exibe2();
	//alert(msg);
	mensagem();
}
function rodape(conteudo){
	var largura = window.innerWidth;
	if(largura < 600){
		if(conteudo == 1){
			document.getElementById("rodape").style.margin = "570px 0px 0px 2px";
		}else if(conteudo == 2){
			document.getElementById("rodape").style.margin = "-150px 0px 0px 2px";
		}else if(conteudo == 3){
			document.getElementById("rodape").style.margin = "2px 0px 0px 2px";
		}else if(conteudo == 4){
			document.getElementById("rodape").style.margin = "2px 0px 0px 2px";
		}else if(conteudo == 5){
			document.getElementById("rodape").style.margin = "2px 0px 0px 2px";
		}else if(conteudo == 6){
			document.getElementById("rodape").style.margin = "2px 0px 0px 2px";
		}
	}else{
		if(conteudo == 1){
			document.getElementById("rodape").style.margin = "2px 0px 0px 2px";
		}else if(conteudo == 2){
			document.getElementById("rodape").style.margin = "2px 0px 0px 2px";
		}else if(conteudo == 3){
			document.getElementById("rodape").style.margin = "2px 0px 0px 2px";
		}else if(conteudo == 4){
			document.getElementById("rodape").style.margin = "2px 0px 0px 2px";
		}else if(conteudo == 5){
			document.getElementById("rodape").style.margin = "2px 0px 0px 2px";
		}else if(conteudo == 6){
			document.getElementById("rodape").style.margin = "2px 0px 0px 2px";
		}
	}
	
}
function faleConosco(){
	var nome = document.getElementById("nomeB").value;
	var email = document.getElementById("emailB").value;
	var txt = document.getElementById("areaDeTexto").value;
	if(nome != "" && email != "" && txt != ""){
		var msg = "mensagem enviada com sucesso";
		var div = document.getElementById("alerta2").innerHTML = msg;
		nome = document.getElementById("nomeB").value = "";
		email = document.getElementById("emailB").value = "";
		txt = document.getElementById("areaDeTexto").value = "";
		limpaBorda();
		setTimeout(function(){document.getElementById("alerta2").innerHTML = "";},1500);
	}else{
		var msg = "campos invalidos"
		if(nome == ""){
			err("nomeB");
		}else{
			ok("nomeB");
		}
		if(email == ""){
			err("emailB");
		}else{
			ok("emailB");
		}
		if(txt == ""){
			err("areaDeTexto");
		}else{
			ok("areaDeTexto");
		}
		var div = document.getElementById("alerta2").innerHTML = msg;
		setTimeout(function(){document.getElementById("alerta2").innerHTML = "";},1500);
	}
}


