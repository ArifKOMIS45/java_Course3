package gun11;

import java.util.Scanner;

public class _02_Ifelse {
    public static void main(String[] args) {
        // Ben buraya neden geldim ?
        // Girilen vize(%40) ve final(%60) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in) ;
        System.out.print("Vize Notunu Giriniz=");  double vizenot= oku.nextDouble();
        System.out.print("Final notunu Giriniz="); double Final= oku.nextDouble();

        double ort= vizenot*0.4 + Final*0.6;// eger sonucu double istiyorsak double esitlemeliyiz
        //eger int istiyorsakinte esitlemliyiz
        int ortint= (int)(vizenot*0.4) + (int)(Final*0.6);
        System.out.println("Ortalamaniz = " + ort);
        System.out.println("Ortalamaniz = "+ ortint);
        if (ort>=60){System.out.println("Gectiniz,tebrikler");}
        else { System.out.println("Kaldiniz!!!"); }

    }


}
