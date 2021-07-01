package gun5;

public class _03_Ornek1 {
    public static void main(String[] args) {//basla
        // Bir dikdortgenin kisa ve uzun kenati icin iki degisken tanimlayiniz
        //10 ve 15 degerlerini atayiniz. cevresini ve alanini yazdiriniz.
// ctrl+alt=L  reFormat
        int kisaKenar = 10; // algoritmadaki dikdortgen
        int uzunKenar = 15;// algoritmadaki dikdortgen
        int cevre = kisaKenar + kisaKenar + uzunKenar+ uzunKenar;// algoritmadaki dikdortgen
        int alan = kisaKenar * uzunKenar;// algoritmadaki dikdortgen

        System.out.println("cevre = " + cevre + "dir");//algoritmadaki yazdirma
        System.out.println("alan = " + alan +"dir");//algoritmadaki yazdirma

    }//Dur


}
