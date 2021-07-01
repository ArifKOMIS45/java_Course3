package gun24;

import java.util.Arrays;

public class _000_mentor {
    public static void main(String[] args) {
  /*

iki ayrı int array oluşturun. İkisinin de eleman sayısı  5 olsun.

Elemanlar random atansın. (15 e kadar - 15 dahil)


2 int array'i de ekrana yazdırınız.  (1.dizi =
                                                        2.dizi=        )



Eğer iki arrayda ortak elemanlar varsa o elemanları yazdırınız.
Yoksa, "ortak eleman yoktur" mesajını konsola yazdırınız.

ÖRNEK:
1.Dizi : [1,2,3,4,5]
2.Dizi : [4,5,6,7,8]

ortak eleman: 4     ortak eleman: 5

    // TODO: 1  İpucu :

           Ortak eleman ararken oluşturacağınız koşula int count ekleyin. (int count = 0;)
Eğer ortak eleman varsa count++.
Eğer ortak eleman yoksa, count==0 ise           "ortak eleman yoktur".

         */

        int[] a = new int[5];
        int[] b = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 16); }
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 16); }
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int count=0;
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j <a.length ; j++) {
                if (a[i]==b[j]) System.out.println("ortak eleman = " + a[i]);
                    count++;
            } if (count==0) System.out.println("ortak eleman yoktur");
        }




    }
}
