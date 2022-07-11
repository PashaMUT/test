-- drop table sys.role;
create table sys.role
(
    rid integer not null unique,
    rname text not null,
    primary key (rid)
);

--data for table
insert into sys.role values (1, 'guest');
insert into sys.role values (2, 'user');
insert into sys.role values (3, 'member');
insert into sys.role values (10, 'admin');
