package gun31._08_ornek;

import java.util.ArrayList;

// 1) create class student with fields: string name, int not
// 2) Daha sonra 3 tane öğrenci ve notu oluşturun. ve bu öğrencileri bir ArrayList e ekleyin.
// 3) Daha öğrenci bilgilerin yazdıran bir metod yazarak , Arraylist teki öğrenci bilgilerini döngü yazdırınız.
// 4) Daha sonra bütün öğrencilerin not ortalamasını bir metod aracılığı bularak mainClass de yazdırınız.
public class okul {
    public static void main(String[] args) {
        student ogrenci1=new student();
        ogrenci1.name="arif";
        ogrenci1.not=80;

        student ogrenci2=new student();
        ogrenci2.name="mehmet";
        ogrenci2.not=70;

        student ogrenci3=new student();
        ogrenci3.name="ali";
        ogrenci3.not=80;

        ArrayList<student> ogrenciler=new ArrayList<>();

        ogrenciler.add(ogrenci1);
        ogrenciler.add(ogrenci2);
        ogrenciler.add(ogrenci3);


        bilgiYazdir(ogrenciler);
        System.out.println("-----------------");

        System.out.println("Notlarin ortalamasi= "+ortalama(ogrenciler));
        


    }


    public static void bilgiYazdir(ArrayList<student> ogrenciler) {
        for (student ogr:ogrenciler) {
            System.out.println("ogrenci ve notu  :"+ ogr.name+ "-"+ogr.not); } }

    public static double ortalama(ArrayList<student> ogrenciler) {
        double toplam=0;
        for (student ogr:ogrenciler) {
        toplam+=ogr.not;  }

        return toplam/ogrenciler.size(); }

}
