create DATABASE HelloSpringDB;
create schema public;
create table users(
	"user_id" serial primary key not null,
	"username" varchar unique not null,
	"passwd" varchar not null
);

create table cars(
	"car_id" serial primary key not null,
	"carname" varchar unique not null,
	"car_price" float check (car_price>0),
	"quantity" int not null check(quantity>0)
);


create table orders(
	"order_no" serial primary key not null,
	"user_id" int,
	"car_id" int,
	"date" date default now(),
	foreign key("user_id") references users(user_id),
	foreign key("car_id") references cars(car_id)
);

insert into users(username, passwd) values ('razvanf01', 'parolamea');
insert into users(username, passwd) values ('razvanf02', 'parolamea1');
insert into users(username, passwd) values ('razvanf03', 'parolamea4');
insert into users(username, passwd) values ('razvanf04', 'parolamea5');

insert into cars(carname, car_price, quantity) values('Ford Fiesta 2006 Rosu', 1200.5, 2);
insert into cars(carname, car_price, quantity) values('Dacia Logan 2009 Gri-inchis', 880.9,1);
insert into cars(carname, car_price, quantity) values('Opel Astra 2012 Alb', 4500, 3);

--buying process (hardcoed for tests only)
insert into orders (user_id, car_id) values (1,3);
update cars set quantity = 2 where car_id=3;

insert into orders (user_id, car_id) values (2,1);
update cars set quantity = 1 where car_id=1;