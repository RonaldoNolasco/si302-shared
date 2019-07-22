select * from cliente;

insert into cliente (doi,nombre,direccion) values ('76146602','Ronaldo Nolasco','GAAAAAAAAAAAAAAAAAAA');

delete from cliente where doi ='75410013';

update cliente set direccion = 'Av. Peru' where doi='76146602';

commit;