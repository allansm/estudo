<?php
    $n =0;
    $cartaz[$n++] = new cartaz('img/sinopse3.jpg','Invocação do mal 2','terror','Vera Farmiga, Patrick Wilson','James Wan','133','14 anos','warner bros');
    $cartaz[$n++] = new cartaz('img/sinopse4.jpg','Warcraft - Encontro de Dois Mundos','Ação','ravis Fimmel, Toby Kebbell, Paula Patton, Ben Foster, Dominic Cooper, Robert Kazinsky, Daniel Wu, Clancy Brown e mais.','Duncan Jones','123','12 anos','Universal'); 
    $cartaz[$n++] = new cartaz('img/sinopse5.jpg','X-MEN Apocalipse','Ação','James McAvoy, Michael Fassbender, Jennifer Lawrence, Evan Peters, Oscar Isaac, Nicholas Hoult, Hugh Jackman, Alexandra Shipp, Tye Sheridan, Sophie Turner, no Kodi Smit-McPhee, Rose Byrne, Lana Condor, Ben Hardy, Olivia Munn, Lucas Till','Bryan Singer','143','12 anos','Fox films'); 
    $cartaz[$n++] = new cartaz('img/sinopse1.jpg','Independence Day: O Ressurgimento','Ação','James A. Woods, Jeff Goldblum, Liam Hemsworth, Jessie Usher, Bill Pullman, Vivica A. Fox, Judd Hirsch e mais.','Roland Emmerich','119','12 anos','Fox films');
    $cartaz[$n++] = new cartaz('img/sinopse6.jpg','Angry birds o filme','infantil','Jason Sudeikis, Maya Rudolph, Peter Dinklage','Clay Kaytis, Fergal Reilly','90','Livre','Columbia Tristar'); 
    $cartaz[$n++] = new cartaz('img/sinopse2.jpg','As Tartarugas Ninja: Fora das Sombras','Aventura','Megan Fox, Will Arnett, William Fichtner ',' Jonathan Liebesman','112','10 anos','Paramount');
	$n=0;
	$conteudo[$n++] = new trailer('img/capa1.jpg',2.32,'Invocação do mal 2',"https://www.youtube.com/embed/PUdxMXjiRck");
	$conteudo[$n++] = new trailer('img/capa2.jpg',2.13,'Warcraft - Encontro de Dois Mundos',"https://www.youtube.com/embed/2Rxoz13Bthc");
	$conteudo[$n++] = new trailer('img/capa3.jpg',2.48,'X-MEN Apocalipse',"https://www.youtube.com/embed/3vYpPwBKJ28");
	$conteudo[$n++] = new trailer('img/capa4.jpg',2.05,'Independence Day: O Ressurgimento',"https://www.youtube.com/embed/LwgF3bmQ1rE");
	$conteudo[$n++] = new trailer('img/capa5.jpg',2.24,'Angry birds o filme',"https://www.youtube.com/embed/MP-qZk1By7k");
	$conteudo[$n++] = new trailer('img/capa6.jpg',2.26,'As Tartarugas Ninja: Fora das Sombras',"https://www.youtube.com/embed/9rIGR_wPEnE");
    $n = 0;
    do{
        $c[0] = rand(0,count($cartaz)-1);
        $c[1] = rand(0,count($cartaz)-1);
        $c[2] = rand(0,count($cartaz)-1);
    }while($c[0] == $c[1] || $c[1] == $c[2] || $c[2] == $c[0]);
    $cont[$n] = new trailer($conteudo[$c[$n]]->img,$conteudo[$c[$n]]->duration,$conteudo[$c[$n]]->title,$conteudo[$c[$n]]->url);
    $n++;
    $cont[$n] = new trailer($conteudo[$c[$n]]->img,$conteudo[$c[$n]]->duration,$conteudo[$c[$n]]->title,$conteudo[$c[$n]]->url);
    $n++;
    $cont[$n] = new trailer($conteudo[$c[$n]]->img,$conteudo[$c[$n]]->duration,$conteudo[$c[$n]]->title,$conteudo[$c[$n]]->url);
    $n = 0;
    $sin[$n++] = new sinopse("sinopse3.jpg","Invocação do mal 2","Sete anos após os eventos de Invocação do Mal (2013), Lorraine (Vera Farmiga) e Ed Warren (Patrick Wilson) desembarcam na Inglaterra para ajudar uma família atormentada por uma manifestação poltergeist na filha. A trama é baseada no caso Enfield Poltergeist, registrado no final da década de 1970.");
    $sin[$n++] = new sinopse("sinopse4.jpg","Warcraft encontro de dois mundos","A região de Azeroth sempre viveu em paz, até a chegada dos guerreiros Orc. Com a abertura de um portal, eles puderam chegar à nova Terra com a intenção de destruir o povo inimigo. Cada lado da batalha possui um grande herói, e os dois travam uma disputa pessoal, colocando em risco seu povo, sua família e todas as pessoas que amam.");
    $sin[$n++] = new sinopse("sinopse5.jpg","X-men Apocalipse","Também conhecido como Apocalipse, En Sabah Nur (Oscar Isaac) é o mutante original. Após milhares da anos, ele volta a vida disposto a garantir sua supremacia e acabar com a humanidade. Ele seleciona quatro Cavaleiros nas figuras de Magneto (Michael Fassbender), Psylocke (Olivia Munn), Anjo (Ben Hardy) e Tempestade (Alexandra Shipp). Do outro lado, o professor Charles Xavier (James McAvoy) conta com uma série de novos alunos, como Jean Grey (Sophie Turner), Ciclope (Tye Sheridan) e Noturno (Kodi Smit-McPhee), além de caras conhecidas como Mística (Jennifer Lawrence), Fera (Nicholas Hoult) e Mercúrio (Evan Peters), para tentar impedir o vilão.");
    $sin[$n++] = new sinopse("sinopse1.jpg","Independency day 2","Após o devastador ataque alienígena ocorrido em 1996, todas as nações da Terra se uniram para combater os extra-terrestres, caso eles retornassem. Para tanto são construídas bases na Lua e também em Saturno, que servem como monitoramento. Vinte anos depois, o revide enfim acontece e uma imensa nave, bem maior que as anteriores, chega à Terra. Para enfrentá-los, uma nova geração de pilotos liderada por Jake Morrison (Liam Hemsworth) é convocada pela presidente Landford (Sela Ward). Eles ainda recebem a ajuda de veteranos da primeira batalha, como o ex-presidente Whitmore (Bill Pullman), o cientista David Levinson (Jeff Goldblum) e seu pai Julius (Judd Hirsch).");
    $sin[$n++] = new sinopse("sinopse6.jpg","Angry birds o filme","Adaptação do jogo Angry Birds, uma das maiores franquias mundiais de entretenimento, o filme vai contar a história de Red, um pássaro com problemas para controlar seu estresse, o veloz Chuck e o volátil Bomba, amigos que nunca tiveram seus valores reconhecidos. Quando misteriosos porquinhos verdes invadem a ilha onde moram, estes improváveis herois serão os responsáveis por descobrir qual o plano da gangue suína.
");
    $sin[$n++] = new sinopse("sinopse2.jpg","As Tartarugas Ninja: Fora das Sombras","Auxiliado pelo dr. Baxter Stockman (Tyler Perry), o Clã do Pé planeja libertar o vilão Destruidor (Brian Tee) exatamente quando ele é transferido para a prisão. Após o plano de resgate ser descoberto por April O'Neal (Megan Fox), as tartarugas ninja entram em ação para impedi-lo - só que fracassam graças à iniciativa de Krang, um ser alienígena que planeja invadir a Terra. Para enfrentá-los, as tartarugas contam com a ajuda de um novo combatente: Casey Jones (Stephen Amell), um policial que estava no camburão que conduzia o Destruidor quando conseguiu escapar.");
    $n=0;
    $sinopse[$n] = new sinopse($sin[$c[$n]]->img,$sin[$c[$n]]->titulo,$sin[$c[$n]]->txt);
    $n++;
    $sinopse[$n] = new sinopse($sin[$c[$n]]->img,$sin[$c[$n]]->titulo,$sin[$c[$n]]->txt);
    $n++;
    $sinopse[$n] = new sinopse($sin[$c[$n]]->img,$sin[$c[$n]]->titulo,$sin[$c[$n]]->txt);
    $n++;
	$tipo = array("dublado","legendado");
	$hora = array('15','13','21','16','19');
	$minuto = array('30','00');
	for($i=0;$i<count($cartaz);$i++){
		$ingresso[$i] = new ingresso($cartaz[$i]->nome,(rand(1,50)),$tipo[rand(0,count($tipo)-1)],"".$hora[rand(0,(count($hora)-1))].":".$minuto[rand(0,(count($minuto)-1))]);
	}
	$n=0;
	$compra[] = new compra("Meia entrada – Criança - SP - R$ 19,20 (Ingresso R$ 15,00 + Serviço R$ 4,20)",19.20,$ingresso);
	$compra[] = new compra("Meia entrada – Estudante - R$ 19,20 (Ingresso R$ 15,00 + Serviço R$ 4,20)",19.20,$ingresso);
	$compra[] = new compra("Meia Entrada Personnalité - R$ 19,20 (Ingresso R$ 15,00 + Serviço R$ 4,20)",19.20,$ingresso);
	$compra[] = new compra("Meia Entrada Uniclass - R$ 19,20 (Ingresso R$ 15,00 + Serviço R$ 4,20)",19.20,$ingresso);
	$compra[] = new compra("Inteira - R$ 34,20 (Ingresso R$ 30,00 + Serviço R$ 4,20)",34.20,$ingresso);
	$compra[] = new compra("Cliente Portador de Deficiência - R$ 19,20 (Ingresso R$ 15,00 + Serviço R$ 4,20)",19.20,$ingresso);
	$compra[] = new compra("Idoso - R$ 19,20 (Ingresso R$ 15,00 + Serviço R$ 4,20)",19.20,$ingresso);
	
?>