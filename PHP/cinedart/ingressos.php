<div class="col-md-8 col-sm-12 col-xs-12 well display"  id="cont4">
	<?php
		for($i = 0; $i < count($ingresso);$i++){
			print('
				<div class="outsetborder outsetshadow well">
					<div class="well col-md-12 col-xs-12 col-sm-12" style="background:#333">
						'.$ingresso[$i]->filme.'
					</div>
					<div class="well col-md-12  col-xs-12 col-sm-12">
						<b>Sala : </b>'.$ingresso[$i]->sala.' <br/><br/><b>Tipo : </b>'.$ingresso[$i]->tipo.' <br/><br/><b>Horario : </b>'.$ingresso[$i]->horario.'
					</div>
					<a href="./?p=compra.php&c='.$i.'"><div class="bt blackhover outsetborder outsetshadow  clearfix display" >
						comprar
					</div></a>
				</div>	
			');
		}
	?>				
</div>

