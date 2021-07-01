package gun38.StaticModifier.Ornek2;

public class School {
    public static void main(String[] args) {
        Student ogr1 = new Student("Ali", "Yilmaz");
        Student ogr2 = new Student("Ayse", "Demir");
        Student ogr3 = new Student("Fatma", "Bayrak");
//....
//....
//....
        Student ogr = new Student("Furkan", "Simsek");

        System.out.println("Sayac = " + Student.sayac);

        System.out.println(ogr1);
        System.out.println(ogr2);
        System.out.println(ogr3);
        System.out.println(ogr);

    }
    //static nasil kullanilir
    //class adi ile kullanilir
    //ne icin kullanilir
    //1-Nesne tanimlayip kullanmak yerine tanimlamadan kullanmak istediginiz degisken veya metodlar icin
    //2- Tekrarlayan nesnelereait verileri tek bir degiskende toplamak icin
    //3-Nesneler veya genel icn sayac olarak
    //4-3. Madde ile baglantili sekilde ID olarak
}
