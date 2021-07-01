package gun13;

import java.util.Scanner;

public class _09_switch {
    public static void main(String[] args) {
        // Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir ay numarasi giriniz="); String ayNo= oku.nextLine();

        switch (ayNo.toLowerCase()){
            case "ocak":
                System.out.println("31 gun");
                break;
            case "subat":
                System.out.println("28 gun");
                break;
            case "mart":
                System.out.println("31 gun");
                break;
            case "nisan":
                System.out.println("30 gun");
                break;
            case "mayis":
                System.out.println("31 gun");
                break;
            case "haziran":
                System.out.println("30gun");
                break;
            case "temmuz":
                System.out.println("31 gun");
                break;
            case "agustos":
                System.out.println("31 gun");
                break;
            case "eylul":
                System.out.println("30 gun");
                break;
            case "ekim":
                System.out.println("31 gun");
                break;
            case "kasim":
                System.out.println("30 gun");
                break;
            case "aralik":
                System.out.println("31 gun");
                break;
            default:
                System.out.println("Hatali giris");

        }

    }
}
