--drop table shp.products;
create table shp.products
(
    pid         integer not null,
    providerid  integer not null,
    producerid  integer not null,
    nameproduct text    not null, -- Имя товара
    price       float   not null, -- цена
    primary key (pid),
    constraint fk_product_producer foreign key (producerid) references shp.producer(producerid),
    constraint fk_product_provider foreign key (providerid) references shp.provider(providerid)
);


--data for table
insert into shp.products values (1,1,1,'машинка',25);
insert into shp.products values (2,1,2,'Пример 12',2);
insert into shp.products values (3,1,1,'Пример 13',5);
insert into shp.products values (4,1,2,'Пример 14',34);
insert into shp.products values (5,1,2,'Пример 15',23);
insert into shp.products values (6,1,1,'Пример 16',212);
insert into shp.products values (7,2,1,'Пример 17',234);
insert into shp.products values (8,2,2,'Пример 18',234);
insert into shp.products values (9,2,1,'Пример 19',23);
insert into shp.products values (10,2,2,'Пример 10',54);
insert into shp.products values (11,2,1,'Пример 11',31);


select p.pid, p.providerid, b.nameprovider, b.cityprovider, p.producerid, z.nameproducer ,z.country, p.nameproduct, p.price, row_number() over (ORDER BY price DESC) as rating
   from shp.products p, shp.provider b, shp.producer z
 where  b.providerid = p.providerid
    and z.producerid = p.producerid

