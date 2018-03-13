create database db;

use db;

create table clientes(
	id bigint not null auto_increment primary key,
	nome varchar(50) not null,
	email varchar(50) not null unique,
        senha varchar(32) not null,
	telefone varchar(10) not null,
	endereco varchar(100) not null
)engine=innoDB;

create table produtos(
	id bigint  auto_increment primary key,
	nome varchar(50) not null,
	quantidade int not null,
	precoUnitario double not null,
        url varchar(255)
)engine=innoDB;

create table servicos(
	id bigint  auto_increment primary key,
	tipo varchar(50) not null,
	preco double not null,
        url varchar(255),
        dica varchar(255)
)engine=innoDB;

create table vendas(
	id bigint not null auto_increment primary key,
        cliente bigint not null,
	produto bigint,
        quant_produto int,
	servico bigint
)engine=innoDB;

create table usuario(
	id bigint not null auto_increment primary key,
	login varchar(50) not null unique, 
	senha varchar(32) not null
)engine=innoDB;

alter table vendas
add foreign key (cliente)
references clientes(id);

alter table vendas
add foreign key (produto)
references produtos(id);

alter table vendas
add foreign key (servico)
references servicos(id);

insert into usuario (login,senha) values ('admin',md5('admin'));