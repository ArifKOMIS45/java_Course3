package gun32._03_ornek;

public class _01_ornek3 {
    // 1.Adım  :ayrı dosyada olmak üzere Musteri isimli (fields: name) isimli bir class tanımlayınız.
    //2.Adım  :ayrı bir dosyada ElektrikHesabi isimli (fields : totalKw, rate(double), bill)
    //3.Adım  :Customer a bir ElektrikHesabi ekleyiniz.
    //4.Adım  :1 tane müşteri oluşturunuz, Hesabı u dahil;
    //5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
    //         tuketimEkle olasun her verilen aylık rakamı toplayarak biriktirsin.
    //6.Adım  :Ödenecek rakamı  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız yazdırınız.
    public static void main(String[] args) {
        Musteri Musteri = new Musteri();
        Musteri.name = "ahmet";

        ElektrikHesabi hesap = new ElektrikHesabi();
        Musteri.elektrikHesabi = hesap;

        Musteri.elektrikHesabi.tuketimEkle(100);
        Musteri.elektrikHesabi.tuketimEkle(150);

        System.out.println("tplam tuketim" + hesap.toplamTuketim);

        int fatura = (int) hesap.odenecekTutar();
        System.out.println("Odenecek miktar= " + Musteri.elektrikHesabi.odenecekTutar());
        System.out.println("Fatura kesimi= " + hesap.fatura);


    }

}
