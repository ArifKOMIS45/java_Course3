package gun22;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
        tekmiCiftMi(3);
        tekmiCiftMi(4);
        tekmiCiftMi(8);
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi giriniz=");
        int sayi = oku.nextInt();
        tekmiCiftMi(sayi);
        topla(3, 4);




    }
    public static void tekmiCiftMi(int sayi) { if (sayi % 2 == 1) System.out.println("tek");
        else System.out.println("cift"); }

    public static void topla(int s1, int s2) { System.out.println("toplam=" + (s1 + s2)); }

}
