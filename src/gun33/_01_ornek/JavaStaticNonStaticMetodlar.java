package gun33._01_ornek;

public class JavaStaticNonStaticMetodlar {
    public static void main(String[] args) {
        // Benim bütün programlarımda kullanacağım tip dönüşümleri için metodlara ihtiyacım var.
        // mesala int to string , string to int, vs. vs.. bunları yapan bir sinif yazınız.
        // ve bunları mainClass de kullanarak gösteriniz.

        //1.yöntem : Javanın kendi metodlarıyla yapılan çevirme işlemleri
        int sayi = 345;
        String strRakam = String.valueOf(sayi);
        int intRakam = Integer.parseInt(strRakam);

        //2.yontem kendi sinifi yazayim getStrin(),getInt(),getDouble...
        Utulity util = new Utulity();//yeni utulity acmak gerekiyor
        strRakam = util.getString(sayi);
        intRakam = util.getInt(strRakam);

        //3.yontem..new deyip yeni bir dosya acmadan direk kullanabiliyoruz.
        strRakam = Utulity.getsString(sayi);
        intRakam = Utulity.getsInt(strRakam);

        System.out.println(strRakam);
        System.out.println(intRakam);
String k="8765";
int say=Utulity.getsInt(k);
        System.out.println(say);
int a=say*2;
        System.out.println(a);
    }
}
