-- how to set id:int11 and alexa:int11
CREATE TABLE website(
   id BIGSERIAL NOT NULL PRIMARY KEY,
   name char(20) NOT NULL DEFAULT '',
   url varchar(255) NOT NULL DEFAULT '',
   alexa int NOT NULL DEFAULT '0',
   country char(10) NOT NULL DEFAULT ''
);

-- how to comment when create table
comment on column website.name is '站点名称';
comment on column website.alexa is 'Alexa 排名';
comment on column website.country is '国家';

INSERT INTO website VALUES ('1', 'Google', 'https://www.google.cm/', '1', 'USA'), ('2', '淘宝', 'https://www.taobao.com/', '13', 'CN'), ('3', '菜鸟教程', 'http://www.runoob.com', '5892', ''), ('4', '微博', 'http://weibo.com/', '20', 'CN'), ('5', 'Facebook', 'https://www.facebook.com/', '3', 'USA');