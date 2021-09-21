create database db_generation_game_online;

use db_generation_game_online;

create table tb_classes(
  id bigint auto_increment,
    nome varchar (20),
    poder varchar (20),
    energia int,
    primary key (id)
);

insert into tb_classes(nome,poder,energia) values ("Necromante","Espiritos malignos",80);
insert into tb_classes(nome,poder,energia) values ("Paladino","Lança do sol",140);
insert into tb_classes(nome,poder,energia) values ("Ferreiro","Marretada",180);
insert into tb_classes(nome,poder,energia) values ("Samurai","Corte atomico",133);
insert into tb_classes(nome,poder,energia) values ("Arqueiro","Super flecha",115);

create table tb_personagens(
    id bigint auto_increment,
    fk_id_classes bigint,
    nome varchar (20),
    genero varchar(25),
    raça varchar(20),
    ataque int,
    vida int,
    primary key (id),
    foreign key (fk_id_classes) references tb_classes (id)
);

insert into tb_personagens(nome,genero,raça,ataque,vida,fk_id_classes) values ("Camillo","ele","Homem-Lagarto",1420,120,1);
insert into tb_personagens(nome,genero,raça,ataque,vida,fk_id_classes) values ("Cristiane","elu","Humana",2220,150,3);
insert into tb_personagens(nome,genero,raça,ataque,vida,fk_id_classes) values ("Macos","elu","Orc",2028,180,4);
insert into tb_personagens(nome,genero,raça,ataque,vida,fk_id_classes) values ("Helo","ela","Elfa",1522,140,2);
insert into tb_personagens(nome,genero,raça,ataque,vida,fk_id_classes) values ("Jorge","elu","Maritimo",2040,150,3);
insert into tb_personagens(nome,genero,raça,ataque,vida,fk_id_classes) values ("Kaio","elu","Ogro",1021,130,1);
insert into tb_personagens(nome,genero,raça,ataque,vida,fk_id_classes) values ("Isadora","ela","Fada",1230,100,5);
insert into tb_personagens(nome,genero,raça,ataque,vida,fk_id_classes) values ("Carlos","ele","Padre",1025,160,4);

select * from tb_personagens where ataque > 200;

select * from tb_personagens where ataque between 1000 and 2000;

select * from tb_personagens where nome like "%C%";

select * from tb_personagens inner join tb_classes on tb_classes.id  = tb_personagens.fk_id_classes;


select * from tb_personagens inner join tb_classes on tb_classes.id  = tb_personagens.fk_id_classes where fk_id_classes = 3;