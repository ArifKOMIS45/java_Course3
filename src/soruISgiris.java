import java.util.Scanner;

public class soruISgiris {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi giriniz= ");
        int sayi = oku.nextInt();
        int a = sayi;

        int sayac = sayi;
        int toplam = 0;
        for (int i = 0; i < 10; i++) {
            toplam += sayi % 10;
            sayi = sayi / 10;
        }

        for (int i = a + 1; i > sayi; i++) {
            int j = i;
            int rakam = 0;
            do {
                rakam += j % 10;
                j = j / 10;
            } while (j != 0);
            sayac++;
            if (rakam == toplam) break;
        }

        System.out.println("rakam = " + sayac);


    }


}
