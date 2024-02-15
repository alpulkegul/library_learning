`1.` Sort the data in the *title* and *description* columns in the movie table.

```SQL
SELECT title, description FROM film;
```


`2.` Sort the data in all columns in the *film* table with the condition that the film length is greater than 60 *AND* less than 75.

```SQL
SELECT * FROM film
WHERE length > 60 AND length < 75;
```

`3.` Sort the data in all columns in the *film* table with the conditions rental_rate 0.99 *AND* replacement_cost 12.99 *OR* 28.99.

```SQL
SELECT * FROM film 
WHERE rental_rate = 0.99 AND (replacement_cost = 12.99 OR replacement_cost = 28.99);
```

`4.` What is the value in the last_name column of the *customer* whose value in the first_name column in the customer table is 'Mary'?

```SQL
SELECT * FROM customer 
WHERE first_name = 'Mary'; 
--last_name is Smith.
```

`5.` Sort the data in the *film* table that does *NOT* have a length greater than 50 and does *NOT* have a rental_rate of 2.99 or 4.99.

```SQL
SELECT * FROM film 
WHERE NOT length > 50 AND NOT (rental_rate = 2.99 OR rental_rate = 4.99);

--OR--

--WHERE length <= 50 AND (rental_rate != 2.99 AND rental_rate != 4.99);
```