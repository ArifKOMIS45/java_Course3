package gun33._02_ornek;

public class soru {
    // Math sınıfndaki metodlarıdan 5 tanesini kendi isimlendirmenizle
    // ayrı bir sınıfta yazarak,
    // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
    // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
    // kullanımlarını yazınız.
    public static void main(String[] args) {
        System.out.println(myMath.getMin(34,67));
        System.out.println(myMath.getMax(3,7));
        System.out.println(myMath.getMutlak(-4));
        System.out.println(myMath.getUs(5,6));

        System.out.println(myMath.tumTopla(2,3,4,5,6,7,89,6));
    }
}
