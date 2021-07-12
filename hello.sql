create table hello(id int, name varchar(10));
create table hello1(id int, name varchar(10));

select * from hello;

insert into hello (id,name)values(100,'Suleman');
insert into hello (id,name) values(101,'Faisal');
insert into hello1 (id,name)values(100,'Suleman');
insert into hello1 (id,name) values(101,'Faisal');
update hello set name='Syed' where id = 100;
update hello set name ='Suleman' where id = 101;

delete from hello where id=101;
select id from hello;
select  name  from hello order by name desc;
--truncate table hello1; delete the values only
--drop table hello1; drops the whole table everything will be deleted