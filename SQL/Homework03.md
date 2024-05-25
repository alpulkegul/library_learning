Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.


1. Country tablosunda bulunan country sütunundaki ülke isimlerinden 'A' karakteri ile başlayıp 'a' karakteri ile sonlananları sıralayınız.

```SQL
        SELECT country
        FROM country
        WHERE ~~ 'A%a'
```

2. Country tablosunda bulunan country sütunundaki ülke isimlerinden en az 6 karakterden oluşan ve sonu 'n' karakteri ile sonlananları sıralayınız.

```SQL
        SELECT country
        FROM country
        WHERE ~~ '_____%n'
```

3. Film tablosunda bulunan title sütunundaki film isimlerinden en az 4 adet büyük ya da küçük harf farketmesizin 'T' karakteri içeren film isimlerini sıralayınız.

```SQL
        SELECT title
        FROM film
        WHERE title ~~* '%t%t%t%t' OR title ~~* 't%t%t%t%'
```

4. Film tablosunda bulunan tüm sütunlardaki verilerden title 'C' karakteri ile başlayan ve uzunluğu (length) 90 dan büyük olan ve rental_rate 2.99 olan verileri sıralayınız.

```SQL
        SELECT *
        FROM film
        WHERE title ~~ 'C%' AND title length > 90 AND rental_rate = 2.99
```