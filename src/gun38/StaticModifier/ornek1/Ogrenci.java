package gun38.StaticModifier.ornek1;

public class Ogrenci {
    String ad;
    String soyad;
    static String okulAd;


    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        okulAd = "Yildirim Lisesi";
    }

    @Override
    public String toString() {
        return "Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", okulAd='" + okulAd + '\'' +
                '}';
    }
}
