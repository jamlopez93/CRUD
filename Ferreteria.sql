drop schema if exists ferreteria;
create schema ferreteria;
use ferreteria;

create table categorias(
	cat_id int primary key,
    nombre varchar(45),
    fecha_creacion date
);

create table proveedor(
	prov_id int primary key,
    prov_nombre varchar(45),
    prov_telefono varchar(45)
);
create table productos(
	pro_id int primary key,
	pro_name varchar(45),
    pro_precio int,
    pro_marca varchar(45),
	pro_categoria int,
    pro_proveedor int,
    foreign key(pro_proveedor)references proveedor(prov_id),
    foreign key(pro_categoria)references categorias(cat_id)
);

insert into categorias values(1,"Cables",'2022-05-28');
insert into categorias values(2,"Herramientas",'2022-04-15');
insert into categorias values(3,"Pinturas",'2022-01-31');
insert into categorias values(4,"Tornillos",'2022-02-07');
insert into categorias values(5,"Pegamentos",'2021-11-30');

insert into proveedor values(1,"Bellota","878969");
insert into proveedor values(2,"Pintuco","7485963");
insert into proveedor values(3,"Argos","459874");
insert into proveedor values(4,"Pintuco","123654");
insert into proveedor values(5,"Pavco","963214");