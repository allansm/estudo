create database economy;

use economy;

create table pessoa(
	id bigint not null auto_increment primary key,
	nome varchar(255) not null,
	sobrenome varchar(255) not null,
	email varchar(255) not null unique,
	telefone varchar(255) not null
)engine = innoDB;

create table usuario(
	id bigint not null auto_increment primary key,
	login varchar(50) not null unique,
	senha varchar(32) not null
)engine = innoDB;

create table conta(
	id bigint not null auto_increment primary key,
	pessoa bigint not null,
	usuario bigint not null,
	saldo double not null
)engine = innoDB;

create table compra(
	id bigint not null auto_increment primary key,
	idConta bigint not null,
	produto varchar(255) not null,
	valor double not null,
	data varchar(255) not null
)engine = innoDB;

alter table conta
add foreign key(pessoa)
references pessoa(id)
on delete no action
on update no action;

alter table conta
add foreign key(usuario)
references usuario(id)
on delete no action
on update no action;

alter table compra
add foreign key(idConta)
references conta(id)
on delete no action
on update no action;

