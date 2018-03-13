create database escola;

use escola;

create table tbl_alunos(
	id	bigint auto_increment not null primary key,
	matricula varchar(50) not null,
	aluno varchar(50) not null,
	turma varchar(50) not null,
	turno enum('Manha','Tarde','Noite') not null,
	mensalidade double not null,
	pai varchar(50) not null,
	mae varchar(50) not null,
	telefone varchar(10) not null,
	email varchar(50) not null unique
)engine = innoDB;

create table tbl_professores(
	id bigint auto_increment not null primary key,
	professor varchar(50) not null,
	disciplina varchar(50) not null,
	disponibilidade enum('Manha','Tarde','Noite') not null,
	hora_aula double not null
)engine = innoDB;

create table tbl_funcionarios(
	id bigint not null auto_increment primary key,
	nome varchar(50) not null,
	cargo varchar(50) not null,
	turno enum('Manha','Tarde','Noite') not null,
	salario double not null,
 	dtadmissao varchar(10) not null
)engine = innoDB; 

create table tbl_login(
	id bigint primary key auto_increment,
	login varchar(50) unique not null,
	senha varchar(32) not null
)engine = innoDB;

insert into tbl_login(login,senha) values('admin',md5('admin'));
-- drop database escola;

-- select * from tbl_alunos;
-- select * from tbl_professores;
-- select * from tbl_funcionarios;
-- select * from tbl_login;
select * from tbl_login where login='admin' and senha=md5('admin');
create database reservas;

use reservas;

create table tbl_quartos(
	id_quartos bigint not null primary key auto_increment,
	numeros varchar(4) not null,
	andar varchar(2) not null,
	descricao varchar(100) not null,
	caracteristicas varchar(100) not null,
	preco_diaria decimal(7,2) not null,
	estado varchar(1) not null,
	tipo_quarto varchar(20) not null
)engine=innoDB;

create table tbl_pessoas(
	id_pessoas bigint primary key not null auto_increment,
	nome_pessoa varchar(50) not null,
	nome_pai varchar(50) not null,
	nome_mae varchar(50) not null,
	tipo_documento varchar(30) not null,
	numero_documento varchar(30) not null unique,
	endereco varchar(50) not null,
	telefone varchar(10) not null unique,
	email varchar(50) not null unique
)engine=innoDB;

create table tbl_login(
	id bigint primary key auto_increment,
	login varchar(50) unique not null,
	senha varchar(32) not null
)engine = innoDB;

-- drop database reservas;