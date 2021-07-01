package gun8;

import java.util.Scanner;

public class __EvOdevi {
    public static void main(String[] args) {
        //1
        String Lcity = "KualaLumpur";
        String Bcity = "Manisa";
        System.out.println("Compared Cities= " + Lcity.equals(Bcity));
        //2
        String a = "INLINE CODE";
        String b = "inline CODE";
        System.out.println("esitMi? = " + a.equals(b));
        //3
        String c = "INLINE CODE";
        String d = "inline CODE";
        System.out.println("EsitMI? = " + c.equalsIgnoreCase(d));
        //4
        Scanner oku = new Scanner(System.in);
        System.out.print("Ad ve soyadinizi giriniz:");
        String ad = oku.nextLine();
        int boslukindex = ad.indexOf(" ");
        System.out.println("ilkIsim = " + ad.substring(0, boslukindex));
        System.out.println("ikinciIsim = " + ad.substring(boslukindex++));
        //5
        System.out.print("Tam isim giriniz :");
        String str = oku.nextLine();
        int ilkbosindex = str.indexOf(" ");
        int ikincibos = str.lastIndexOf(" ");
        System.out.println("ilkIsim = " + str.substring(0, ilkbosindex));
        System.out.println("ikinciIsim = " + str.substring(ilkbosindex, ikincibos));
        System.out.println("ikinciIsim = " + str.substring(ikincibos++));
        //6
        System.out.println("Adresinizi yaziniz:");
        String str1 = oku.nextLine();
        System.out.println("str1.isBlank() = " + str1.contains(" "));
        //7
        System.out.println("isminizi tam yaziniz:");
        String str2 = oku.nextLine();
        int ibosindex = str2.indexOf(" ");
        int ikibos = str2.lastIndexOf(" ");
        System.out.println("bas harfler = " + str2.charAt(0) + "." + str2.charAt(ibosindex + 1) + "." + str2.charAt(ikibos + 1) + ".");
    }
}
