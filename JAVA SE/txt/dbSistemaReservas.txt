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

-- drop database reservas;