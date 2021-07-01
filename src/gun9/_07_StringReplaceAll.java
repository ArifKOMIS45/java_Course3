package gun9;

public class _07_StringReplaceAll {
    public static void main(String[] args) {
        //replaceall: replace gibi caisir farki kriter(regex) verilebilir.
        //TODO: regex:a reguler expression./duzenli ifadeler/arastir


        String text="Merhaba Dunya";
        System.out.println("Orjinal Hali = " + text);
        System.out.println("a,b,c--> _cevirme:" +text.replaceAll("[abn]", "_"));//Merh___ Du_y_
        System.out.println("Butun buyuk harfler--> _cevirme:" +text.replaceAll("[A-Z]","_"));//_erhaba _unya
        // buyuk harfleri bulup degistir_



    }
}
