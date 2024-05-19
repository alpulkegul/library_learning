Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.


1. Film tablosunda bulunan rental_rate sütunundaki değerlerin ortalaması nedir?

```SQL
      SELECT ROUND ((AVG(rental_rate)),2)
      FROM film  

      -- Değerlerin ortalaması: 2.98
```

2. Film tablosunda bulunan filmlerden kaç tanesi 'C' karakteri ile başlar?

```SQL
        SELECT COUNT (title)
        FROM film
        WHERE title LIKE 'C%'

        -- 92 tanesi 'C' karakteri ile başlar.
```

3. Film tablosunda bulunan filmlerden rental_rate değeri 0.99 a eşit olan en uzun (length) film kaç dakikadır?

```SQL
        SELECT MAX(length)
        FROM film
        WHERE rental_rate = 0.99

        -- Uygun şartları sağlayan film 184 dakikadır.
```

4. Film tablosunda bulunan filmlerin uzunluğu 150 dakikadan büyük olanlarına ait kaç farklı replacement_cost değeri vardır?

```SQL
        SELECT COUNT(DISTINCT replacement_cost)
        FROM film
        WHERE length > 150

        -- Uygun şartları sağlayan 21 farklı replacement_cost değeri vardır.
```

