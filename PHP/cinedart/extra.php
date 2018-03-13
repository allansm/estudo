<?php
    print("<div class=' col-md-4 well ' style=''>");
    print("<h5><b><span class='glyphicon glyphicon-comment'></span>&nbsp;Noticias</b></h5>");
    for($i =0; $i < 3; $i++){
        print("
            <div class='col-md-12 well outsetborder outsetshadow display' style=''>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Animi facilis iste cupiditate expedita, placeat deleniti perspiciatis saepe natus nihil ea, possimus ipsam veniam architecto fugit commodi sint aliquid rerum!</div>
        ");
    }
    print('<div class="col-md-12 col-xs-12 col-sm-12 text-center nopadding " >
				<div class="fb-page outsetborder outsetshadow" 
				  data-href="https://www.facebook.com/facebook"
				  data-width="212" 
				  data-hide-cover="false"
				  data-show-facepile="false" 
				  data-show-posts="false"
				  data-adapt-container-width="false">
				</div>
			</div>
	');
    print("</div>");

?>