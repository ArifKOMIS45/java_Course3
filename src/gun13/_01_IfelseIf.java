package gun13;

import java.util.Scanner;

public class _01_IfelseIf {
    public static void main(String[] args) {
        //bir otopark icin ucret programi yapin
        //2 saate kadar 5 euro,5 saate kadar 10 sonrasi 15 euro
        Scanner oku = new Scanner(System.in);
        System.out.println("Saat Giriniz=");
        int saat = oku.nextInt();

        if (saat <= 2) System.out.println("2 Euro");
        else if (saat <= 5) System.out.println("10 Euro");
        else System.out.println("15 Euro");
        //ternary method

        String ucret = saat <= 2 ? "5 euro" : saat <= 5 ? "10Euro" : "15 Euro";
        //String ucret = saat <= 2 ? "5 euro" : (saat <= 5 ? "10Euro" : "15 Euro)"; olabilir parantezsiz
        System.out.println("ucret = " + ucret);

    }
}
