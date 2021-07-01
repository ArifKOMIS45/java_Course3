package gun6;

public class _02_NarrowingCasting {
    public static void main(String[] args) {
        double oran=3.2;//double tipindeki 3.2 degeri int tipine atildi
        int sayi=5;// bu tip donusumlere daraltma yonunde oldugu icin narrowing castiing denir
        sayi=(int)oran;//diger adiyla extra islem yapildiginda manuel donusum denir
        System.out.println("sayi = " + sayi); //sayi=3 veri kaybi oldu




    }
}
