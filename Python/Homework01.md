1- Bir listeyi düzleştiren (flatten) fonksiyon yazın. Elemanları birden çok katmanlı listelerden ([[3],2] gibi) oluşabileceği gibi, non-scalar verilerden de oluşabilir. Örnek olarak:

input: `[[1,'a',['cat'],2],[[[3]],'dog'],4,5]`

output: `[1,'a','cat',2,3,'dog',4,5]`

```python
def duzlestir(liste):
	duz_liste = []
	for eleman in liste:
		if isinstance(eleman, list):
			duz_liste.extend(duzlestir(eleman))
		else:
			duz_liste.append(eleman)
	return duz_liste
	
giris_listesi = [[1,'a',['cat'],2],[[[3]],'dog'],4,5]
	
cikti_listesi = duzlestir(giris_listesi)
print(cikti_listesi)
```

2- Verilen listenin içindeki elemanları tersine döndüren bir fonksiyon yazın. Eğer listenin içindeki elemanlar da liste içeriyorsa onların elemanlarını da tersine döndürün. Örnek olarak:

input: `[[1, 2], [3, 4], [5, 6, 7]]`

output: `[[[7, 6, 5], [4, 3], [2, 1]]`

```python
def ters(liste):
	ters_list = []
	for i in liste:
		if isinstance(i, list):
			ters_list.append(ters(i)[::-1])
		else:
			ters_list.append(i)
	return ters_list[::-1]
	
	giris_list = [[1, 2], [3, 4], [5, 6, 7]]
	
	cikti_list = ters(giris_list)
	print(cikti_list)
```