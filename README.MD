PERTANYAAN PERCOBAAN 1
1. ARRAY tidak harus diisi secara berurutan, karena array adalah struktur data yang mendukung akses acak ini berarti pengisian array tidak harus berurutan dan bisa acak
2.


3. 

```
        penonton[0][0] = "amin";
        penonton[0][1] = "bena";
        penonton[1][0] = "candhra";
        penonton[1][1] = "dela";
        penonton[2][0] = "eka";
        penonton[2][1] = "farhan";
        penonton[3][0] = "gisel";
        penonton[3][1] = "hana";

```

4. fungsi dari ```penonton.lenght``` adalah untuk menghitung banyaknya baris pada array sedangkan ```panjang[0].lenght``` untuk mengitung banyaknya kolom pada baris ke [n].

````
    System.out.println(penonton[0].length);
    System.out.println(penonton[1].length);
    System.out.println(penonton[2].length);
    System.out.println(penonton[3].length);
    System.out.println(penonton.length);

````
penonton[0-3].lenght memiliki nilai yang sama karena memiliki nilai kolom yang sama, sedangkan ```penonton.lenght``` mengitung jumlah baris pada array

5.
```
 for(int i=0; i<penonton.length; i++){
        System.out.println("panjang baris ke "+(i+1)+" adalah "+penonton[i].length);
    }
```

6.
``` 
        for (String[] baris_penonton : penonton){
        System.out.println("panjang baris adalah "+baris_penonton.length );
    } 
```
7
```

    for(int i=0 ; i<penonton[2].length; i++){
        System.out.println("penonnton pada baris ke 3 adlah "+penonton[2][i]);
    }
```
8.
```
for(String nama : penonton[2]){
        System.out.println(nama);
    }
```
9. 
```
  for(int i=0 ; i<penonton.length; i++){
        System.out.println("penonton pada baris ke "+(i+1)+": "+String.join(", ", penonton[i]) );
    }
```
10.kelebihan dari foreach loop adalah sintaksnya yang lebih simpel dan mudah dibaca , dan kekuranganya adalah foreach loop tidak fleksibel karena foreach loop berjalan berurutan dari index 0, sehingga tidak bisa mengakses idex array tertentu

11. 3
12. 1
13. fungsi dari ```String.join``` adalah untuk menggabungkan beberpa elemen array menjadi satu 

PERTANYAAN PERCOBAAN 2
1 tidak, pengisian elemen array tidak harus diisikan urut sesuai dengan indeks array 

PERTANYAAN PERCOBAAN KE 3

1.
```
 for (int i=0 ; i<numbers.length; i++){
            System.out.println(Arrays.toString(numbers[i]));
        }
```

2. fungsi dari sintaks ```Arrays.toString(numbers[i]``` adalah untuk mengubah array menjadi String(teks) yang mudah dibaca 

3.  nilai default untuk tipe data int adalah 0
4. tidak bisa. setelah diinstaansisi jumlah array tidak bisa diubah kecuali dengan mengubah nilai instansiasinya 


