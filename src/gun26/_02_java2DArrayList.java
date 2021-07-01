package gun26;

public class _02_java2DArrayList {
    public static void main(String[] args) {

// 1.Ödev
        // En büyük ve en küçük elemanı bulunuz..bir onceki sayfada yap bunu

        // 2.Ödev
        // Recursive (ÖzYinelemeli Metodlar) konusu google dan ve youtube dan araştırılacak ve öğrenilecek.

        // 3.Ödev
        // `"aaabbccccdeeeff" seklinde verilen bir stringi yine string olarak "3a2b4c1d3e2f"
        //  seklinde yazdiran methodu yapiniz. parametre string
String a="aaabbccccdeeeff";
    dondur(a);


    }

    public static void dondur(String a) {
        String yeni="";
        for (int i = 0; i <a.length() ; i++) {
            int count=0;
          for (int j = 0; j <a.length() ; j++)
            {if (a.charAt(i)==a.charAt(j))
                    count++;}
          String arananHarf=String.valueOf(a.charAt(i));
          if (!yeni.contains(arananHarf))
            { yeni=yeni+count+ a.charAt(i); }
        } System.out.println(yeni); }
}