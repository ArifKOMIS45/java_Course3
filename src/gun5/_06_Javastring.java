package gun5;

public class _06_Javastring {
    public static void main(String[] args) {
        String ad = "arif";
        String soyad = "komis";

        System.out.println(ad);// arif
        System.out.println(soyad);//komis
//cift tirnak arasina yazilmayan hersey degisken olarak kabul edilir
        String fullname = ad + soyad;
        System.out.println("fullname = " + fullname);//fullname = arifkomis

        fullname = ad + " " + soyad;
        System.out.println("fullname = " + fullname);//fullname = arif komis

        int yas = 45;
        int kilo = 105;
        String bilgi = ad + " " + soyad + " " + yas + " " + kilo;
        System.out.println("bilgi = " + bilgi);//bilgi = arif komis 45 105

        bilgi = ad + " " + soyad + "  yas=" + yas +  "  kilo=" + kilo;
        System.out.println("bilgi = " + bilgi);//bilgi = arif komis  yas=45  kilo=105
    }

}
