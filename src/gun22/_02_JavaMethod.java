package gun22;

public class _02_JavaMethod {
    public static void main(String[] args) {
        merhabayaz();
        ismeMerhabaYaz("ismet");//parametre kullanma
        ismeMerhabaYaz("ahmet");

    }

    public static void merhabayaz() {System.out.println("Merhaba"); }

    public static void ismeMerhabaYaz(String isim)//parametreyi tanimlama
    {System.out.println("Merhaba " + isim.toUpperCase()); }
//for do while hersey yazabilirsin


}
