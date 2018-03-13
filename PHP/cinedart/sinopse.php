<div class="col-md-8 well display">
	<?php
		if(isset($_GET["i"])){
			$i = $_GET["i"];
			print("	
                <div class='col-md-12 col-sm-12 col-xs-12 outsetborder   well display ' style='min-height:100%'>
                    <div class='col-md-12  well insetborder insetshadow nopadding' style='height:200px'>
                        <img src='img/".$sin[$i]->img."' style='height:200px' class='fill '>
                    </div>
                    <h4 class='bluefont'>".$sin[$i]->titulo."</h4>
                    <div class=' '>
                        ".$sin[$i]->txt."  
                    </div>
                </div>
            ");
		}
	?>
</div>