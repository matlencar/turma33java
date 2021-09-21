create database ecommerce;

use ecommerce;

create table tb_loja(
	id_produto bigint(10) auto_increment,
    nome varchar(120) not null,
    valor decimal,
    quantidade int,
    tipo varchar(120) not null,
	primary key (id_produto)
    );

insert into tb_loja(id_produto,nome,valor,quantidade,tipo) values(1,"Jogo PS4",200.00,10,"Jogos");
insert into tb_loja(id_produto,nome,valor,quantidade,tipo) values(2,"Jogo Xbox One",180.00,10,"Jogos ");
insert into tb_loja(id_produto,nome,valor,quantidade,tipo) values(3,"Jogo Nintendo Switch",300.00,10,"Jogos ");
insert into tb_loja(id_produto,nome,valor,quantidade,tipo) values(4,"Fone Bluetooth ",500.00,10,"Eletronicos");
insert into tb_loja(id_produto,nome,valor,quantidade,tipo) values(5,"Controle PS4",400.00,10,"Jogos");
insert into tb_loja(id_produto,nome,valor,quantidade,tipo) values(6,"PS4",3000.00,10,"Eletronicos");
insert into tb_loja(id_produto,nome,valor,quantidade,tipo) values(7,"Xbox One",17000.00,10,"Eletronicos");
insert into tb_loja(id_produto,nome,valor,quantidade,tipo) values(8,"Nintendo Switch",2800.00,10,"Eletronicos");

select * from ecommerce.tb_loja;