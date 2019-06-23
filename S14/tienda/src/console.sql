create database venta;

create table venta.producto (
  id_producto numeric(9,0) primary key ,
  nombre varchar(100),
  precio_unitario numeric(10,2)
);
alter table venta.producto add primary key (id_producto);
create schema venta;

create table venta.pedido (
  id_producto numeric(9,0) references venta.producto(id_producto),
  id_pedido numeric(9,0) primary key ,
  cantidad_productos numeric(10,0),
  monto_unitario numeric(10,2),
  igv numeric(10,2),
  monto_total numeric(10,2)
);

insert into venta.producto values(1,'producto1',10);
insert into venta.producto values(2,'producto2',50);
insert into venta.producto values(3,'producto2',100);

commit;