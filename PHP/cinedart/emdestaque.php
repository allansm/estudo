<?php
	print("<b class='well text-center'><span class='glyphicon glyphicon-film'></span>&nbsp;Trailers</b><br/>");
    for($i = 0;$i < 3; $i++){
		$onclick = 'trailer("'.$cont[$i]->url.'",'.$cont[$i]->duration.')';
        if($i < 2){
            $border = "bottomborder";
        }else{
			$border = "";
		}
        print("
            <a href='#inicio' class='scroll'><div class='col-md-12 col-xs-12 col-sm-12 well  $border blackhover pointer' onclick='$onclick' >
                <div >
                    <img src='".$cont[$i]->img."' class='col-md-6 col-sm-4 col-xs-4 insetborder insetshadow nopadding emdestaqueimage'>
                </div>
                <div class='col-md-6 col-sm-8 col-xs-8 well emdestaquetext'>
                    &nbsp;".$cont[$i]->title."
                </div>
            </div></a>"
        );
    }
?>