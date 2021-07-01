package gun8;

public class _07StringequalsIgnoreCase {
    public static void main(String[] args) {
        //2 stringi buyuk kucuk harf olmadan karsilastirir
        //sonuc boolean dur

        String s1="Merhaba";
        String s2="merhaba";

        System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase(s2));
        System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase("Merhaba"));
    }
}
