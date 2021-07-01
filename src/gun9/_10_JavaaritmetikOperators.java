package gun9;

public class _10_JavaaritmetikOperators {
    //carpma bolme modul
    public static void main(String[] args) {
        int a=10;
        int b= 5;
        System.out.println("Carpma islemi");
        System.out.println("a*b = "+ (a*b));

        System.out.println("Bolme islemi");
        System.out.println("a/b = " +(a/b));

        System.out.println("Modul islemi");
        System.out.println("a%b = " +(a%b));// modul 10%5 bolumunden kalan demek. 0
        System.out.println("b%a = " +(b%a)); // modul, 5%10 soldaki sayi kucuk ise sonu soldaki sayidir. 5
    }

}
