package gun23;

import java.util.Arrays;
import java.util.Scanner;

public class _000_mentoringSoru {
    public static void main(String[] args) {
       /* todo Soru 1

        int array oluşturun.
 Sistem size "Kaç elemanlı bir Array oluşturmak istiyorsunuz ? (!!Tek sayı olmalı !! :  )  "
 şeklinde bir soru sorsun.

        Array'in kaç elemandan oluşacagına kullanıcı karar versin. (3,5,7)

        ve bu elemanları kullanıcıdan alın. (Scanner)     (1. sayıyı giriniz  ... .... )

        Array'in içindeki elemanları küçükten büyüğe sıralayın .(method kullanın)

        ve            'ortadaki'              elemanı bulması için bir program yazın. (Her ihtimali düşünmeniz gerekiyor. sadece 3 elemanlı bir array için değil, 33 elemanlı bir array için de çalışmalı).

        örn:  5 elemanlı bir array

                [ 1,2,6,7,8}
    ortanca sayı = 6

            */
        Scanner oku=new Scanner(System.in);
        System.out.print("Kac elemanli bir dizi olustirmak istiyorsunuz (Tek sayi olmali)");
            int[] a=new int[oku.nextInt()];

         for (int i = 0; i <a.length ; i++) {
             System.out.print((i+1)+".elemani giriniz");
             a[i]= oku.nextInt();

         }

    int ortancaSayi=(a.length-1)/2;
         Arrays.sort(a);

         System.out.print(Arrays.toString(a));


        for (int i = 0; i <a.length ; i++) {
            if (i==ortancaSayi){
                System.out.print("Ortanca sayı =  " + a[i]);
            }
        }


    }
}
