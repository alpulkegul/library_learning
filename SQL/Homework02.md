Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.


1. Film tablosunda bulunan title ve description sütunlarındaki verileri sıralayınız.

```SQL
        SELECT title, description 
        FROM film
```

2. Film tablosunda bulunan tüm sütunlardaki verileri film uzunluğu (length) 60 dan büyük ve 75 ten küçük olma koşullarıyla sıralayınız.

```SQL
        SELECT * 
        FROM film
        WHERE length > 60 AND length < 75
```

3. Film tablosunda bulunan tüm sütunlardaki verileri rental_rate 0.99 ve replacement_cost 12.99 veya 28.99 olma koşullarıyla sıralayınız.

```SQL
        SELECT *
        FROM film
        WHERE rental_rate = 0.99 AND (replacement_cost = 12.99 OR replacement_cost = 28.99)
```


