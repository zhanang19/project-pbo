create table animal
(
  id          serial       not null
    constraint animal_pk
      primary key,
  animal_name varchar(191) not null,
  animal_type integer      not null
    constraint animal_type_fk
      references animal_type,
  gender      varchar(10)  not null,
  birth_date  date         not null,
  id_user     integer      not null
    constraint animal_id_user_fk
      references users,
  skin_color  varchar(20)  not null,
  ear_type    varchar(20)  not null,
  type_pet    integer      not null
    constraint animal_type_pet_fk
      references type_pet,
  updated_at  date,
  created_at  date
);

alter table animal
  owner to ttmzwvmtinzjlp;

INSERT INTO public.animal (id, animal_name, animal_type, gender, birth_date, id_user, skin_color, ear_type, type_pet, updated_at, created_at) VALUES (1, 'kambing-1', 1, 'female', '2018-04-18', 5, 'black', 'big', 1, '2019-04-19', '2019-04-18');
INSERT INTO public.animal (id, animal_name, animal_type, gender, birth_date, id_user, skin_color, ear_type, type_pet, updated_at, created_at) VALUES (2, 'kambing-2', 1, 'male', '2018-04-19', 6, 'brown', 'small', 2, '2019-04-19', '2019-04-18');
INSERT INTO public.animal (id, animal_name, animal_type, gender, birth_date, id_user, skin_color, ear_type, type_pet, updated_at, created_at) VALUES (3, 'sapi-1', 2, 'male', '2018-04-19', 5, 'brown', 'big', 4, '2019-04-19', '2019-04-18');
create table animal_care
(
  id          serial           not null
    constraint animal_care_pk
      primary key,
  id_animal   integer          not null
    constraint animal_care_animal_type_fk
      references animal_type,
  id_user     integer
    constraint animal_care_id_user_fk
      references users,
  weight      double precision,
  body_length double precision not null,
  chest_size  double precision,
  height      double precision not null,
  comment     text,
  timestamp   timestamp default CURRENT_TIMESTAMP
);

alter table animal_care
  owner to ttmzwvmtinzjlp;


create table animal_type
(
  id          serial       not null
    constraint animal_type_pk
      primary key,
  animal_type varchar(191) not null
);

alter table animal_type
  owner to ttmzwvmtinzjlp;

INSERT INTO public.animal_type (id, animal_type) VALUES (1, 'goat');
INSERT INTO public.animal_type (id, animal_type) VALUES (2, 'cow');
create table level
(
  id    serial      not null
    constraint level_pk
      primary key,
  level varchar(20) not null
);

alter table level
  owner to ttmzwvmtinzjlp;

INSERT INTO public.level (id, level) VALUES (1, 'admin');
INSERT INTO public.level (id, level) VALUES (2, 'manager');
INSERT INTO public.level (id, level) VALUES (3, 'nurse');
INSERT INTO public.level (id, level) VALUES (4, 'animal-owner');
create table type_pet
(
  id       serial      not null
    constraint type_pet_pk
      primary key,
  type_pet varchar(50) not null
);

alter table type_pet
  owner to ttmzwvmtinzjlp;

INSERT INTO public.type_pet (id, type_pet) VALUES (1, 'boer');
INSERT INTO public.type_pet (id, type_pet) VALUES (2, 'alpen');
INSERT INTO public.type_pet (id, type_pet) VALUES (3, 'etawa');
INSERT INTO public.type_pet (id, type_pet) VALUES (4, 'hereford');
create table users
(
  id         serial             not null
    constraint users_pk
      primary key,
  name       varchar(191)       not null,
  email      varchar(191)       not null,
  password   varchar(191)       not null,
  level      integer  default 2 not null
    constraint users_level_fk
      references level,
  status     smallint default 0,
  updated_at date,
  created_at date
);

alter table users
  owner to ttmzwvmtinzjlp;

INSERT INTO public.users (id, name, email, password, level, status, updated_at, created_at) VALUES (2, 'admin', 'admin@gazeboin.com', '123123', 1, 1, '2019-04-19', '2019-04-18');
INSERT INTO public.users (id, name, email, password, level, status, updated_at, created_at) VALUES (3, 'manajer', 'manajer@gazeboin.com', '123123', 2, 1, '2019-04-19', '2019-04-18');
INSERT INTO public.users (id, name, email, password, level, status, updated_at, created_at) VALUES (4, 'perawat', 'perawat@gazeboin.com', '123123', 3, 1, '2019-04-19', '2019-04-18');
INSERT INTO public.users (id, name, email, password, level, status, updated_at, created_at) VALUES (5, 'pelanggan', 'pelanggan@gazeboin.com', '123123', 4, 1, '2019-04-19', '2019-04-18');
INSERT INTO public.users (id, name, email, password, level, status, updated_at, created_at) VALUES (6, 'pelanggan-2', 'pelanggan2@gazeboin.com', '123123', 4, 1, '2019-04-19', '2019-04-18');
INSERT INTO public.users (id, name, email, password, level, status, updated_at, created_at) VALUES (7, 'pelanggan-3', 'pelanggan3@gazeboin.com', '123123', 4, 1, '2019-04-19', '2019-04-18');