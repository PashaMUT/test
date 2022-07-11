--drop table shp.producer

create table shp.producer
(
    producerid serial not null,
    country text not null,
    nameproducer text not null unique,
    primary key  (producerid)
);

--data for producer
insert into shp.producer(country, nameproducer) values ('EU', 'Lego');
insert into shp.producer(country, nameproducer) values ('RU', 'Dada');
insert into shp.producer(country, nameproducer) values ('BY', 'Polesye');
insert into shp.producer(country, nameproducer) values ('BY', 'BMZ');
insert into shp.producer(country, nameproducer) values ('BY', 'BN');
insert into shp.producer(country, nameproducer) values ('BY', 'Him');
insert into shp.producer(country, nameproducer) values ('RU', 'Spartak');
insert into shp.producer(country, nameproducer) values ('RU', 'CSKA');
insert into shp.producer(country, nameproducer) values ('BY', 'Volokno');
insert into shp.producer(country, nameproducer) values ('EU', 'Bakugan');
insert into shp.producer(country, nameproducer) values ('EU', 'YesYes');
insert into shp.producer(country, nameproducer) values ('BY', 'Berezina');



select a.country, sum(a.count) from
(
select 'СНГ' as country, count(country) from shp.producer
where country in('BY', 'RU')
group by country
union
select country, count(country) from shp.producer
where country ='EU'
group by country
) as a
group by a.country

