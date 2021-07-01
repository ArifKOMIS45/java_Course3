package gun39._03_Ornek;

import java.util.Scanner;

public class PizzaSiparisHatti {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int secim = 0;

        do {
            Pizza.Menu();
            System.out.print("Seciminiz =");
            secim = oku.nextInt();
            Pizza.islemYap(secim);

        } while (secim < 5);
    }


}
