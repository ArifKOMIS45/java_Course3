package gun34._01_soru;



public class universite {
    // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
    // 1- Ders sınınıfı ayrı dosyada : adı: Lesson , fields : name, credit (1-10 arasında değer alıyor)
    // 2- Öğrenci Sınıfı ayrı dosyada: adı: Student, fields : name, maxCredit, dersleri listesini
    // tutacak bir liste
    // 3- 3 adet ders oluşturunuz.
    // 4- 1 adet öğrenci tanımlayınız alabileceği maxCredi si 10 olsun.
    // 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
    //    ders eklerken max alabileceği Crediyi geçmemeli, geçerse
    //    uyarı versi, alabileceğiniz max credi doldu şeklinde.
    public static void main(String[] args) {
        Ders ders1 = Ders.dersOlustur("Java101",6);
        Ders ders2 =Ders.dersOlustur("Mat101",2);
        Ders ders3 = Ders.dersOlustur("Fiz101",4);


        Ogrenci ogr = Ogrenci.ogrenciOlustur("Arif",10);

        Ogrenci.dersEkle(ogr.dersleri,ders1,10 );
        Ogrenci.dersEkle(ogr.dersleri,ders2,10 );
        Ogrenci.dersEkle(ogr.dersleri,ders3,10 );

      Ogrenci.dersYazdir(ogr.dersleri);







    }













    }
