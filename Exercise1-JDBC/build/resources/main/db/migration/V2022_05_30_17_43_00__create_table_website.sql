CREATE TABLE website(
    id BIGSERIAL NOT NULL PRIMARY KEY,
    name char(20) NOT NULL DEFAULT '',
    url varchar(255) NOT NULL DEFAULT '',
    alexa int NOT NULL DEFAULT '0',
    country char(10) NOT NULL DEFAULT ''
);

comment on column website.name is '站点名称';
comment on column website.alexa is 'Alexa 排名';
comment on column website.country is '国家';