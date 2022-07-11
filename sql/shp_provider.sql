--drop table shp.provider

create table shp.provider
(
    providerid serial not null,
    nameprovider text not null ,
    cityprovider text not null,
    primary key  (providerid)
);

insert into shp.provider(nameprovider, cityprovider) values ('OOO', 'Minsk');
insert into shp.provider(nameprovider, cityprovider) values ('OOO a', 'Minsk');
insert into shp.provider(nameprovider, cityprovider) values ('OOO b', 'Moscow');
insert into shp.provider(nameprovider, cityprovider) values ('OAO', 'Svetlogorsk');
insert into shp.provider(nameprovider, cityprovider) values ('BMZ', 'Zhlobin');
insert into shp.provider(nameprovider, cityprovider) values ('BMW', 'Zhlobin');
insert into shp.provider(nameprovider, cityprovider) values ('ABC', 'Zhlobin');

--кол-во провайдеров в городе
select  s.cityprovider , count(s.cityprovider) as amontproviders
from shp.provider s
where s.providerid = s.providerid
and s.cityprovider in( 'Zhlobin' , 'Minsk')
group by s.cityprovider
