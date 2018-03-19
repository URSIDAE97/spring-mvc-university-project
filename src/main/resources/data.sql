INSERT INTO role (role_id, role) VALUES (1, 'ADMIN');
INSERT INTO role (role_id, role) VALUES (2, 'USER');


INSERT INTO user (user_id, email, password, name, last_name, active) VALUES (1, 'user@user', '$2a$10$Anb7jpgtB7VNkiHyV0kvWuYgHsHwKRQMPzQ.EOZLGXgnj/8bSzfha', 'user', 'user', 1);
INSERT INTO user (user_id, email, password, name, last_name, active) VALUES (2, 'usedr@usder', '$2a$10$Anb7jpgtB7VNkiHyV0kvWuYgHsHwKRQMPzQ.EOZLGXgnj/8bSzfha', 'user', 'user', 1);
INSERT INTO user (user_id, email, password, name, last_name, active) VALUES (3, 'admin@admin', '$2a$10$Anb7jpgtB7VNkiHyV0kvWuYgHsHwKRQMPzQ.EOZLGXgnj/8bSzfha', 'admin', 'admin', 1);

INSERT INTO user_role (user_id, role_id) VALUES (1, 2);
INSERT INTO user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO user_role (user_id, role_id) VALUES (3, 2);

-- EXAMPLE ONLY
INSERT INTO example (id, example) VALUES (1, 'Example text 1');
INSERT INTO example (id, example) VALUES (2, 'Example text 2');
INSERT INTO example (id, example) VALUES (3, 'Example text 3');