package gun6;

public class _06_sayiKelime {

    public static void main(String[] args) {
String girilenKelime="65";
int girilenSayi=65;
// kelimenin---> sayiya cevrilmesi
        int girilenKelimeninSayiHali= Integer.parseInt(girilenKelime);
        short shorDeger= Short.parseShort(girilenKelime);
        double oran= Double.parseDouble(girilenKelime);

        // sayinin kelimeye cevrilmesi

        String girilenSayininKelimeHali= Integer.toString(girilenSayi);
        String kelimeOran= Double.toString(oran);


    }
}
