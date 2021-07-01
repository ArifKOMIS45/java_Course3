package gun23;

import java.util.Arrays;

public class _00_mentoring {
    public static void main(String[] args) {
        //todo                                                                            -           -           -        Arrays.toString() methodu -    -   -   -   -   -   -   -   -


        System.out.println("    \n ---  1. Arrays.toString()    Methodu    ----  \n");


        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));


        System.out.println("    \n ---  2. Arrays.fill()    Methodu    ----  \n");
        //todo                                                                      --     --                               Arrays.fill() method ---    ----            ---


//Array'deki tüm elemanlar, belirtilen eleman ile doldurulur..

        int[] liste = {1, 4, 7, 8, 9, 10};

        // System.out.println("listenin ilk hali :   " + Arrays.toString(liste));

        // Arrays.fill(liste,11);

        System.out.println("Listenin son hali :   " + Arrays.toString(liste));

        //Değiştirilecek değerin,  hangi aralıkta olduğunu belirleyebiliriz.


        Arrays.fill(liste, 2, 4, 11);//Hangi array?    ,    Hangi indexten başlasın,     nereye kadar gitsin    ,    ne ile değiştirilsin.

        System.out.println(Arrays.toString(liste));
        System.out.println("    \n ---  3. Arrays.sort()    Methodu    ----  \n");
        //todo       -- -   -       -   -   -   -   -   -   -   -   -   -                   Arrays.sort()   Methodu --          --              -           -           -   -   -   -   -   -

//Array'in elemanlarını küçükten büyüğe sıralamamızı sağlar..


        int[] b = {88, 77, 25, 66, 31, 22, 3};

        System.out.println("ilk hali :   " + Arrays.toString(b));
        //   Arrays.sort(b);

        //    System.out.println("Sıralı hali :   " + Arrays.toString(b));

//belirli bir aralığı küçükten büyüğe sıralamamızı sağlar..

        Arrays.sort(b, 0, 4); // 4 dahil değil..

        System.out.println("Belirli bir kısmı sıraya koydugumuzda:    " + Arrays.toString(b));


        String[] dizi = {"x", "q", "u", "a", "c", "b", "z"};

        System.out.println("Ilk hali :   " + Arrays.toString(dizi));
        Arrays.sort(dizi);
        System.out.println("Alfabetik :   " + Arrays.toString(dizi));
        System.out.println("    \n ---  4. Arrays.equals()    Methodu    ----  \n");
        //todo       -- -   -       -   -   -   -   -   -   -   -   -   -                   Arrays.equals()   Methodu --          --              -           -           -   -   -   -   -   -

        String[] x = {"Techno", "Study", "Avrupa"};
        String[] y = {"Study", "Avrupa", "Techno"};
        String[] z = {"Techno", "Study", "Avrupa"};

        System.out.println(Arrays.equals(x, y));//false
        System.out.println(Arrays.equals(x, z)); //true


        System.out.println("    \n ---  5. Arrays.binarySearch()    Methodu    ----  \n");
        //todo       -- -   -       -   -   -   -   -   -   -   -   -   -                   Arrays.binarySearch()   Methodu --          --              -           -           -   -   -   -   -   -
//Bu method, sadece Sıralı dizilerde çalışır. Eğer dizinizin elemanları sıralı değilse, önce sort methodu ile sıraya koyun, daha sonra binarySearch methodunu kullanın.


        int[] d = {22, 1, 37, 4, 5, -3, 7};

        int degisken = Arrays.binarySearch(d, 2);

        System.out.println("sıralamadan önce :   " + degisken);


        Arrays.sort(d);

        degisken = Arrays.binarySearch(d, 2);
        System.out.println(Arrays.toString(d));
        System.out.println("sıralamadan sonra :  " + degisken);


    }
}
