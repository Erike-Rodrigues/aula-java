create database bd_itau;

#Marca o BD como default (padrão)
use bd_itau;

# criar uma table no BD
create table carro (
	codigo integer not null auto_increment,
    marca varchar(50) not null,
    modelo varchar(100),
    anoFabricacao integer,
    constraint pk_carro primary key (codigo)
);

#primary key serve para identificar unicamente uma linha na tabela
# foreign key serve para relacionar as tabelas

create table cliente ( 
	codigo integer not null auto_increment,
    nome varchar(120) not null,
    telefone varchar(15) not null unique,
    cod_carro integer,
    constraint pk_cliente primary key (codigo),
    constraint fk_carro foreign key (cod_carro) references carro(codigo)
);

# inserir dados na tabela

insert into carro values(
	null, "Chevrolet", "Cruze", 2020
);

insert into carro values(
	null, "Ferrari", "GTI", 2020
);

insert into carro values(
	null, "Volksvagem", "Uno", 2002
);

insert into cliente values(
	null, "Alexandro Silva", "(11)-95685-4478", 1
);

insert into cliente values(
	null, "Marcos Gaucho", "(11)-95685-4578", 2
);

insert into cliente values(
	null, "Ana cecilia", "(11)-95685-587s", 3
);

insert into cliente values(
	null, "Ana clara", "(11)-95645-5878", 1
);

#buscas todas as informações da 
#selecione todas as colunas da tabela carro
select * from carro;

#busque apenas a marca, o modelo e ano
select marca, modelo, anoFabricacao from carro;

# Busque as informações sobre os carros fabricados após o ano de 2019
select * from carro where anoFabricacao > 2019;

# SELECT <quais colunas>
# FROM <quais tabelas>
# WHERE <condição

# Listas todos os clientes
select * from cliente;

# listar os carror com seus proprietarios.
select * 
from carro inner join cliente on carro.codigo = cliente.cod_carro;

# alteração de dados

# alterar o telefone do cliente ana cecilia
update cliente
set telefone = "(25) 95847-2525"
where codigo = 4;

# apagar dados

# apagar um carro do banco BD
delete from cliente where codigo = 3;

delete
from carro
where codigo = 2;





