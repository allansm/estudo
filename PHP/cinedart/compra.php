<div class="col-md-8 "  >
	<div class='well outsetborder outsetshadow col-md-12 '>
	<?php
		print("<div class='' style='background:#444'><h2 class='well'>".$compra[$_GET['c']]->ingresso[$_GET['c']]->filme."</h2></div>");
	?>
	Escolha o ingresso
	<table class="table">
    <form method="post"  name="form" id="form">

	<thead>
	<?php
		print('
			 <tr style="min-width:0px">
                <th>Tipo</th>
                <th>quantidade</th>
                <th>valor</th>
            </tr>
		');
	?>
	</thead>
	<tbody >
	<?php
		for($i =0;$i<count($compra);$i++){
			$onchange = 'showValue("select'.$i.'","lblv'.$i.'")';
			print("	
					<tr>
						<td>".$compra[$i]->entrada."</td>
			");
			print("<td><select name='select$i' class='form-control'  id='select$i' onchange='$onchange'>");
			for($x=0;$x<10;$x++){
				$valor = $compra[$i]->valor*$x;
				printf("<option id='lbl%d' value='%.2f' >%d</option>",$x,$valor,$x);
			}
			print("</select></td>");
			print("<td><div name='valor' id='lblv$i' >R$0,00</div></td>");
		}
	?>
	</tr>
	<tr>
		<td>
			<a onclick="alert('Compras indisponiveis');"><div class="bt blackhover outsetborder outsetshadow  clearfix display" >
						comprar
			</div></a>
		</td>
	</tr>
	</tbody>
	</form>	
	</table>
	</div>	
</div>