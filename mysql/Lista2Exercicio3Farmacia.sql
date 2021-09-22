create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
	id bigint auto_increment,
    tipo varchar(20),
	farmaceutica varchar(20),
    caixa_comprimido int,
    primary key (id)
);

drop table tb_categoria;

insert into tb_categoria(tipo,farmaceutica,caixa_comprimido) values("Genérico","Pfizer",14);
insert into tb_categoria(tipo,farmaceutica,caixa_comprimido) values("Similar","Bayer",30);
insert into tb_categoria(tipo,farmaceutica,caixa_comprimido) values("Manipulado","Biolunis",8);
insert into tb_categoria(tipo,farmaceutica,caixa_comprimido) values("Homeopático","Medley ",20);
insert into tb_categoria(tipo,farmaceutica,caixa_comprimido) values("Fitoterápico","Cifarma",10);

create table tb_produto(
	id bigint auto_increment,
    fk_id_categoria bigint,
    remedio varchar(30),
    valor decimal(8.2),
    data_validade varchar(30),
    receita boolean,
    caracteristica varchar(35),
    primary key (id),
    foreign key (fk_id_categoria) references tb_categoria(id)
);

drop table tb_produto;

insert into tb_produto(remedio,valor,data_validade,receita,caracteristica,fk_id_categoria) values("Dipirona",10.00,"AGOSTO 2022",true,"Dor e Febre",1);
insert into tb_produto(remedio,valor,data_validade,receita,caracteristica,fk_id_categoria) values("Plasil",26.00,"JANEIRO 2024",false,"Dor estomacal",5);
insert into tb_produto(remedio,valor,data_validade,receita,caracteristica,fk_id_categoria) values("Naldecon",18.00,"FEVEREIRO 2023",true,"Calmante",3);
insert into tb_produto(remedio,valor,data_validade,receita,caracteristica,fk_id_categoria) values("Sedatif",84.00,"OUTUBRO 2021",false,"Calmante",4);
insert into tb_produto(remedio,valor,data_validade,receita,caracteristica,fk_id_categoria) values("Atenolol",120.00,"DEZSEMBRO 2025",true,"Hipertensão",4);
insert into tb_produto(remedio,valor,data_validade,receita,caracteristica,fk_id_categoria) values("DorFlex",6.00,"MARÇO 2023",true,"Dor e articulações",2);
insert into tb_produto(remedio,valor,data_validade,receita,caracteristica,fk_id_categoria) values("Diazepam",78.00,"JUNHO 2025",false,"Sono",3);
insert into tb_produto(remedio,valor,data_validade,receita,caracteristica,fk_id_categoria) values("Novalgina",66.00,"NOVEMBRO 2024",false,"Gripe",5);

select * from tb_produto where valor > 50;

select * from tb_produto where valor between 3 and 60;

select * from tb_produto where remedio like "%B%";

select * from tb_produto inner join tb_categoria on tb_categoria.id  = tb_produto.fk_id_categoria;

select * from tb_produto inner join tb_categoria on tb_categoria.id  = tb_produto.fk_id_categoria where fk_id_categoria = 4;