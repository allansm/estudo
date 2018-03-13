function element(id){
    return document.getElementById(id);
}
function display(id,type){
	var elemento = element(id);
	elemento.style.display = type;
}
function exibir(n){
    var pag = element("cont"+n);
    function displaynone(){
        var elemento;
        for(var i = 1; i < 6; i++){
            elemento = element("cont"+i);
            elemento.style.display = "none";
        }
    }
    displaynone();
    pag.style.display = "block";    
}
function trailer(url,time){
	var duration = ((time*60)*1000);
	duration += (duration*0.50);
	url+="?autoplay=1&iv_load_policy=3&showinfo=0";
	display("carousel-example-generic","none");
	var trailer = element("trailer");
	trailer.innerHTML = "<iframe id='video' class='col-md-8 fill insetborder insetshadow nopadding' height='500' src='"+url+"' frameborder='0' allowfullscreen></iframe>";
	display("trailer","block");
	var video = element("video");
	setTimeout(function(){display("carousel-example-generic","block"); display("trailer","none");trailer.innerHTML="";},duration);
}
function showValue(v,b){
	 
	var  l = element(v);
	var y = element(b);
	y.innerHTML = "R$"+l.value;
}
