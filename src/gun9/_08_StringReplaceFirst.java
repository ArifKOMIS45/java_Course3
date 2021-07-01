package gun9;

public class _08_StringReplaceFirst {
    public static void main(String[] args) {

        //Replacefirst: replace ile ayni sadece ilk bulunani degistirir
        String text="Merhaba Dunya";
        System.out.println("Orjinal Hali = " + text);
        System.out.println("butun a lar degsiti = " + text.replace("a","_"));
        //Merh_b_ Duny_
        System.out.println("ilk a degisti = " + text.replaceFirst("a","_"));
        //Merh_ba Dunya






    }
}
