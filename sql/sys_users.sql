create table sys.users
(
    uid integer not null,
    login text not null unique, -- Имя пользователя
    email text not null unique, -- email
    surname text not null, -- Фамилия (surname)
    name text not null, -- Имя (name)
    patronymic text not null, -- Отчество (patronymic)
    pass text NOT NULL, -- Пароль пользователя
    phone text, -- Телефон пользователя
    primary key (uid)
);

--data
insert into sys.users values (1, 'pav','pa@pa.com','pa','ve','l','123','22233232');


--select
select u.uid, login, email, surname, name, patronymic, pass, phone from sys.users u