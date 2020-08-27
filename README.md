#Microservice-Postgres

##create table:


drop table if exists student;

CREATE TABLE if not exists student (
	id int PRIMARY KEY,
	firstname VARCHAR ( 50 ),
	lastname VARCHAR ( 50 ),
	age int
);

insert into student (id, firstname, lastname, age) values (1,'Sunil','M',28);
insert into student (id, firstname, lastname, age) values (2,'Giri','Kumar',30);
insert into student (id, firstname, lastname, age) values (3,'Krishna','Vasudevan',37);
insert into student (id, firstname, lastname, age) values (4,'Shankar','K',17);

select  * from student;
