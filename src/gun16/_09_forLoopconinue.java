package gun16;

import java.util.Scanner;

public class _09_forLoopconinue {
    public static void main(String[] args) {
// ritmik ilerleyen ve adim sayisi belli ise for kullanilir degilse while kullanilir eger
        //donguye bir kez mutlaka girilecekce do-while kullanilir
        Scanner oku = new Scanner(System.in);

        int toplam = 0;
        for (int i = 1; i <= 5; i++)// 5 kez sayi istiyor
        {
            System.out.print("sayi giriniz giriniz");
            int sayi = oku.nextInt();

            if (sayi > 5 && sayi < 10)//6,7,8,9 icin calisiyor
            {
                System.out.println("girdiginiz sayi 5 ile 10 arrasi oldugundan toplanmayacaktir");
                continue;
            }
            toplam = toplam + sayi;
        }
        System.out.println("toplam = " + toplam);


    }
}
