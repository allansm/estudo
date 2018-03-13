<?php
	foreach($_SESSION as $field=>$value){
		$$field = $value;
	}
	print('
	<div class="category">
		<h2>Conta</h2>
		Conta: '.$conta.'
		<br/><br/>
		Numero usuario: '.$id.'
		<br/><br/>
		Login: '.$login.'
		<br/><br/>
		Senha: '.$senha.'
		<br/><br/>
		SaldoTotal: R$ '.$saldo.'
		<br/><br/>
		<form method="post" action="./?p=login.php&logout=1"><input type="submit" value="logout"></form>
	</div>
	');
?>
<div class="category">
	<h2>Deposito</h2>
	<form method="post" action="./src/controller/depositar.php">
		Valor: <br/><br/><input type="text" name="valor"><br/><br/><input type="submit" value="depositar">
	</form>
</div>
		
<div class="category">
	<h2>Registrar</h2>
	<form method="post" action="./src/controller/cadastrarproduto.php">
		Produto:<br/><br/><input type="text" name="produto"><br/><br/>
		Valor:<br/><br/><input type="text" name="valorProduto"><br/><br/>
		Data:<br/><br/><input type="date" name="data"><br/><br/>
		<input type="submit" value="Cadastrar Produto">
	</form>
</div>
<?php
	include("src/controller/atualizar.php");
	print('
		<div class="category">
			<h2>Compras</h2>
			<form method="post" action="./"><input type="submit" value="Atualizar/Exibir"></form>
			<br/><br/>
			Saldo Atual : R$'.@$_SESSION["saldoAtual"].'
			<br/><br/>
			'.@$_SESSION["msg"].'
		</div>
	');
?>
