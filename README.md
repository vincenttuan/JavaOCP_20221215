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

</pre>
