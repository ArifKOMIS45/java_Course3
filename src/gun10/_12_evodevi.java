package gun10;

import java.util.Scanner;

public class _12_evodevi {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        //1
        System.out.print("bir sayi giriniz = "); int s1 = oku.nextInt();
        int birlerBasamagi = s1 % 10;
        System.out.println("birlerBasamagi = " + birlerBasamagi);
        //2
        System.out.print("bir sayi giriniz = ");
        int s2 = oku.nextInt();
        int onlarBasamagi = s2 % 100 / 10;
        System.out.println("onlarBasamagi = " + onlarBasamagi);
        //3
        System.out.print("bir sayi giriniz = ");
        int s3 = oku.nextInt();
        int yuzlerBasamagi = s3 % 1000 / 100;
        System.out.println("yuzlerBasamagi = " + yuzlerBasamagi);
        //4
        System.out.print("Vize notunu giriniz = ");
        double vize = oku.nextDouble();
        System.out.print("Final notunu giriniz = ");
        double Final = oku.nextDouble();
        double ort = (0.4 * vize + 0.6 * Final);
        System.out.println("ort = " + ort);
        //5
        String kelime = "I love java";
        System.out.println("Karakter Sayisi = " + kelime.length());
        //6
        String kelime1 = "Sprint planning";
        int uzunluk = kelime1.length();
        System.out.println("Toplam Karakter Sayisi = " + uzunluk);
        //7
        String kelime3 = "paper";
        System.out.println("paper-->" + kelime3.toUpperCase());
        //8
        String kelime4 = "OraNge";
        System.out.println("OraNge -->" + kelime4.toLowerCase());
        //9
        String kelime5 = "New Jersey**";
        System.out.println("New Jersey**-->" + kelime5.toUpperCase());
        //10
        String kelime6 = "apple";
        System.out.println("kelime6 = " + kelime6.contains("app"));
        //11
        String str = "orange";
        System.out.println("orange esit mi? = " + str.equals("apple"));
        //12
        String str1 = "apple";
        System.out.println("apple esit mi? " + str1.equalsIgnoreCase("Apple"));
        //13
        String str2 = "Florida";
        System.out.println("Florida icindeki o'nun indexi = " + str2.indexOf("o"));
        //14
        String str3 = "Thank you";
        System.out.println("Thank you icindeki y'nun indexi = " + str3.indexOf("y"));
        //15
        String str4 = "Mouse";
        System.out.println("str4.charAt(3) = " + str4.charAt(3));
        //16
        String a1 = "kararsiz";
        String a2 = "kararsiz";//(str1.equals(str2)) olabiliyormus
        if (a1 == a2) {System.out.println("String a1 is equal to String a2 "); }
        if (a1 != a2) {System.out.println("String a1 is not equal to String a2 "); }
        //17
        String a3 = "I love coding";
        System.out.println("o harfinin A ile degisimi=" + a3.replace("o", "A"));
        //18
        String a4 = "code start here";
        System.out.println("a nin konumu= " + a4.indexOf("a"));
        //19
        int c = 120;
        int d = 158;
        System.out.println("Sayilar esit mi? " + (c > d));
        //20
        double z = 14.23;
        double z1 = 19.52;
        System.out.println("Sayilar esit Degiller mi?" + (z != z1));

    }

}
