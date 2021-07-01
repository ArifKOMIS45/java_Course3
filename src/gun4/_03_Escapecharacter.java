package gun4;

public class _03_Escapecharacter {
    public static void main(String[] args) {
        //  \n yeni satir acar
        //  \t tab tusuna basilmis gibi etki yapar
        //  \b Backspace ye basilmis gibi bir karakter geri siler
        //  \" cift tirnak koyar
        //  \\ koyarsaniz\ isareti koyar
        // \r satir basina kadar ki karakterleri siler gider

        System.out.println("Merhaba Dunya");
        System.out.println("Merhaba \n Dunya");
        System.out.println("Merhaba\t Dunya"); // Merhaba	 Dunya
        System.out.println("Merhaba\bDunya"); // bir a harfini sildi backspace tusuna basilmis gibi MerhabDunya
        System.out.println("Merhaba\"Dunya"); // basina \ konulan ozel karakyter direk yazdirabiir Merhaba"Dunya
        System.out.println("Merhaba\\ Dunya"); // Merhaba\ Dunya
        System.out.println("Merhaba\r Dunya"); // satir basina kadar olan karakterleri sildi     Dunya
        System.out.println("Merhaba \"Dunya\" " ); // Merhaba "Dunya"

    // dongu ve karar verme ve islemler

       // System.out.println("sonuc");

    }// dur

}
