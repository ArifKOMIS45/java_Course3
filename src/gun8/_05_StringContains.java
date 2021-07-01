package gun8;

public class _05_StringContains {
    public static void main(String[] args) {
        //contains bir stringin icerisinde karakter var olup olmadigini kontrol eder
        //var ise boolean cinsinden true dondurur, yoksa false olur sonuc
        String str="Merhaba Dunya";

        boolean varMi=str.contains("a");
        System.out.println("varMi = " + varMi);//true

        System.out.println("varMi(aba) = " + str.contains("aba"));
        System.out.println("varMi(f) = " + str.contains("f"));
        System.out.println("varMi(ya) = " + str.contains("ya"));
        System.out.println("varMi(A) = " + str.contains("A"));


    }
}
