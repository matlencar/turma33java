create database db_funcionarios;

use db_funcionarios;

create table banco(
	id int(5) auto_increment,
    nome varchar(8) not null,
    salario decimal(10,0) ,
    cargo varchar(5),
    email varchar(7),
    primary key(id)
    );

insert into rh_funcionario(nome,salario,cargo,idade,genero) values ("Matheus",1890.00,"Escritorio",22,"M");
insert into rh_funcionario(nome,salario,cargo,idade,genero) values ("Isabelle",2300.00,"Financeiro",25,"F");
insert into rh_funcionario(nome,salario,cargo,idade,genero) values ("Juliana",2900.00,"Administrativa",32,"F");
insert into rh_funcionario(nome,salario,cargo,idade,genero) values ("Jean",1700.00,"Estagiario",18,"M");
insert into rh_funcionario(nome,salario,cargo,idade,genero) values ("Maria",4200.00,"Desenvolvedora",39,"F");

select * from db_funcionarios.rh_funcionario;