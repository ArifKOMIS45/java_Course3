package gun29;

import java.util.ArrayList;
/*
Int arrayList oluşturun. 10 elemandan oluşmalı.
Random ekle isminde void bir method oluşturun ve parametresi int ArrayList olsun.

//todo Methodun içinde,
bu method, Arraylistin içine 0'dan 20 ye kadar random değer atasın.
Eğer çift sayı atarsa, o elemanın yerine 111 yazsın.
Eğer çift sayı yoksa "Çift sayı yoktur " mesajını versin.



Konsol örnegi:
İlk hali = [14, 19, 14, 2, 1, 20, 9, 9, 19, 19]
Çift sayılar yerine 111 =   [111, 19, 111, 111, 1, 111, 9, 9, 19, 19]

     */



public class _0001mentorcuma {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
randomEkle(arrayList);
    }

    public static void randomEkle(ArrayList<Integer> arr) {
        int count=0;
        for (int i = 0; i <10 ; i++) {
            arr.add((int)(Math.random()*20+1));
            if (arr.get(i)%2==0){arr.set(i,111);
                count++;}
           }System.out.println("cift sayilar 111 atandiktan sonra"+arr);

        if (count==0) System.out.println("cift sayi yoktur...."); }
}
