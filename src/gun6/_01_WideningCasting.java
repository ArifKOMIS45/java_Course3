package gun6;

public class _01_WideningCasting {
    public static void main(String[] args) {
        //byte--> short-->char-->int-->long-->float-->double:otamatik donusum

        int sayi=9;
        //int tipindeki 9 degeri dpuble turundeki alana atildi.
        // bu tip donusume genisletme yonunde oldugundan widening casting denir
        //diger adiyla herhangi bir extra islem yapmadiginiz icin otomatik donusum denir.

        double oran=3.2;
         oran=sayi;

        System.out.println("oran = " + oran);//oran=9 kayip olmadi


    }
}
