package Gun04;

public class _05_JavaDataTypes {
    public static void main(String[] args)
    { // Başla

        // Değişken tanımlama bölümü -> dikdortgen

        byte byteDeger=4;
        short shortDeger=3000;
        int intDeger=200000;
        long longDeger=2222222222222333L;
        // Default olarak rakamları int gördüğünden L ekleyerek long olduğunu söyledik.

        float floatDeger=3.14F;
        double doubleDeger=3.14;

        char basHarf='A';

        boolean evetMi=true;

        System.out.print("byteDeger="); // "" arasında olduğundan aynen yazar
        System.out.println(byteDeger);  // tırnaksız ve tanımlı olduğundan değişkenin değerini yazar

        System.out.println("byteDeger=" + byteDeger); // böyle yukarıdaki gibi yazar  byteDeger=4
        // ***************************
        // dongu ve karar verme ve işlemler
        //System.out.println("Sonuç");  // yaz
    } // Dur
}
