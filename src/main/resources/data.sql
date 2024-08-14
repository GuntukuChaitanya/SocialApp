insert into location values(1,'Dallas, TX, USA');
insert into location values(2,'Tampa, FL, USA');
COMMIT;
insert into app_users (id,first_name,last_name,email,location_id) values(1, 'Chaitanya', 'Guntuku', 'cg123@gmail.com',1 );
insert into app_users (id,first_name,last_name,email,location_id) values(2, 'Girish', 'G', 'gg2123@gmail.com',2 );
COMMIT;
insert into post (id, post_date, details, user_id) values (1, '2024-01-01', 'This is my first post',1)