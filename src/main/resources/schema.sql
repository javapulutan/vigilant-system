
drop table if exists staging.post;

create table staging.post(
    id serial primary key,
    title varchar(100),
    author varchar(100)
);