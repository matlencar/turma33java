create database db_cidade_das_frutas;

use db_cidade_das_frutas;

create table tb_categoria(
	id bigint auto_increment,
	tipo varchar(20),
	quantidade int,
    estacao_frutas varchar(20),
    primary key (id)
);

insert into tb_categoria(tipo,quantidade,estacao_frutas) values("Fruta Doce",60,"Inverno");
insert into tb_categoria(tipo,quantidade,estacao_frutas) values("Fruta Azeda",20,"Verão");
insert into tb_categoria(tipo,quantidade,estacao_frutas) values("Fruta Doce",18,"Outorno");
insert into tb_categoria(tipo,quantidade,estacao_frutas) values("Fruta Azeda",15,"Primavera");
insert into tb_categoria(tipo,quantidade,estacao_frutas) values("Fruta Doce",4,"Inverno");

create table tb_produto(
	id bigint auto_increment,
    fk_id_categoria bigint,
    nome varchar(30),
    preco decimal(3.3),
    peso decimal(4.4),
    cor_fruta varchar(25),
    validade varchar(25),
    primary key (id),
    foreign key (fk_id_categoria) references tb_categoria(id)
);

insert into tb_produto(nome,preco,peso,cor_fruta,validade,fk_id_categoria) values("Banana",10.00,6.00,"Amarelo","10 dias",1);
insert into tb_produto(nome,preco,peso,cor_fruta,validade,fk_id_categoria) values("Laranja",14.00,8.00,"Laranja","7 dias",4);
insert into tb_produto(nome,preco,peso,cor_fruta,validade,fk_id_categoria) values("Morango",18.00,4.00,"Vermelho","4 dias",5);
insert into tb_produto(nome,preco,peso,cor_fruta,validade,fk_id_categoria) values("Coco",9.00,5.00,"Verde","13 dias",3);
insert into tb_produto(nome,preco,peso,cor_fruta,validade,fk_id_categoria) values("Uva",24.00,5.00,"Roxo","6 dias",5);
insert into tb_produto(nome,preco,peso,cor_fruta,validade,fk_id_categoria) values("Carambola",13.00,7.00,"Amarelo","4 dias",5);
insert into tb_produto(nome,preco,peso,cor_fruta,validade,fk_id_categoria) values("Limão",8.00,3.00,"Amarelo","12 dias",2);
insert into tb_produto(nome,preco,peso,cor_fruta,validade,fk_id_categoria) values("Melancia",17.00,5.00,"Amarelo","10 dias",2);

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where nome like "%M%";

select * from tb_produto inner join tb_categoria on tb_categoria.id  = tb_produto.fk_id_categoria;

select * from tb_produto inner join tb_categoria on tb_categoria.id  = tb_produto.fk_id_categoria where fk_id_categoria = 2;

