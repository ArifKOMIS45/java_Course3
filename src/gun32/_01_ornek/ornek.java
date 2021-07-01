package gun32._01_ornek;

public class ornek {
// 1.Adım  :Person isimli bir class yazınız:fields: name, surname, age; olsun.
    // 2.Adım  :mainClass de 2 tane bu sınıftan nesne oluşturup değer atayınız.
    // 3.Adım  :getBirthYear isminde Person a ait bir metod yazınız, çalıştığında kişinin doğum yılını versin.
    // 4.Adım  :getInitials isminde kişiniz adının ilk harfi.soyadının ilk harfi şeklinde (Büyük harf) veren
    //          metodu yazınız. örnek ahmet demir : A.D.

    public static void main(String[] args) {
        person bir = new person();
        bir.name = "arif";
        bir.surname = "kOmis";
        bir.age = 45;

        person iki = new person();
        iki.name = "beyza";
        iki.surname = "Rason";
        iki.age = 15;
//
//        //1.yontem
//        System.out.println("Bir Adi = " + bir.name);
//        System.out.println("Bir Soyadi = " + bir.surname);
//        System.out.println("Bir  yas= " + bir.age);
//
//        //2.yontem
//        BilgiYazdir(bir);
//        BilgiYazdir(iki);

        //3.yontem
        bir.BilgiYazdir();
        iki.BilgiYazdir();
        System.out.println("-----------------");
        bir.getBirthYear();
        iki.getBirthYear();
        System.out.println("-----------------");
        bir.getInitials();
        iki.getInitials();
    }

//    public static void BilgiYazdir(Calisan kisi) {//bunu Calisan class'in icine koyup 3. yontemi uygulariz
//        System.out.println("Adi = " + kisi.name);
//        System.out.println("Soyadi = " + kisi.surname);
//        System.out.println("yasi = " + kisi.age); }
//
//    public static void getBirthYear(Calisan a) {
//        int yil = 2021 - a.age;
//        System.out.println(yil); }


}

