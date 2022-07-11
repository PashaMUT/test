--drop table sys.users_role
create table sys.users_role
(
    uid integer not null,
    rid integer not null,
    constraint pk_usersrole primary key  (uid,rid),
    constraint fk_uusersrole foreign key (uid) references sys.users(uid),
    constraint fk_rusersrole foreign key (rid) references sys.role(rid)
)