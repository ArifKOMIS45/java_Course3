package gun8;

public class _10_StringLastIndexOf {
    public static void main(String[] args) {
        // IndexOf ile ayni sekilde calisir sadece sondan itibaren
        //ilk buldugunun indexini verir
        String s1="Merhaba Dunya";
        System.out.println("Bastan a nin index i = " + s1.indexOf("a"));//4
        System.out.println("Sondan a nin index i = " + s1.lastIndexOf("a"));//12
        String s2="Good";
        System.out.println("Bastan o harfinin INDEX = " + s2.indexOf("o"));
        System.out.println("sondan o harfinin INDEX = " + s2.lastIndexOf("o"));








    }
}
