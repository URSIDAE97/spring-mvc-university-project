INSERT INTO rola (id_roli, rola) VALUES (1, 'ADMIN');
INSERT INTO rola (id_roli, rola) VALUES (2, 'USER');


INSERT INTO uzytkownik (id_uzytkownika, email, haslo, imie, nazwisko, active) VALUES (1, 'user@user', '$2a$10$Anb7jpgtB7VNkiHyV0kvWuYgHsHwKRQMPzQ.EOZLGXgnj/8bSzfha', 'user', 'user', 1);
INSERT INTO uzytkownik (id_uzytkownika, email, haslo, imie, nazwisko, active) VALUES (2, 'usedr@usder', '$2a$10$Anb7jpgtB7VNkiHyV0kvWuYgHsHwKRQMPzQ.EOZLGXgnj/8bSzfha', 'user', 'user', 1);
INSERT INTO uzytkownik (id_uzytkownika, email, haslo, imie, nazwisko, active) VALUES (3, 'admin@admin', '$2a$10$Anb7jpgtB7VNkiHyV0kvWuYgHsHwKRQMPzQ.EOZLGXgnj/8bSzfha', 'admin', 'admin', 1);

INSERT INTO uzytkownik_rola (id_uzytkownika, id_roli) VALUES (1, 2);
INSERT INTO uzytkownik_rola (id_uzytkownika, id_roli) VALUES (2, 2);
INSERT INTO uzytkownik_rola(id_uzytkownika, id_roli) VALUES (3, 1);
INSERT INTO uzytkownik_rola (id_uzytkownika, id_roli) VALUES (3, 2);


INSERT INTO wydzial (id_wydzialu, nazwa, adres) VALUES (1, 'Wydzial Zarzadzania', 'Powstancow Warszawy');
INSERT INTO wydzial (id_wydzialu, nazwa, adres) VALUES (2, 'Wydzial Elektrotechniki i Informatyki', 'Wincentego Pola');
INSERT INTO wydzial (id_wydzialu, nazwa, adres) VALUES (3, 'Wydzial Budowy Maszyn i Lotnictwa', 'Powstancow Warszawy');
INSERT INTO wydzial (id_wydzialu, nazwa, adres) VALUES (4, 'Wydzial Budownictwa, Inzynierii Srodowiska i Architektury', 'Poznańska');
INSERT INTO wydzial (id_wydzialu, nazwa, adres) VALUES (5, 'Wydzial Chemiczny', 'Powstancow Warszawy');
INSERT INTO wydzial (id_wydzialu, nazwa, adres) VALUES (6, 'Wydzial Matematyki i Fizyka stosowanej', 'Powstancow Warszawy');
INSERT INTO wydzial (id_wydzialu, nazwa, adres) VALUES (7, 'Wydzial Mechaniczno Technologiczny', 'Kwiatkowskiego');

INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (1, 1, 'Bezpieczenstwo wewnetrzne', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (2, 1, 'Finanse i rachunkowosc', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (3, 1, 'Logistyka', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (4, 1, 'Zarzadzanie', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (5, 2, 'Automatyka i robotyka', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (6, 2, 'Elektronika i telekomunikacja', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (7, 2, 'Elektrotechnika', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (8, 2, 'Energetyka', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (9, 2, 'Informatyka', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (10, 3, 'Mechanika i budowa maszyn', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (11, 3, 'Zarzadzanie i inzynieria produkcji', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (12, 3, 'Lotnictwo i kosmonautyka', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (13, 3, 'Transport', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (14, 3, 'Mechatronika', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (15, 3, 'Inżznieria materialowa', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (16, 4, 'Architektura', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (17, 4, 'Budownictwo', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (18, 4, 'Ochrona srodowiska', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (19, 4, 'Inzynieria srodowiska', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (20, 4, 'Biogospodarka', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (21, 5, 'Technologia chemiczna', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (22, 5, 'Inzynieria chemiczna i procesowa', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (23, 5, 'Biotechnologia', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (24, 6, 'Inzynieria medyczna', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (25, 6, 'Zastosowane matematyki w ekonomii', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (26, 7, 'Mechanika i budowa maszyn', 'brak opisu');
INSERT INTO kierunek (id_kierunku, id_wydzialu, nazwa, opis) VALUES (27, 7, 'Zarzadzanie i inzynieria produkcji', 'brak opisu');




INSERT INTO pytanie (id_pytania , tresc) VALUES (1, 'Jak oceniasz swoje umiejetnosci dogadywania sie z ludzmi?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (2, 'Twoim zdaniem umiejetnosci miekkie sa wazniejsze?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (3, 'Czy czujesz sie dobrze kiedy wystepujesz publicznie?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (4, 'Twoim zdaniem posiadasz umiejetnosci motywowania innych do dzialania?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (5, 'Uwazasz ze sport zajmuje duza czesc twojego zycia?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (6, 'Uwazasz ze posiadasz inteligencje kognitywna?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (7, 'Masz wyobrazenie przestrzenne?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (8, 'Jestes osoba dokladna?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (9, 'Robisz drobne, zlozone rzeczy? ');
INSERT INTO pytanie (id_pytania , tresc) VALUES (10, 'Lubisz latac samolotem?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (11, 'Posiadasz zdolnosci manualne?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (12, 'Interesuje Cie modernizacja , budowa?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (13, 'Montujesz i naprawiasz rozne maszyny , przyrzady i mechanizmy?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (14, 'Czy czesto wpadasz na ciekawe pomysly?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (15, 'Czy lubisz projektowac?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (16, 'Czy dbasz o srodowisko?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (17, 'Jestes dokladny w tym co robisz?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (18, 'Czy masz wyczucie stylu i estetyki?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (19, 'Jestes osoba dokladna, precyzyjna? ');
INSERT INTO pytanie (id_pytania , tresc) VALUES (20, 'Posiadasz podzielnosc uwagi?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (21, 'Potrafisz uczyc sie systematycznie?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (22, 'Jestes ambitny?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (23, 'Masz dobra pamiec?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (24, 'Posiadasz zdolnosci manualne?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (25, 'Jestes osoba ostrozna czy bardziej porywcza i nie ostrozna?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (26, 'W jakim stopniu jestes osoba cierpliwa?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (27, 'Jak bardzo lubisz pracowac z komputerem?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (28, 'Ocen czy potrafia skoncentrowac sie na jednostajnych czynnosciach.');
INSERT INTO pytanie (id_pytania , tresc) VALUES (29, 'W jakim stopniu potrafisz sluchac innych?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (30, 'Jak bardzo jestes osoba skryta w sobie? ');
INSERT INTO pytanie (id_pytania , tresc) VALUES (31, 'W jakim stopniu masz opanowana sztuke prowadzenia prezentacji?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (32, 'Ocen jak radzisz sobie z praca z zespolem.');
INSERT INTO pytanie (id_pytania , tresc) VALUES (33, 'Ocen jak bardzo jestes ruchliwa osoba.');
INSERT INTO pytanie (id_pytania , tresc) VALUES (34, 'Czy posiadasz scisly umysl?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (35, 'Myslisz w sposob analityczny?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (36, 'Lubisz uczyc sie systematycznie?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (37, 'Lubisz rozwiazywac zadania obliczeniowe?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (38, 'Jestes dobrym sluchaczem i latwo przyswajasz wiedze?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (39, 'Dzialasz szybko i sprawnie?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (40, 'Czy uwazasz ze odnawianie starych samochodow to dobre hobby?');
INSERT INTO pytanie (id_pytania , tresc) VALUES (41, 'Twoim zdaniem posiadasz dobrze rozwiniete zdolnosci manualne?');


INSERT INTO odpowiedz_uzytkownika (id_odpowiedzi_uzytkownika, wartosc, id_pytania, id_uzytkownika) VALUES (1, 9, 1, 1);
INSERT INTO odpowiedz_uzytkownika (id_odpowiedzi_uzytkownika, wartosc, id_pytania, id_uzytkownika) VALUES (2, 10, 2, 1);
INSERT INTO odpowiedz_uzytkownika (id_odpowiedzi_uzytkownika, wartosc, id_pytania, id_uzytkownika) VALUES (3, 5, 3, 1);
INSERT INTO odpowiedz_uzytkownika (id_odpowiedzi_uzytkownika, wartosc, id_pytania, id_uzytkownika) VALUES (4, 3, 1, 2);
INSERT INTO odpowiedz_uzytkownika (id_odpowiedzi_uzytkownika, wartosc, id_pytania, id_uzytkownika) VALUES (5, 7, 2, 2);
INSERT INTO odpowiedz_uzytkownika (id_odpowiedzi_uzytkownika, wartosc, id_pytania, id_uzytkownika) VALUES (6, 8, 3, 2);

INSERT INTO wartosc_oczekiwana (id_wartosci_oczekiwanej, wartosc, id_pytania, id_kierunku) VALUES (1, 8, 1,1);
INSERT INTO wartosc_oczekiwana (id_wartosci_oczekiwanej, wartosc, id_pytania, id_kierunku) VALUES (2, 9, 2,1);
INSERT INTO wartosc_oczekiwana (id_wartosci_oczekiwanej, wartosc, id_pytania, id_kierunku) VALUES (3, 7, 3,1);
INSERT INTO wartosc_oczekiwana (id_wartosci_oczekiwanej, wartosc, id_pytania, id_kierunku) VALUES (4, 9, 1,2);
INSERT INTO wartosc_oczekiwana (id_wartosci_oczekiwanej, wartosc, id_pytania, id_kierunku) VALUES (5, 10, 2,2);
INSERT INTO wartosc_oczekiwana (id_wartosci_oczekiwanej, wartosc, id_pytania, id_kierunku) VALUES (6, 5, 3,2);
INSERT INTO wartosc_oczekiwana (id_wartosci_oczekiwanej, wartosc, id_pytania, id_kierunku) VALUES (7, 3, 1,3);
INSERT INTO wartosc_oczekiwana (id_wartosci_oczekiwanej, wartosc, id_pytania, id_kierunku) VALUES (8, 9, 2,3);
INSERT INTO wartosc_oczekiwana (id_wartosci_oczekiwanej, wartosc, id_pytania, id_kierunku) VALUES (9, 6, 3,3);
INSERT INTO wartosc_oczekiwana (id_wartosci_oczekiwanej, wartosc, id_pytania, id_kierunku) VALUES (10, 9, 1,4);
INSERT INTO wartosc_oczekiwana (id_wartosci_oczekiwanej, wartosc, id_pytania, id_kierunku) VALUES (11, 10, 2,4);
INSERT INTO wartosc_oczekiwana (id_wartosci_oczekiwanej, wartosc, id_pytania, id_kierunku) VALUES (12, 4, 3,4);



