package gun37.odev;

import java.util.Scanner;

public class Lamba {
    private static boolean acik;


    public static void LambaAc() {
        acik = true;
        System.out.println(acik);
    }

    public static void LambaKapat() {
        acik = false;
        System.out.println(acik);
    }

    public static void LambaCalistir() {
        int secim = 0;

        while (secim < 3) {
            Scanner oku = new Scanner(System.in);
            System.out.print("lambayi acmak icin 1,kapatmak icin 2 ve cikis icin 3 basiniz: ");
            secim = oku.nextInt();
            if (secim == 1 && !acik ) {
                LambaAc();

            } else if (secim == 1){System.out.println("Lamba zaten acik");

             }
            if (secim == 2 && acik) {
                LambaKapat();

            } else if (secim == 2){System.out.println("Lamba zaten Kapali");
            }


        }
    }
}