<div class="col-md-8 well display" style="" id="cont2">
    <?php
		print("<div class='outsetborder outsetshadow well'>");
        print("<h4 class='bottomborder well'><span class='glyphicon glyphicon-list-alt'></span>&nbsp;Em cartaz</h4>");
        $contadorp = 0;
        $paginas = "";
        $pg = 0;
        $in = 0;
        for($i =0;$i < count($cartaz);$i++){
			$onclick = 'trailer("'.$conteudo[$i]->url.'",'.$conteudo[$i]->duration.')';
            $emcart[$i]="
                <div class='col-md-12 col-xs-12 col-sm-12 well display bottomborder' style=''>
                    <div class=''>
                        <img src='".$cartaz[$i]->img."' class='col-md-4 col-xs-12 col-sm-4  insetborder insetshadow nopadding' style='height:150px'>
                    </div> 
                    <div class='col-md-8 col-xs-12 col-sm-8 well nopaddingtop'>
                        <h4 class='well nopaddingleft nopaddingright nopaddingtop'>".$cartaz[$i]->nome."</h4>

                        <b>Gênero : </b> ".$cartaz[$i]->genero."<br/>

                        <b>Elenco : </b> ".$cartaz[$i]->elenco."<br/>

                        <b>Direção : </b>".$cartaz[$i]->direcao."<br/>

                        <b>Duração : </b> ".$cartaz[$i]->duracao."<br/>

                        <b>Classificação : </b> ".$cartaz[$i]->classificacao."<br/>

                        <b>Distribuidor:</b> ".$cartaz[$i]->distribuidor."<br/>
						
						<b>Ver Sinopse : </b><a href='./?p=sinopse.php&i=$i'>Clique Aqui</a><br/>
						
						<b>Ver trailer : </b><a onclick='$onclick' href='#inicio' class='scroll'>Clique Aqui</a><br/>
                    </div>
                </div>
            ";
            $contadorp++;
            if($contadorp == 3){
                $paginas.="<a href='./?p=emcartaz.php&q=$in'>".($pg+1)."</a>&nbsp;";
                $pg++;
                $contadorp = 0;
                $in+=3;
            }
        }
        if(isset($_GET["q"])){
            $q = $_GET["q"];
            $f = $q+3;
            for($q;$q < $f; $q++){
                print($emcart[$q]);
            }
        }else{
            $q = 0;
            $f = $q+3;
            for($q;$q < $f; $q++){
                print($emcart[$q]);
            }
        }
        print("<center>".$paginas."</center>");
		print("</div>");
    ?>
</div>