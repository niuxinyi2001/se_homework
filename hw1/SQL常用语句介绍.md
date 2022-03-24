#SQL语句
##SQL语句简介
&emsp;&emsp;结构化查询语言(Structured Query Language)简称SQL，SQL是一种数据库查询和程序设计语言，用于存取数据以及查询、更新和管理关系数据库系统。



##常用的SQL语句
+ 对数据库的操作
1. 创建数据库
`CREATE DATABASE database-name`
2. 删除数据库
`drop database dbname`
+ 对数据库中表的操作
1. 创建表
`create table tabname(col1 type1 [not null] [primary key],col2 type2 [not null],..)`
2. 删除表
`drop table tabname`
3. **查找**
查找操作是数据库<font color=red>最常用与最重要</font>的操作之一，其sql语句如下：
```
    select col1,col2,...
    from tablename 
    where 条件
 ```
4. 修改
4.1 更新表中数据
`update table1 set field1=value1 where 范围`
4.2 将新数据插入表中
```
    insert
    into tablename(col1,col2)
    values(...)
 ```
4.3 删除表中数据
```
    delete
    from tablename
    where 条件
 ```
## 总结
&emsp;&emsp;sql语言具有很多优点。例如其*风格统一*，可以独立完成数据库生命周期中的全部活动，使系统具有良好的可扩充性；使用*高度非过程化*，用户无须了解存取路径，存取路径的选择以及SQL语句的操作过程由系统自动完成；*语言简单易学*，完成数据定义、数据操纵、数据控制的核心功能只用了9个动词：CREATE、ALTER、DROP、SELECT、INSERT、UPDATE、DELETE、GRANT、REVOKE，语法简单。


本文部分参考自：
[sql](https://baike.baidu.com/item/%E7%BB%93%E6%9E%84%E5%8C%96%E6%9F%A5%E8%AF%A2%E8%AF%AD%E8%A8%80/10450182?fromtitle=sql&fromid=86007&fr=aladdin#5)
[sql语句](https://baike.baidu.com/item/sql%E8%AF%AD%E5%8F%A5/5714895?fr=aladdin)

