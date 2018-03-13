<div class="col-md-8 col-xs-12 col-sm-12 well display" style="" id="">
    <?php
        print("<h5><b><span class='glyphicon glyphicon-comment'></span>&nbsp;Sinopse</b></h5>");
        print("<div class='outsetborder outsetshadow display well nopaddingleft nopaddingright'>");
		$contador = 0;
        for($i = 0; $i < 2; $i++){
			if($i == 0){
				if(strlen($sinopse[$i]->txt) >= strlen($sinopse[$i+1]->txt)){
					$borda = "rightborder";
					$contador++;
				}else{
					$borda = "";
				}
			}else{
				if($contador == 0){
					$borda = "leftborder";
				}else{
					$borda = "";
				}
			}
            print("	
                <div class='col-md-6 col-sm-12 col-xs-12 $borda   well display nopaddingtop' style='min-height:100%'>
                    <div class='col-md-12  well insetborder insetshadow nopadding' style='height:200px'>
                        <img src='img/".$sinopse[$i]->img."' style='height:200px' class='fill '>
                    </div>
                    <h4 class='bluefont'>".$sinopse[$i]->titulo."</h4>
                    <div class=' '>
                        ".$sinopse[$i]->txt."  
                    </div>
                </div>
            ");
        }
		print("</div>");
    ?>
    <div class="col-md-12 col-xs-12 col-sm-12 well display outsetborder outsetshadow" style="">
        <?php
          print("
                <div class='well'>
                    <h4 class='bluefont'>title</h4>
                </div>
                <div class='well'>
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Recusandae consectetur nihil debitis possimus ea aspernatur aperiam maiores, odit consequuntur adipisci error, et eos deleniti sint, similique quod soluta dolorem provident. 
                </div>
          ");
        ?>
        
    </div>
</div>