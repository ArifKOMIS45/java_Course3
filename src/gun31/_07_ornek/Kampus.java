package gun31._07_ornek;

public class Kampus {
    public static void main(String[] args) {
        //Okul ve Student siniflari olan bir yapi tasarlayin.

        ogrenci ogrenci1 = new ogrenci();
        ogrenci1.numara = 1;
        ogrenci1.Ad = "Mesut";
        ogrenci1.Soyad = "Demir";


        ogrenci ogrenci2 = new ogrenci();
        ogrenci2.numara = 2;
        ogrenci2.Ad = "Gulcan";
        ogrenci2.Soyad = "Bayrak";


        okul okul1 = new okul();
        okul1.adi = "Cumhuriyet";
        okul1.adres = "Merkez mah.";
        okul1.mudur = "Ragib";
        okul1.ucret = 20000;

        ogrenci1.okulu = okul1;
        System.out.println(ogrenci1.Ad);
        System.out.println(ogrenci1.Soyad);
        System.out.println(ogrenci1.numara);
        System.out.println("-----------------");

        System.out.println("Okulun Adi=" + ogrenci1.okulu.adi);
        System.out.println("Okulunun muduru" + ogrenci1.okulu.mudur);

        ogrenci2.okulu = new okul();
        ogrenci2.okulu.mudur = "Hilal";
        ogrenci2.okulu.ucret = 30000;


    }

}
