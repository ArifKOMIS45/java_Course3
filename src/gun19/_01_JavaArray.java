package gun19;

import java.util.Scanner;

public class _01_JavaArray {
    public static void main(String[] args) {
// kullanicinin girdigi bir cumlede kac kelime oldugunu bulunuz

        Scanner read=new Scanner(System.in);
        System.out.print("Bir cumle giriniz:");
        String cumle= read.nextLine();

       int kelime=1;
        for (int i=0;i<cumle.length();i++){
            if(cumle.charAt(i)==' ') kelime++;
        }
        System.out.println("kelime sayisi = " + kelime);

    }

}
