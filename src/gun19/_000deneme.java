package gun19;

import java.util.Arrays;

public class _000deneme {
    public static void main(String[] args) {



        int [] arr = new int[10];

        for (int i = 0; i <arr.length ; i++) {


            arr[i]=(int) (Math.random()*100);
        }

        System.out.println(Arrays.toString(arr));
        int toplam=0;
        int ort=0;

        for (int i = 0; i <arr.length ; i++) {

            toplam+=arr[i];

        }

        ort=toplam/arr.length;

        System.out.println(toplam);
        System.out.println(ort);




    }



}
