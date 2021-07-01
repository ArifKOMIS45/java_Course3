package gun19;


import java.util.Arrays;
import java.util.Scanner;

public class _04_JavaSplit {
    public static void main(String[] args) {
        //split(): bir stingi verilenkritere gore bolerek diziye atar
        //Kullanicidan alacaginizcumleyi kelimelere gore altalta yazdiriniz

        Scanner read = new Scanner(System.in);
        System.out.print("Bir cumle giriniz:");
        String cumle = read.nextLine();

        String[] kelimeler = cumle.split(" ");//bosluga gore cumleyi boler
        //1. yontem
        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);
        }
        //2. yontem
        System.out.println("Arrays.toString(kelimeler) = " + Arrays.toString(kelimeler));

        //3.yontem foreach
        for (String kelime : kelimeler)//cumleyi bolup kelime kelime gonderir
            System.out.println("kelime = " + kelime);


    }
}


