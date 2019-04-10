create table public."user"
(
  id   integer,
  name varchar(20)
);

alter table public."user"
  owner to postgres;
