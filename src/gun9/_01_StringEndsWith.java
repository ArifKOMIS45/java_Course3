package gun9;

public class _01_StringEndsWith {
    public static void main(String[] args) {
        //endswith:....ile bitiyor mu? sonuc boolean
        String text="Merhaba Dunya";
        System.out.println("ya ile bitiyor mu? = " + text.endsWith("ya"));
        System.out.println("a ile bitiyor mu? = " + text.endsWith("a"));
        System.out.println("A ile bitiyor mu? = " + text.endsWith("A"));
        System.out.println("ba ile bitiyor mu? = " + text.endsWith("ba"));

    }
}
