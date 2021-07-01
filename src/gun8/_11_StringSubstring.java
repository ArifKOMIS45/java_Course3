package gun8;

public class _11_StringSubstring {
    public static void main(String[] args) {
        //Stringin belli bir bolumunu alma islemidir

        String s1="Merhaba arkadaslar";
        System.out.println("1.bolum rhab = " + s1.substring(2 ,6));//2 nolu ibdexten 6 ya kadar
        // 6 dahil degil..alt sinir dahil ust sinir dahil degil
        System.out.println("2.bolum arkadas = " + s1.substring(8 ,15));
        System.out.println("3.bolum arkadaslar = " + s1.substring(8 ));//verilen indexten sona kadar alir


    }
}
