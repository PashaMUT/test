--drop table shp.history;
create table shp.history
(
    pay integer not null,
    payrow integer not null,
    dtpay timestamp not null default now(),
    rowid integer not null,
    amountsale integer not null,
    primary key  (pay,payrow),
    constraint fk_stock_history foreign key (rowid) references shp.stock(rowid)
);

--data for shp.history
insert into shp.history(pay,payrow ,dtpay,rowid,amountsale) values (1, 1, '2022-04-13', 1 ,3);
insert into shp.history(pay,payrow ,dtpay,rowid,amountsale) values (1, 2, '2022-04-13', 6 ,1);
insert into shp.history(pay,payrow ,dtpay,rowid,amountsale) values (1, 3, '2022-04-13', 9 ,2);
insert into shp.history(pay,payrow ,dtpay,rowid,amountsale) values (2, 1, '2022-03-21', 2 ,1);
insert into shp.history(pay,payrow ,dtpay,rowid,amountsale) values (2, 2, '2022-03-21', 3 ,12);
insert into shp.history(pay,payrow ,dtpay,rowid,amountsale) values (3, 1, '2022-01-07', 1 ,1);
insert into shp.history(pay,payrow ,dtpay,rowid,amountsale) values (3, 2, '2022-01-07', 7 ,2);
insert into shp.history(pay,payrow ,dtpay,rowid,amountsale) values (3, 3, '2022-01-07', 4 ,9);
insert into shp.history(pay,payrow ,dtpay,rowid,amountsale) values (4, 1, '2022-08-26', 3 ,2);
insert into shp.history(pay,payrow ,dtpay,rowid,amountsale) values (4, 4, '2022-08-26', 7 ,1);
insert into shp.history(pay,payrow ,dtpay,rowid,amountsale) values (5, 5, '2022-9-09', 1 ,5);

-- select's
-- количество строк в чеке и сумма чека
select  h.pay, sum(p.price * h.amountsale) as sumpay, count(h.pay) as count_row
from shp.history h ,shp.stock s ,shp.products p
where h.rowid = s.rowid
and h.rowid = p.pid
group by pay
order by pay;

-- чеки - строки - товар - количество - сумма
select  h.pay, h.payrow, h.dtpay, p.nameproduct, h.amountsale, (p.price * h.amountsale) as sumpay
from shp.history h ,shp.stock s ,shp.products p
where h.rowid = s.rowid
  and h.rowid = p.pid
order by pay;

--
select  count(h.*) from shp.history h;
