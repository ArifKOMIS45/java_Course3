package gun9;

public class _02_StringStartswith {
    public static void main(String[] args) {
        //startsWith :Bir string ile baslayip baslamadiginin sonucunu boolean olarakdoner
        String text="Merhaba Dunya";
        System.out.println("Me ile basliyor mu? = " + text.startsWith("Me"));//true
        System.out.println("ME ile basliyor mu? = " + text.startsWith("ME"));//false
        System.out.println("K ile basliyor mu? = " + text.startsWith("K"));//false
        System.out.println("M ile basliyor mu? = " + text.startsWith("M"));//true




    }
}
