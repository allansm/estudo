//<script src="js/jquery.min.js"></script>
//<script src="js/scripts.js"></script>

$(function() {
    //FUNÇÃO PARA ATIVAR O SCROOL SUAVE COM A class="scroll"
    $(".scroll").click(function(event){
        event.preventDefault();
        $('html, body').animate({scrollTop:$(this.hash).offset().top - 50}, 1200);
    });
    
   //Modal com fotos no valor
    $('.foto').click(function(){
        var nomeFoto = $(this).attr('src');
        //console.error("Erro: "+ nomeFoto);
        $('#myModal').show(function(){
            $('.modal-body').html("<img src='" + nomeFoto + "' class='col-xs-12'>");
        });
    });
    
});
