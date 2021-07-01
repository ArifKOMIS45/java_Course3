package gun27;

import java.util.Arrays;

public class _000_mentor {
    public static void main(String[] args) {
//todo  Double bir arrayli method oluşturunuz. Verilen Array'i hem düz hem de tersten yazdırınız.

        double[] fiyatlar = {1.95, 3.45, 5.6, 1.1};
        System.out.println("Array ciktisi");
        System.out.println(Arrays.toString(fiyatlar));
        arrayTers(fiyatlar);

        //todo Girilen iki ismin uzunluklarının aynı olup olmadığını kontrol eden
        // bir method oluşturunuz. Main'de yazdırınız

        System.out.print("isimler esit mi="+ isinKontrol("Ahmet","arif"));



    }

    public static void arrayTers(double[] a) {
        double[] b=new double[a.length];
        for (int i = a.length-1,j=0 ; i>=0 ; i--,j++) {
               b[j]=a[i]; }
        System.out.println(Arrays.toString(b)); }

    public static boolean isinKontrol(String a,String b) {
         return a.length()==b.length(); }



}


