package gun33.odevEv;

import java.util.ArrayList;

public class anaekran {
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
        Lesson mat101 = new Lesson();
        mat101.name = "Matematik";
        mat101.credit = 3;

        Lesson fiz101 = new Lesson();
        fiz101.name = "fizik";
        fiz101.credit = 4;

        Lesson java101 = new Lesson();
        java101.name = "java";
        java101.credit = 6;

        student ogrenci = new student();
        ogrenci.name = "Arif";
        ogrenci.maxCredit = 10;
        ogrenci.dersListesi = new ArrayList<>();

//
//        if (ogrenci.toplamKredisi()+ mat101.credit <= ogrenci.maxCredit) {
//            ogrenci.dersListesi.add(mat101);
//        }
//        else {System.out.println("Kredi miktarini astiniz");}
//
//        if (ogrenci.toplamKredisi()+ java101.credit <= ogrenci.maxCredit) {
//            ogrenci.dersListesi.add(java101);
//        }
//        else {System.out.println("Kredi miktarini astiniz");}
//
//        if (ogrenci.toplamKredisi()+ fiz101.credit <= ogrenci.maxCredit) {
//            ogrenci.dersListesi.add(fiz101);
//        }
//        else {System.out.println("Kredi miktarini astiniz");}
//

        ogrenci.dersEkle(mat101);
        ogrenci.dersEkle(java101);
        ogrenci.dersEkle(fiz101);


    }
//ders ekle diye bir metod yaz

}
