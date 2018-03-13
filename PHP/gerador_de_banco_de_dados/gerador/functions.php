<?php
	function verifyValue($value,$string){
		return (strpos($value,$string) !== false);
	}
	function generateSQL(){
		$table = $_POST["tbln"];
		$sql = "create table $table(";
		$sz = $_POST['sz'];
		$i = 1;
		$more = ',';
		foreach($_POST as $field=>$value){
			if($field != "sz" && $field != "tbln" && $field != "g"){
				if($i == $sz){
					$more = "";
				}
				$i++;
				if(verifyValue($value,"id")  || verifyValue($value,"cod")){
					$sql.="$value bigint not null auto_increment primary key".$more;
				}else if(verifyValue($value,"preco") || verifyValue($value,"price") || verifyValue($value,'custo') || verifyValue($value,"cust")){
					$sql.="$value double not null".$more;
				}else if(verifyValue($value,"email")){
					$sql .= "$value varchar(255) not null unique".$more;
				}else if(verifyValue($value,"senha") || verifyValue($value,"pass")){
					$sql .= "$value varchar(32) not null".$more;
				}else if(verifyValue($value,"quant") || verifyValue($value,"amount")){
					$sql .= "$value int not null".$more;
				}else{
					$sql .= "$value varchar(255)".$more;
				}
			}
		}
		$sql .=")engine=innoDB;";
		return $sql;
	}
?>