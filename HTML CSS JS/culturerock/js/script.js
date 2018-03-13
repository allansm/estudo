var contador = 0;
var removido = 0;
function removePrice(preco,contador){
	var price = document.getElementById("price").innerHTML;
	document.getElementById("price").innerHTML = parseFloat(price)-parseFloat(preco)+".00";
	document.getElementById("car"+contador).style.display = "none";
	removido++;
}
function getPrice(preco,produto){
	if(contador-removido < 10){
		var price = document.getElementById("price").innerHTML;
		document.getElementById("price").innerHTML = parseFloat(price)+parseFloat(preco)+".00";
		document.getElementById("item").innerHTML += "<div id='car"+contador+"'><br/><button onclick='removePrice("+preco+","+contador+")' class='btn blackbg well whitefont' style='min-width:100%;max-width:100%;font-size:0.6em;clear:both'> remover:<br/>"+produto+"</button></div>";
		contador++;


	}else{
		alert("impossivel adicionar mais itens");
	}

}
function element(campo){
	return document.getElementById(campo);
}
function value(campo){
	var a = element(campo);
	return a.value;
}
function ok(campo){
	var a = element(campo);
	a.style.border="1px solid #0f0";
	alert("funfou");
}
function err(campo){
	var a = element(campo);
	a.style.border="1px solid #900";
}
function php(comando){
	document.body.innerHTML += "<?php"+comando+"?>";
}
function css(comando){
	document.head.innerHTML += "<style>"+comando+"</style>";
}
function modal(url,nome){
	document.getElementById("imgModal").innerHTML = "<img src='"+url+"'>";
	document.getElementById("tituloModal").innerHTML = nome;
}





