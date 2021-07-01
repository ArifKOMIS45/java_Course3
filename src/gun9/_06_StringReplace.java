package gun9;

public class _06_StringReplace {
    public static void main(String[] args) {
        //repalce: bir stringin icerisindeki istenen karakterlerin hepsini
        //verilen yenisi ile degistirir

        String text="Merhaba Dunya";
        System.out.println("orjinal hali = " + text);
        System.out.println("a larin e olarak degismis hali = " + text.replace("a","e"));
        System.out.println("ba larin de olarak degismis hali = " + text.replace("ba","de"));
        System.out.println("Dunya --->Java = " + text.replace("Dunya","Java"));
        System.out.println("a lari silebilirsiniz = " + text.replace("a",""));




    }
}
