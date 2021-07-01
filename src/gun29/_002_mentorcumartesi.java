package gun29;

public class _002_mentorcumartesi {
    public static void main(String[] args) {
/*
    Çalışan bilgilerini ekrana yazdıracak bir method oluşturun.

    Bilgiler :   isim    soyisim departman


   Her calısan bilgisinden sonra düz bir çizgi çeken bir method oluşturun
   örn: Ömer Özdemir QA
   -------------------------------------
   Ahmet Özdemir      Satış danışmanı


   bu methodları mainClass methodda çağırın ve değerleri "mainClass method" içerisinde verin.

   todo KONSOL ÖRNEGİ:
   ÇALIŞAN BİLGİLERİ
---------------------/////--------------------
İsim :   Ömer
Soyisim :   Özdemir
departman :   QA
---------------------/////--------------------
İsim :   Saniye
Soyisim :   Kılıç
departman :   SOFTWARE
---------------------/////--------------------
İsim :   Ahmet
Soyisim :   Dağ
departman :   Database
---------------------/////--------------------
     */
    baslik("Calisinlar");
    Bilgiler("arif","kokmis","teacher",44);
    duzcizgi();
    }

    public static void Bilgiler(String isim,String soyadi,String departman,int yas) {
        System.out.println("isim = " + isim);
        System.out.println("soyadi = " + soyadi);
        System.out.println("departman = " + departman);
        System.out.println("yas = " + yas); }

    public static void duzcizgi() {
        System.out.println("--------------//////---------------"); }

    public static void baslik(String a) {
        System.out.println(a);
    }


}
