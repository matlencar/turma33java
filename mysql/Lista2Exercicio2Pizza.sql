create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
	id bigint auto_increment,
    tamanho varchar(20),
    tipo varchar(20),
    borda boolean,
    primary key (id)
);

insert into tb_categoria(tamanho,tipo,borda) values("Pequena","Salgado",false);
insert into tb_categoria(tamanho,tipo,borda) values("Media","Doce",true);
insert into tb_categoria(tamanho,tipo,borda) values("Pequena","Doce",false);
insert into tb_categoria(tamanho,tipo,borda) values("Grande","Salgado",true);
insert into tb_categoria(tamanho,tipo,borda) values("Media","Salgado",true);

create table tb_pizza(
	id bigint auto_increment,
    fk_id_categoria bigint,
    preço decimal(8.2),
    tipo_massa varchar(20),
    sabor varchar(20),
    refrigerante varchar(20),
    sobremesa varchar(20),
	primary key (id),
    foreign key (fk_id_categoria) references tb_categoria(id)
);

insert into tb_pizza(preço,tipo_massa,sabor,refrigerante,sobremesa,fk_id_categoria) values("38.00","Tradicional","Mussarela","Pepsi","Torta de limão",1);
insert into tb_pizza(preço,tipo_massa,sabor,refrigerante,sobremesa,fk_id_categoria) values("55.00","Nova-iorquina","Calabresa","Sprite","Torta de chocolate",4);
insert into tb_pizza(preço,tipo_massa,sabor,refrigerante,sobremesa,fk_id_categoria) values("50.00","Siciliana","Atum","Fanta","Brigadeiro",5);
insert into tb_pizza(preço,tipo_massa,sabor,refrigerante,sobremesa,fk_id_categoria) values("48.50","Integral","Brocolis","Coca-cola diet","Torta de holandesa",1);
insert into tb_pizza(preço,tipo_massa,sabor,refrigerante,sobremesa,fk_id_categoria) values("62.00","Nova-iorquina","Quatro-Queijos","Xamego","Pão de mel",4);
insert into tb_pizza(preço,tipo_massa,sabor,refrigerante,sobremesa,fk_id_categoria) values("53.00","Siciliana","Alho","Guarana Antartica","Alfajor",5);
insert into tb_pizza(preço,tipo_massa,sabor,refrigerante,sobremesa,fk_id_categoria) values("47.00","Tradicional","Banana","Cajuina","Beijinho",2);
insert into tb_pizza(preço,tipo_massa,sabor,refrigerante,sobremesa,fk_id_categoria) values("51.00","Tradicional","Romeu e Julieta","Coca-cola","Pudim",3);


select * from tb_pizza where preço > 45;

select * from tb_pizza where preço between 29 and 60;

select * from tb_pizza where sabor like "%C%";

select * from tb_pizza inner join tb_categoria on tb_categoria.id  = tb_pizza.fk_id_categoria where fk_id_categoria = 1;