package gun9;

public class _04_StringToUpperCase {
    public static void main(String[] args) {
        //ToUpperCase: string buyuk harfe cevirir.
        String text="Merhaba Dunya";
        System.out.println("orjinal hali = " + text); //Merhaba Dunya
        System.out.println("text in buyuk harf hali = " + text.toUpperCase());//MERHABA DUNYA
        System.out.println("text cevirip kontrol etme = " +
                text.toUpperCase().endsWith("YA"));//true








    }
}
