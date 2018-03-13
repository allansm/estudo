create database banco;
use  banco;
create table cadastro(
	id bigint auto_increment not null primary key unique,
    nome varchar(50) not null,
    sobrenome varchar(255) not null,
    email varchar(255) not null unique,
    telefone varchar(10) not null ,
    sexo enum('M','F'),
    login varchar(50) not null unique , 
    senha varchar(32) not null 
)engine = innoDb;

select * from cadastro;

