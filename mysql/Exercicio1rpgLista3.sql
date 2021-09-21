create database db_jogo_gen33;

use db_jogo_gen33;

create table tb_classes(
	id bigint auto_increment,
    nome varchar(255),
    poder varchar(255),
    energia int,
    primary key (id)
);

insert into tb_classes(nome,poder,energia) values ("maga","bola de fogo",90);
insert into tb_classes(nome,poder,energia) values ("arqueiro","chuva de flechas",100);
insert into tb_classes(nome,poder,energia) values ("sereia","agua transbordante",120);
insert into tb_classes(nome,poder,energia) values ("morte","sugadora de almas",150);

select * from tb_classes;

create table tb_personagens(
	id bigint auto_increment,
    nome varchar(20),
    genero varchar(20),
    raça varchar(20),
    ataque int,
    vida int,
    fk_id_classe bigint,
    primary key (id),
    foreign key (fk_id_classe) references tb_classes(id)
);

insert into tb_personagens(nome,genero,raça,ataque,vida,fk_id_classe) values ("Gustavo","ele","jacare",20,150,1);
insert into tb_personagens(nome,genero,raça,ataque,vida,fk_id_classe) values ("Joice","ela","humana",20,150,3);
insert into tb_personagens(nome,genero,raça,ataque,vida,fk_id_classe) values ("Juan","elu","bullywug",8,50,4);
insert into tb_personagens(nome,genero,raça,ataque,vida,fk_id_classe) values ("Raniere","menine","humana",22,100,2);

select * from tb_personagens;

select * from tb_personagens where ataque >10;

select * from tb_personagens where vida between 40 and 101;

select * from tb_personagens where nome like "%j%";

select * from tb_personagens inner join tb_classes on tb_classes.id = tb_personagens where fk_id_classe = 2

-- Como tiro inserção dublicada

drop 
delete from tb_personagens where id between 4 and 6;
truncate table tb_personagens;