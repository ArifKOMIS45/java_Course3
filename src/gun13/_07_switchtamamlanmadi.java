package gun13;

import java.util.Scanner;

public class _07_switchtamamlanmadi {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz=");
        int s1 = oku.nextInt();
        System.out.print("Ikinci sayisyi giriniz=");
        int s2 = oku.nextInt();

        System.out.println("Toplam T \n Cikarma C\n Carpma P \n Bolme B");
        Scanner okuStr = new Scanner(System.in);
        String islem = okuStr.next();// String tipinde okundu

        switch (islem) {//buranin tipi ne ise case dekilerde o olmali
            case "T": System.out.println("toplam = " + (s1 + s2));
            case "C": System.out.println("cikarma = " + (s1 - s2));
            case "P": System.out.println("(carpma = " + (s1 * s2));
            case "B": System.out.println("bolme = " + (s1 / s2)); }

            char islemChar = islem.charAt(0);//"T" demekT\n iki karakterdir pc de
            switch (islemChar) {//buranin tipi ne ise case dekilerde o olmali
            case 'T': System.out.println("toplam = " + (s1 + s2));
            case 'C': System.out.println("cikarma = " + (s1 - s2));
            case 'P': System.out.println("carpma  = " + (s1 * s2));
            case 'B': System.out.println("bolme   = " + (s1 / s2));    }

//        switch (islem) {//buranin tipi ne ise case dekilerde o olmali
//            case "Toplama": System.out.println("toplam = " + (s1 + s2));
//            case "Cikarma": System.out.println("cikarma = " + (s1 - s2));
//            case "cikarma": System.out.println("(carpma = " + (s1 * s2));
//            case "Bolme": System.out.println("bolme = " + (s1 / s2)); }

    }}

