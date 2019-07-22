create table cliente(
  doi varchar(10),
  nombre varchar(60),
  direccion varchar(60)
);

select * from cliente;

insert into cliente (doi,nombre,direccion) values ('76146603','Ronaldo Nolasco','Av. Jose Granda');
insert into cliente (doi,nombre,direccion) values ('76146603','Ronaldo Nolasco','Av. Lima');
insert into cliente (doi,nombre,direccion) values ('76146604','Ronaldo Nolasco','Vas a caer chupetin');
insert into cliente (doi,nombre,direccion) values ('76146604','R','Vas a caer chupetin');

update cliente set direccion = 'Av. Peru' where doi='76146602';

delete from cliente where doi ='75410013';

drop table cliente;


select max(doi) from cliente;
select min (direccion), nombre, max(direccion) from cliente group by nombre;

commit;

create table empleado(
                       codigo varchar(10),
                       nombre varchar(60),
                       salario numeric(9,2),
                       departamento char(1),
                       ciudad varchar(10)
);

select * from empleado;

insert into empleado (codigo, nombre, salario, departamento, ciudad) values ('123','Ronaldo',168.96,'A','M');
insert into empleado (codigo, nombre, salario, departamento, ciudad) values ('853','Juan',162.76,'B','M');
insert into empleado (codigo, nombre, salario, departamento, ciudad) values ('063','Alejandro',532.73,'C','N');
insert into empleado (codigo, nombre, salario, departamento, ciudad) values ('254','Rosa',525.74,'D','Q');
insert into empleado (codigo, nombre, salario, departamento, ciudad) values ('759','Alexis',923.65,'B','Q');
insert into empleado (codigo, nombre, salario, departamento, ciudad) values ('593','Cristian',726.84,'C','L');
insert into empleado (codigo, nombre, salario, departamento, ciudad) values ('016','Gustavo',416.34,'D','N');
insert into empleado (codigo, nombre, salario, departamento, ciudad) values ('627','Kevin',957.02,'A','M');
insert into empleado (codigo, nombre, salario, departamento, ciudad) values ('854','Luis',624.63,'A','Q');
insert into empleado (codigo, nombre, salario, departamento, ciudad) values ('736','Jorge',667.92,'C','L');

select max(salario) maximo, departamento || ' departamento' descripcion from empleado group by departamento;

select sum(salario) minimo, departamento departamento from empleado group by departamento;

select sum(salario) minimo, ciudad ciudad from empleado group by ciudad;

select sum(salario) minimo, ciudad ciudad, departamento departamento from empleado
where departamento!='B' and ciudad!='L' group by departamento,ciudad
order by ciudad,departamento;

drop table empleado;

create table item(
  co_item varchar(20),
  co_producto varchar(20)
);

create table producto(
  co_producto varchar(20),
  nombre      varchar(20),
  precio      numeric(6, 2)
);

insert into item(co_item, co_producto) VALUES ('132','abc1');
insert into item(co_item, co_producto) VALUES ('133','abc2');
insert into item(co_item, co_producto) VALUES ('134','abc3');
insert into item(co_item, co_producto) VALUES ('135','abc4');
insert into item(co_item, co_producto) VALUES ('136','abc5');

insert into producto(co_producto, nombre, precio) VALUES ('abc1','arroz',15.90);
insert into producto(co_producto, nombre, precio) VALUES ('abc2','leche',13.65);
insert into producto(co_producto, nombre, precio) VALUES ('abc3','arroz',14.56);
insert into producto(co_producto, nombre, precio) VALUES ('abc4','detergente',16.36);
insert into producto(co_producto, nombre, precio) VALUES ('abc5','sal',11.95);

select * from item;
select * from producto;

drop table item;
drop table producto;

select A.co_item
from(
  select i.co_item, p.nombre, p.precio
  from item i
         inner join producto p on (i.co_producto = p.co_producto)
)A

where A.co_item in(
  select b.co_item
    from item group by where b.item<100);



