<?php
    function verificaP(){
        $comp = 0;
        if(func_num_args() > 0 ){
            $args = func_get_args();
            foreach($args as $valor){
                if($_GET["p"] != $valor){
                    $comp++;
                }
            }
            
        }
        if($comp == func_num_args()){
            return false;
        }else{
            return true;
        }
    }
    function links(){
        print('<div class=" text-center display fill">');
        $links = array("home","emcartaz","ingressos","promocoes","cadastro");
        print("<legend class='bluefont text-center'>Links</legend>");
        foreach($links as $value){
            print("<div class='col-md-12 col-xs-12 col-sm-12 '><a href='./?p=$value.php'>$value</a></div>");
        }
        print("</div>");
    }
   
?>