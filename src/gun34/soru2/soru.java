package gun34.soru2;

import java.util.Scanner;

public class soru {
    // Bir bisiklet sınıfı yazınız . Properties(fields) : hiz, vites
    // metodlari : hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
    // vitesAzalt() -> 1 deger vites azaltıyor, hizGoster -> O andaki hızı gösteriyor
    // vites 5 den büyük ve 1 den küçük olamıyor
    public static void main(String[] args) {

        Bisiklet bisiklet= Bisiklet.bisikletOlustur();
        Scanner oku = new Scanner(System.in);
        int secim = 0;

        do {
            Bisiklet.menuYaz();
            secim = oku.nextInt();
            Bisiklet.islemYap(bisiklet,secim);


        } while (secim < 5);


    }



}
