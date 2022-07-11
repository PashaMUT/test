--drop table shp.stock;

create table shp.stock
(
    rowid serial not null,
    pid integer not null,
    amountstck integer not null,
    dtsupply date not null default now(),
    primary key  (rowid),
    constraint fk_stok foreign key (pid) references shp.products(pid)
);

insert into shp.stock(pid, amountstck, dtsupply) values (1, 100, '2022-05-03');
insert into shp.stock(pid, amountstck, dtsupply) values (2, 100, '2022-05-04');
insert into shp.stock(pid, amountstck, dtsupply) values (3, 10, '2022-06-27');
insert into shp.stock(pid, amountstck, dtsupply) values (4, 100, '2022-06-28');
insert into shp.stock(pid, amountstck, dtsupply) values (5, 100, '2022-07-08');
insert into shp.stock(pid, amountstck, dtsupply) values (6, 100, '2022-07-13');
insert into shp.stock(pid, amountstck, dtsupply) values (7, 100, '2022-07-14');
insert into shp.stock(pid, amountstck, dtsupply) values (8, 10, '2022-07-22');
insert into shp.stock(pid, amountstck, dtsupply) values (9, 1000, '2022-08-02');
insert into shp.stock(pid, amountstck, dtsupply) values (10, 100, '2022-08-10');


select s.rowid, s.pid, p.nameproduct, p.producerid, b.nameproducer, s.amountstck, p.price, s.amountstck * p.price as summa
from shp.stock s, shp.products p, shp.producer b
where p.pid = s.pid
  and b.producerid = p.producerid

-- разница дней между поставками OVER
select  rowid, pid, amountstck, dtsupply, lag(dtsupply) OVER w - dtsupply AS date_lag
from shp.stock
WINDOW w AS (ORDER BY dtsupply DESC)
ORDER BY dtsupply desc

