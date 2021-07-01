package gun9;

public class _03_StringToLowerCase {
    public static void main(String[] args) {
        //ToLowerCase : Stringi kucuk harfe cevirir
        String text="Merhaba Dunya";
        System.out.println("orjinal hali = " + text);
        System.out.println("kucuk harf hali = " + text.toLowerCase());
        System.out.println("text in buyuk veya kucuk harf de olsa ME ile mi basliyor = " +
                text.toLowerCase().startsWith("me"));




    }
}
