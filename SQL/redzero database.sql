-- gerador de dados pessoais :http://www.4devs.com.br/gerador_de_pessoas
-- matriculas : 75.5085,16.1993,04.5808,09.2526,50.7822
-- registro aluno :000249823,000434969,000335597,000740326,000624062
-- codigo barras :656448023729,936004294780,399976389050,153637033749,758233937042
-- empresas coca-cola,microsoft,bic,mabel,sony
-- horarios : (07:00:00,11:00:00),(13:00:00,17:00:00),(18:00:00,22:00:00)
-- cpf : 889.778.968-43,180.115.222-56,260.626.749-49,061.174.422-89,689.619.954-72
-- rg: 17.272.632-3,14.162.485-1,34.750.057-2,39.908.217-7,15.443.870-4
-- email joao-levi77@me.com,pedro.henrique.moura@vectrausinagem.com.br,giovanni-francisco82@pss.adv.br,pedro_h_dias@prositeweb.com.br,thales_enrico@grupoaguaviva.com.br
-- tel  2659-7983,3660-5194,3785-8229,3504-2171,2911-0501
-- cel 99736-2879,99967-9000,99205-3739,98957-4598,98944-3570
-- cep 69908-048,71100-113,25750-590,60422-600,65090-408
-- n_end 208,130,383,374,956
create database redzero;
use redzero;
create table usuario(
	id bigint auto_increment not null primary key,
	login_portal varchar(15) unique not null , -- ex : aluno123
    senha_portal varchar(32) not null  -- ex : @$123456
)engine = InnoDB;
insert into usuario
(login_portal,senha_portal)values
('coppertrawler',md5('07008557')),
('manoble',md5('34055044')),
('babbleland',md5('27249117')),
('copperidian',md5('39512581')),
('atomiline',md5('O3505516'));
create table situacao(
	id int auto_increment not null primary key,
	situacao enum('ativo','inativo')
)engine = InnoDB;
insert into situacao
(situacao)values
('ativo'),
('inativo');
create table turma_atual(
	id int auto_increment primary key not null,
	matricula char(7) not null unique, -- ex : 01.2887
    ra varchar(9) not null unique, -- 'registro aluno' ex : 000123456
    cod_barras varchar(12) not null unique, -- ex: 640509 040147
    usuario bigint not null unique, -- chave estrangeira da tabela usuario
    situacao int not null -- chave estrangeira da tabela situacao
)engine = InnoDB;
alter table turma_atual
add constraint usuario
foreign key (usuario)
references usuario(id)
on delete no action
on update no action;
alter table turma_atual
add constraint situacao
foreign key (situacao)
references situacao(id)
on delete no action
on update no action;
insert into turma_atual
(matricula,ra,cod_barras,usuario,situacao)values
('75.5085','000249823','656448023725','1','1'),
('16.1993','000434969','936004294784','2','1'),
('04.5808','000335597','399976389053','3','1'),
('09.2526','000740326','153637033742','4','2'),
('50.7822','000624062','758233937041','5','1');
create table empresa(
	id int auto_increment not null primary key,
    nomeEmpresa varchar(20) unique not null
)engine = InnoDB;
insert into empresa
(nomeEmpresa)values
('nenhuma'),
('coca-cola'),
('microsoft'),
('bic'),
('mabel'),
('sony');
create table classificacao(
	id int auto_increment not null primary key,
	tipoClassificacao enum('M.Fraco','Fraco','Razoavel','Bom','M.Bom','Excelência')
)engine = InnoDB;
insert into classificacao
(tipoClassificacao)values
('M.Fraco'),
('Fraco'),
('Razoavel'),
('Bom'),
('M.Bom'),
('Excelência');
create table horarios(
	id int auto_increment not null primary key,
	hr_entrada time,
    hr_saida time
)engine = InnoDB;
insert into horarios
(hr_entrada,hr_saida)values
('07:00:00','11:00:00'),
('13:00:00','17:00:00'),
('18:00:00','22:00:00');
create table estado_civil(
	id int primary key not null auto_increment,
	estado_civil enum('solteiro','casado','separado','divorciado','viuvo')
)engine = innodb;
insert into estado_civil
(estado_civil)values
('solteiro'),
('casado'),
('separado'),
('divorciado'),
('viuvo');
create table dados_pessoais(
	id bigint auto_increment not null primary key,
	nome varchar(50) not null,
    horarios int not null, -- chave estrangeira da tabela horarios
    sexo enum('masculino','feminino'),
    data_nasc date not null,
    estado_civil int not null, -- chave estrangeira da tabela estado_civil
    cidade_natal varchar(15) not null,
	profissao varchar(50) not null,
    empresa int not null, -- chave estrangeira da tabela empresa
    classificacao int not null -- chave estrangeira da tabela classificacao
)engine = InnoDB;
alter table dados_pessoais
add constraint horarios
foreign key (horarios)
references horarios(id)
on delete no action 
on update no action;
alter table dados_pessoais
add constraint estado_civil
foreign key (estado_civil)
references estado_civil(id)
on delete no action
on update no action;
alter table dados_pessoais
add constraint empresa
foreign key (empresa)
references empresa(id)
on delete no action
on update no action;
alter table dados_pessoais
add constraint classificacao
foreign key (classificacao)
references classificacao(id)
on delete no action
on update no action;
insert into dados_pessoais
(nome,horarios,sexo,data_nasc,estado_civil,cidade_natal,profissao,empresa,classificacao)values
('João Levi Gustavo Nascimento','1','masculino','1994/05/13','1','Rio Branco','Tecnico em informatica','2','1'),
('Pedro Henrique Vitor Moura','2','masculino','1995/06/21','1','Brasília','nenhuma','1','2'),
('Giovanni Francisco Nascimento','3','masculino','1992/01/16','2','Petrópolis','Administrador de banco de dados','4','5'),
('Pedro Henrique André Dias','2','masculino','1990/05/11','3','Fortaleza','Web designer','3','5'),
('Thales Enrico Mendes','1','masculino','1991/01/06','1','São Luís','Programador','3','6');
create table documentos(
	id bigint auto_increment not null primary key,
	rg varchar(12) unique not null, -- ex: 12.345.678-9 
    orgao_exp varchar(20), -- ex: detran, instituto felix pacheco,policia federal 
    data_exp date, -- ex: 1994/05/21
    titulo_eleitor varchar(20) unique not null, -- ex: 33321471014171
    zona char(3), -- ex: 050
    secao char(4), -- ex: 174
    data_emissao date, -- ex 1999/08/10
    cpf char(14) unique not null, -- ex: 000.000.000-00
    doc_militar varchar(30), -- ex : certificado de alistamento,certificado de reservista
    nro_doc_militar char(6), -- ex: 425175
    nro_passaporte varchar(9) -- ex: AA5275702, AA000000
)engine = InnoDB;
insert into documentos
(rg,orgao_exp,data_exp,titulo_eleitor,zona,secao,data_emissao,cpf,doc_militar,nro_doc_militar,nro_passaporte)values
('17.272.632-3','detran','2000/02/10','857504570361','001','0252','2001/03/05','889.778.968-43','certificado de reservista','425175','AA5275702'),
('14.162.485-1','cartorio civil','2002/05/20','580235860361','005','0172','2003/01/02','180.115.222-56','certificado de reservista','363530','AA1234567'),
('34.750.057-2','detran','2012/03/05','510222040183','050','0102','2000/06/15','260.626.749-49','certificado de reservista','371624','AA7891234'),
('39.908.217-7','cartorio civil','2010/07/25','232246870140','022','0272','2009/04/20','061.174.422-89','certificado de reservista','651500','AA9876545'),
('15.443.870-4','detran','2011/05/12','856455130108','003','0150','2011/07/10','689.619.954-72','certificado de reservista','452200','AA3219878');
create table endereco(
	id bigint auto_increment primary key not null,
	cep varchar(9), -- ex: 32682-558 
    rua varchar(50),
    numero int,
    complemento varchar(20),
    cidade varchar(50),
    bairro varchar(50)
)engine = InnoDB;
insert into endereco
(cep,rua,numero,complemento,cidade,bairro)values
('26112-380','Rua Bias Guimarães','213','','Belford Roxo','Areia Branca'),
('27288-250','Rua Lambari','178','','Volta Redonda','Santa Rita do Zarur'),
('24906-020','Estrada Comandante Celso','244','','Maricá','Silvado'),
('26052-700','Rua Sapé','354','ap. 050','Nova Iguaçu','Figueiras'),
('21940-013','Rua Desembargador Martinho Garcez','337','ap. 107','Rio de Janeiro','Jardim Guanabara');
create table comunicacao(
	id bigint auto_increment primary key not null,
	telefone char(9), -- ex: 9999-9999
    telefone_comercial char(9),
    celular char(10), -- ex: 99999-9999
    operadora varchar(10), -- ex: oi,tim,vivo,claro
    email varchar(50) unique -- ex: allan_de_souza_melo@hotmail.com
)engine = InnoDB;
insert into comunicacao
(telefone,telefone_comercial,celular,operadora,email)values
('2555-7379','3548-2809','98820-2130','oi','joao-levi77@me.com'),
('3994-4902','2691-1600','98285-4178','vivo','pedro.henrique.moura@vectrausinagem.com.br'),
('3652-1962','3555-2083','98985-5766','claro','giovanni-francisco82@pss.adv.br'),
('3831-3854','3632-8711','98110-8982','tim','pedro_h_dias@prositeweb.com.br'),
('3888-1642','2863-4758','99430-8228','oi','thales_enrico@grupoaguaviva.com.br');
create table filiacao(
	id bigint auto_increment primary key not null,
	nomePai varchar(50),
	nomeMae varchar(50)
)engine = innodb;
insert into filiacao
(nomePai,nomeMae)values
('Murilo Eduardo Henry Freitas','Bárbara Alana Catarina Dias'),
('Breno Marcos Vinicius Fernando Martins','Sara Mariane Cavalcanti'),
('Rafael Thales Gustavo dos Santos','Catarina Sophia Camila Mendes'),
('Fernando Calebe Antonio Martins','Sarah Luana Evelyn Monteiro'),
('Rafael Luiz Luan Barros','Isabelle Emily Cavalcanti');
create table responsaveis(
	id bigint auto_increment primary key not null,
	responsaveis_financeiro_didatico bigint not null
)engine = InnoDB;
alter table responsaveis
add constraint responsaveis_financeiro_didatico
foreign key (responsaveis_financeiro_didatico)
references filiacao(id)
on delete no action
on update no action;  
insert into responsaveis
(responsaveis_financeiro_didatico)values
('1'),
('2'),
('3'),
('4'),
('5'); 
create table aluno(
	id bigint auto_increment primary key not null,
	turma_atual int not null, -- chave estrangeira da tabela turma_atual
    dados_pessoais bigint not null, -- chave estrangeira da tabela dados_pessoais
    documentos bigint not null, -- chave estrangeira da tabela documentos
    endereco bigint not null, -- chave estrangeira da tabela endereco
    comunicacao bigint not null, -- chave estrangeira da tabela comunicacao
    responsaveis bigint not null -- chave estrangeira da tabela responsaveis
)engine = innodb;
alter table aluno
add constraint turma_atual
foreign key (turma_atual)
references turma_atual(id)
on delete no action
on update no action;
alter table aluno
add constraint dados_pessoais
foreign key (dados_pessoais)
references dados_pessoais(id)
on delete no action
on update no action;
alter table aluno
add constraint documentos
foreign key (documentos)
references documentos(id)
on delete no action
on update no action;
alter table aluno
add constraint endereco
foreign key (endereco)
references endereco(id)
on delete no action
on update no action;
alter table aluno
add constraint comunicacao
foreign key (comunicacao)
references comunicacao(id)
on delete no action
on update no action;
alter table aluno
add constraint responsaveis
foreign key (responsaveis)
references responsaveis(id)
on delete no action
on update no action;
insert into aluno
(turma_atual,dados_pessoais,documentos,endereco,comunicacao,responsaveis)values
('1','1','1','1','1','1'),
('2','2','2','2','2','2'),
('3','3','3','3','3','3'),
('4','4','4','4','4','4'),
('5','5','5','5','5','5');
select * from usuario;
select * from turma_atual;
select * from dados_pessoais;
select * from documentos;
select * from endereco;
select * from comunicacao;
select * from responsaveis;
select * from aluno;

-- drop database redzero;