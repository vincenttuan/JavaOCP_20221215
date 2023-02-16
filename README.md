# JavaOCP_20221215
JavaOCP_20221215
<pre>
-- 資料庫連線參數
jdbc:mysql://localhost:3306/demo?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true

-- 建立資料表 student
create table if not exists student(
    id int not null auto_increment,
    name varchar(20) not null unique,
    score int,
    birth timestamp,
    primary key(id)
);

-- 新增紀錄
insert into student(name, score, birth) values('John', 100, '2000-1-3');
insert into student(name, score, birth) values('Mary', 90, '2001-2-5');
insert into student(name, score, birth) values('Jack', 80, '1999-4-8');

-- 查詢紀錄
select id, name, score, birth from student;
select * from student;  -- 用*表示所有欄位
select name from student;
select name, score from student where score >= 90;
select name, timestampdiff(year, birth, now()) as age from student;
select sum(score) as total, avg(score) as average from student;
select s.id, s.`name`, s.score, s.birth  from student s;
select count(*) as count, 
       sum(score) as total, 
       avg(score) as average, 
       max(score) as highest, 
       min(score) as lowest 
from student;

select s.id, s.`name`, s.score, s.birth 
from student s
order by s.score desc; -- asc(預設:小->大), desc(大->小)

-- 修改紀錄
update student
set score = 45
where id = 2;

update student
set score = 45
where name = 'Mary';

-- 刪除紀錄
delete from student where id = 4;

-- 建立 department 資料表
create table if not exists department(
    id int not null auto_increment,
    dep_name varchar(20) not null unique,
    primary key(id)
);

-- 建立 language 資料表
create table if not exists language(
    id int not null auto_increment,
    lan_name varchar(20) not null unique,
    primary key(id)
);

-- 建立 employee 資料表
create table if not exists employee(
    id int not null auto_increment,
    dep_id int not null,
    emp_name varchar(20) not null,
    salary int,
    foreign key (dep_id) references department(id), -- 外鍵參考
    primary key(id)
);

-- 建立 employee_language (多對多關聯用)資料表
create table if not exists employee_language(
    id int not null auto_increment,
    emp_id int not null,
    lan_id int not null,
    foreign key (emp_id) references employee(id), -- 外鍵參考
    foreign key (lan_id) references language(id), -- 外鍵參考
    primary key(id)
);

-- 新增資料
insert into department(dep_name) values('A部門');
insert into department(dep_name) values('B部門');
insert into department(dep_name) values('C部門');

insert into language(lan_name) values('Java');
insert into language(lan_name) values('Python');
insert into language(lan_name) values('Spring');

insert into employee(dep_id, emp_name, salary) values(1, 'John', 55000);
insert into employee(dep_id, emp_name, salary) values(2, 'Mary', 72000);
insert into employee(dep_id, emp_name, salary) values(1, 'Bob', 43000);
insert into employee(dep_id, emp_name, salary) values(3, 'Helen', 82000);

insert into employee_language(emp_id, lan_id) values(1, 1);
insert into employee_language(emp_id, lan_id) values(1, 2);
insert into employee_language(emp_id, lan_id) values(2, 1);
insert into employee_language(emp_id, lan_id) values(2, 3);
insert into employee_language(emp_id, lan_id) values(3, 1);
insert into employee_language(emp_id, lan_id) values(4, 1);
insert into employee_language(emp_id, lan_id) values(4, 2);
insert into employee_language(emp_id, lan_id) values(4, 3);

-- 資料查詢
select * from department;
select * from language;
select * from employee;
select * from employee_language;

-- A部門有哪些員工 ?
-- 先查 A部門的 id 為何?
select id from department where dep_name = 'A部門';
-- 查到 A部門的 id 為 1 之後將他套入到 sql where 條件中
select emp_name from employee where dep_id = 1;
-- 透過子查詢
select emp_name from employee where dep_id = (select id from department where dep_name = 'A部門' limit 1);

-- 會Python的有哪些員工 ?
select id from language where lan_name = 'Python' limit 1;
select emp_id from employee_language where lan_id = 2;
select emp_name from employee where id in (1, 4);
-- 利用子查詢
select emp_name from employee 
where id in (select emp_id from employee_language 
             where lan_id = (select id from language where lan_name = 'Python' limit 1));
</pre>
