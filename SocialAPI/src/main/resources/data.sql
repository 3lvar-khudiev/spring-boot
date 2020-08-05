insert into Location(id, name) values(1, 'USA, New York');
insert into Location(id, name) values(2, 'Germany, Hamburg');
COMMIT;

insert into User(id, firstname, lastname, email, location_id) values(1, 'Elvar 1', 'Khudiev 1', 'elvarkhudiev1@gmail.com', 1);
insert into User(id, firstname, lastname, email, location_id) values(2, 'Elvar 2', 'Khudiev 2', 'elvarkhudiev2@gmail.com', 1);
insert into User(id, firstname, lastname, email, location_id) values(3, 'Elvar 3', 'Khudiev 3','elvarkhudiev3@gmail.com',  2);
insert into User(id, firstname, lastname, email, location_id) values(4, 'Elvar 4', 'Khudiev 4','elvarkhudiev4@gmail.com',  2);
COMMIT;

insert into Post(id, details, post_date, user_id) values(1, 'This is first post.', CURRENT_TIMESTAMP(), 1);
insert into Post(id, details, post_date, user_id) values(2, 'This is second post.', CURRENT_TIMESTAMP(), 1);
insert into Post(id, details, post_date, user_id) values(3, 'This is thirty post.', CURRENT_TIMESTAMP(), 2);
insert into Post(id, details, post_date, user_id) values(4, 'This is fourth post.', CURRENT_TIMESTAMP(), 2);