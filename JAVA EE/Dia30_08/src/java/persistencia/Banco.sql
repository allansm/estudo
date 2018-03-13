
create database banco;

use banco;

create table cliente(
    id bigint not null primary key auto_increment,
    nome varchar(50) not null,
    telefone varchar(20) not null,
    email varchar(20) not null
)engine=innoDB;

create table funcionario(
    id bigint not null primary key auto_increment,
    nome varchar(50) not null,
    endereco varchar(50) not null,
    bairro varchar(50) not null,
    cidade varchar(50) not null,
    uf varchar(2) not null
)engine=innoDB;

create table produto(
    id bigint not null primary key auto_increment,
    descricao varchar(50) not null,
    quant_estoque int not null,
    preco_unitario double not null,
    preco_venda double not null
)engine=innoDB;

create table usuario(
    id bigint not null primary key auto_increment,
    codFunc bigint not null,
    usuario varchar(50) not null unique,
    senha varchar(32) not null
)engine=innoDB;

alter table usuario
add foreign key(codFunc)
references funcionario(id);

insert into funcionario(nome,endereco,bairro,cidade,uf) values('admin','n/a','n/a','n/a','na');
insert into usuario(codFunc,usuario,senha) values(1,'admin',md5('admin'));