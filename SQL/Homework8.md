Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.


1. Test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.

```SQL
        CREATE TABLE employee (
	        id integer Primary Key,
	        name varchar(50),
	        birthday date,
	        email varchar(100)
        ); 
```

2. Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim

```SQL
        insert into employee (id, name, birthday, email) values (1, 'Hannah', '1991-02-26', 'hfeasby0@devhub.com');
        insert into employee (id, name, birthday, email) values (2, 'Cristi', '1994-07-02', 'cblackall1@moonfruit.com');
        insert into employee (id, name, birthday, email) values (3, 'Niki', '1991-02-04', 'ntrineman2@ucoz.com');
        insert into employee (id, name, birthday, email) values (4, 'Byran', '1995-03-24', null);
        insert into employee (id, name, birthday, email) values (5, 'Sallie', '1993-12-11', 'sprobate4@chron.com');
        insert into employee (id, name, birthday, email) values (6, 'Sadye', '1993-10-25', 'sblacklawe5@nbcnews.com');
        insert into employee (id, name, birthday, email) values (7, 'Rafaelita', null, 'rbiggam6@fastcompany.com');
        insert into employee (id, name, birthday, email) values (8, 'Jordain', '1991-05-13', 'jlawty7@sun.com');
        insert into employee (id, name, birthday, email) values (9, 'Rubie', '1994-04-17', 'rpomfret8@fotki.com');
        insert into employee (id, name, birthday, email) values (10, 'Deeann', '1992-04-24', null);
        insert into employee (id, name, birthday, email) values (11, 'Nolly', '1990-08-26', null);
        insert into employee (id, name, birthday, email) values (12, 'Mariana', '1990-12-13', 'mboxb@wordpress.org');
        insert into employee (id, name, birthday, email) values (13, 'Joanne', '1993-06-09', 'jgarreltsc@webs.com');
        insert into employee (id, name, birthday, email) values (14, 'Jay', '1992-05-22', 'jocannond@godaddy.com');
        insert into employee (id, name, birthday, email) values (15, 'Selena', '1992-09-30', 'sfalle@ftc.gov');
        insert into employee (id, name, birthday, email) values (16, 'Fan', '1990-09-06', 'fnoenf@vinaora.com');
        insert into employee (id, name, birthday, email) values (17, 'Dehlia', '1992-03-03', 'dtuckwoodg@mail.ru');
        insert into employee (id, name, birthday, email) values (18, 'Rosabel', '1993-01-27', 'rrignoldesh@bizjournals.com');
        insert into employee (id, name, birthday, email) values (19, 'Francis', '1991-01-31', 'fgorgli@dropbox.com');
        insert into employee (id, name, birthday, email) values (20, 'Konstanze', '1995-04-17', 'kdykesj@studiopress.com');
        insert into employee (id, name, birthday, email) values (21, 'Arleen', '1994-01-09', 'ahayleyk@tripadvisor.com');
        insert into employee (id, name, birthday, email) values (22, 'Jaynell', '1991-01-29', 'jkeyesl@cargocollective.com');
        insert into employee (id, name, birthday, email) values (23, 'Selia', '1990-06-26', 'sregglarm@amazon.de');
        insert into employee (id, name, birthday, email) values (24, 'Alyssa', '1995-03-22', 'ablazewskin@washingtonpost.com');
        insert into employee (id, name, birthday, email) values (25, 'Gaspard', '1994-05-14', null);
        insert into employee (id, name, birthday, email) values (26, 'Emilio', '1992-01-23', null);
        insert into employee (id, name, birthday, email) values (27, 'Sabine', '1994-11-19', 'slobleyq@free.fr');
        insert into employee (id, name, birthday, email) values (28, 'Romola', '1994-06-25', 'rdeportr@japanpost.jp');
        insert into employee (id, name, birthday, email) values (29, 'Del', '1993-04-12', 'dtremolieress@engadget.com');
        insert into employee (id, name, birthday, email) values (30, 'Kalila', null, null);
        insert into employee (id, name, birthday, email) values (31, 'Donetta', '1994-12-23', null);
        insert into employee (id, name, birthday, email) values (32, 'Veriee', '1993-02-21', 'vcouttesv@biglobe.ne.jp');
        insert into employee (id, name, birthday, email) values (33, 'Dorice', '1991-05-15', null);
        insert into employee (id, name, birthday, email) values (34, 'Terence', '1993-10-14', null);
        insert into employee (id, name, birthday, email) values (35, 'Dedra', '1993-02-04', 'dfayersy@ed.gov');
        insert into employee (id, name, birthday, email) values (36, 'Bronson', '1990-09-26', 'bmelmethz@nifty.com');
        insert into employee (id, name, birthday, email) values (37, 'Lyon', '1990-07-25', null);
        insert into employee (id, name, birthday, email) values (38, 'Peyton', null, 'pmckirdy11@washington.edu');
        insert into employee (id, name, birthday, email) values (39, 'Berti', '1992-03-21', null);
        insert into employee (id, name, birthday, email) values (40, 'Ulrick', '1990-08-21', 'unealey13@kickstarter.com');
        insert into employee (id, name, birthday, email) values (41, 'Odey', '1993-07-05', null);
        insert into employee (id, name, birthday, email) values (42, 'Grange', '1990-05-31', 'gjamison15@foxnews.com');
        insert into employee (id, name, birthday, email) values (43, 'Kalina', null, 'kmance16@sourceforge.net');
        insert into employee (id, name, birthday, email) values (44, 'Ryon', '1994-02-14', 'rklimentov17@w3.org');
        insert into employee (id, name, birthday, email) values (45, 'Gregory', '1992-03-13', 'gbuckenhill18@usa.gov');
        insert into employee (id, name, birthday, email) values (46, 'Maure', '1991-07-02', 'mcoupe19@hao123.com');
        insert into employee (id, name, birthday, email) values (47, 'Kailey', '1990-12-25', 'kgittose1a@ycombinator.com');
        insert into employee (id, name, birthday, email) values (48, 'Merline', '1991-09-10', null);
        insert into employee (id, name, birthday, email) values (49, 'Inger', null, 'iagate1c@mayoclinic.com');
        insert into employee (id, name, birthday, email) values (50, 'Guido', '1990-06-03', 'gridley1d@ucoz.ru');
```

3. Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.

```SQL
        UPDATE employee SET name = 'guncelleme'
        WHERE id = 5
        RETURNING;

        UPDATE employee SET name = 'guncelleme'
        WHERE id = 7
        RETURNING;

        UPDATE employee SET name = 'guncelleme'
        WHERE id = 10
        RETURNING;

        UPDATE employee SET name = 'guncelleme'
        WHERE id = 21
        RETURNING;

        UPDATE employee SET name = 'guncelleme'
        WHERE id = 42
        RETURNING;
```

4. Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

```SQL
        DELETE FROM employee
        WHERE id = 5
        RETURNING * ; 

        DELETE FROM employee
        WHERE id = 6
        RETURNING * ;

        DELETE FROM employee
        WHERE id = 7
        RETURNING * ;

        DELETE FROM employee
        WHERE id = 8
        RETURNING * ;

        DELETE FROM employee
        WHERE id = 9
        RETURNING * ;

```

