package gun16;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        //girilen pozitif ir sayinin tam kare olup olmadigini bulunuz
        //tam kare ise true degilse false
        Scanner oku=new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int sayi= oku.nextInt();
        int sayac=1;
        int aranaSayi=0;

        while(sayac<sayi){
            if (sayac*sayac==sayi);
            {
                aranaSayi=sayac;
                break;
            }
            //sayac++;
        }



if (aranaSayi>0) System.out.println("true");
else System.out.println("false");
        System.out.println("aranaSayi = " + aranaSayi);

    }
}
