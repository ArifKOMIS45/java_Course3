package gun14;

import java.util.Scanner;

public class _0_ilgincterssayi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        System.out.print("Girdiğiniz sayinin tersten yazılısı = ");
        while(sayi > 0) {

            System.out.print(sayi % 10);
            sayi /= 10;
        }
    }
}
