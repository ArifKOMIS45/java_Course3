package gun28;

import java.util.Arrays;
import java.util.HashSet;

public class _04_Soru {
    public static void main(String[] args) {
        // Soru 1 : bir metod oluşturup bir HashSet i
        // verilen bu numaralar ile doldurunuz [1, 2, 3, 4, 5, 5, 5, 6, 7, 8]
        // bu işlemi generateSet() metodunda yapınız.mainden yazdırınız.
        HashSet<Integer> b = generateSet();
        System.out.println("b = " + b);//b = [1, 2, 3, 4, 5, 6, 7, 8]
        HashSet<Integer> k=new HashSet<>();
        AddElemenets( k,1,2,7,8,9,10,11);
        System.out.println("k = " + k);



    }// Dizi tipindeki dizi, arraylist, set ler i fonktsiyona gönderdiğinizde
    // fonksiyona kendisi gittiği için yapılan değişiklikler kendisinde yapıldığı için
    // bu değişkenleri RETURN etmenize gerek yoktur.
    private static void AddElemenets(HashSet<Integer> hs, Integer...sayilar) {
//1.yontem
       hs.addAll(Arrays.asList(sayilar));
//2 yontem
        for (int i = 0; i < sayilar.length ; i++) {
        hs.add(sayilar[i]);
        }
    }


    private static HashSet<Integer> generateSet() {

       Integer[] dizi={1, 2, 3, 4, 5, 5, 5, 6, 7, 8};
        HashSet<Integer> a=new HashSet<>(Arrays.asList(dizi));
       return a;
    }
}
