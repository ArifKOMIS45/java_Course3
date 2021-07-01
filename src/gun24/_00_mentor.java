package gun24;

import java.util.Arrays;

public class _00_mentor {
    public static void main(String[] args) {
 /*
İnt array oluşturunuz ve eleman sayısı 5 olsun.
Elemanlar random atansın. (10 a kadar - 10 dahil)

Array'i yazdırınız.     array = [......]

Daha sonra Array'daki maximum değeri bulunuz ve yazdırınız.

ÖRN:
array[2,5,9,6,3]

maximum değer =9
 */
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(arr));
        //1. yontem
        Arrays.sort(arr);
        System.out.println("Max deger= " + arr[arr.length - 1]);

        //2.yontem
        int max = 0;
        for (int j : arr) {
            if (j > max) max = j;
        }
        System.out.println("Max deger= " + max);

    }
}
