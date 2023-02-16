# JavaOCP_20221215
JavaOCP_20221215
<pre>
jdbc:mysql://localhost:3306/demo?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true

-- 建立資料表 student
create table if not exists student(
    id int not null auto_increment,
    name varchar(20) not null unique,
    score int,
    birth timestamp,
    primary key(id)
);

</pre>
