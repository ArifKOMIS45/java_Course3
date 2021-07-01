package gun8;

public class _02_StringCharAt {
    public static void main(String[] args) {
        //istenen noktadaki karakteri verir.
        //Karakterlerin sirasi 0(sifirdan) baslar buna index denir
          //0123456789012....
        String kelime="Merhaba Dunya";
        System.out.println("3.Harf = " + kelime.charAt(2));

        char ilkHarf=kelime.charAt(0);
        System.out.println("ilkHarf = " + ilkHarf);

    }
}
