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


</pre>
