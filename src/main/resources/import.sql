INSERT INTO role (role_id, role) VALUES (1, 'ADMIN');
INSERT INTO role (role_id, role) VALUES (2, 'USER');


INSERT INTO user (user_id, email, password, name, last_name, active) VALUES (1, 'user@user', '$2a$10$Anb7jpgtB7VNkiHyV0kvWuYgHsHwKRQMPzQ.EOZLGXgnj/8bSzfha', 'user', 'user', 1);
INSERT INTO user (user_id, email, password, name, last_name, active) VALUES (2, 'usedr@usder', '$2a$10$Anb7jpgtB7VNkiHyV0kvWuYgHsHwKRQMPzQ.EOZLGXgnj/8bSzfha', 'user', 'user', 1);
INSERT INTO user (user_id, email, password, name, last_name, active) VALUES (3, 'admin@admin', '$2a$10$Anb7jpgtB7VNkiHyV0kvWuYgHsHwKRQMPzQ.EOZLGXgnj/8bSzfha', 'admin', 'admin', 1);

INSERT INTO user_role (user_id, role_id) VALUES (1, 2);
INSERT INTO user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO user_role (user_id, role_id) VALUES (3, 2);

INSERT INTO pytanie (id , tresc) VALUES (1, 'Ddziala');

INSERT INTO odpowiedz_uzytkownika (id, wartosc, question_id, user_user_id) VALUES (1, 9, 1, 1);

INSERT INTO wartosc_oczekiwana (id, wartosc, question_id) VALUES (1, 8, 1);

INSERT INTO wydzial (id, nazwa, adres) VALUES (1, 'Wydzial Zarzadzania', 'Powstancow Warszawy');

INSERT INTO kierunek (id, faculty_id, nazwa, opis) VALUES (1, 1, 'Logistyka', 'A nie wiem w sumie');

INSERT INTO user_kierunek (user_id, specialization_id) VALUES (1,1);