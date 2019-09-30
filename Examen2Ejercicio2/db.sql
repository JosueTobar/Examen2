create database sales;
use sales;

create table Marca(
id int primary key auto_increment,
nombre varchar(200)
);

insert into Marca values(null,'Samsung');
insert into Marca values(null,'Motorola');
insert into Marca values(null,'Nokia');
insert into Marca values(null,'Alcatel');
insert into Marca values(null,'Apple');

CREATE TABLE Catalogo(
id INT PRIMARY KEY AUTO_INCREMENT,
nombre varchar(200)
);

select * from Catalogo;

insert into Catalogo values(null,'Celulares');
insert into Catalogo values(null,'Baterías');
insert into Catalogo values(null,'Cases');
insert into Catalogo values(null,'Audifonos');


create table Producto( 
 id int primary key auto_increment,
 nombre varchar(200),
 precio decimal(11,2),
 idMarca int,
 idCatalogo int,
 descripcion varchar(250),
 existencia int,
 foreign key (idMarca) references Marca(id),
 foreign key (idCatalogo) references Catalogo(id)
);

select * from Producto;
insert into Producto values(null,'A30',250,1,1,'telefono perron',1);
