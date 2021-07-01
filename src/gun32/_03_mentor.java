package gun32;

import java.util.Arrays;
import java.util.HashSet;

public class _03_mentor {
    public static void main(String[] args) {
        //todo Main methodun içimde İki adet set oluşturun. Bu setlerin içinde isimler tekrar etsin.
        // Set1 -> "Mehmet", "Ahmet", "Ayşe", "Hüseyin", "Murat"
        // Set2 -> "Caner", "Ahmet", "Elif", "Hüseyin", "Murat", "Esra"
        // Main methodun dışında bir method'da bu iki set'de toplam kaç kişi olduğunu hesaplayın.
        HashSet<String> set1 = new HashSet<>(Arrays.asList("Mehmet", "Ahmet", "Ayşe", "Hüseyin", "Murat"));
        HashSet<String> set2 = new HashSet<>(Arrays.asList("Caner", "Ahmet", "Elif", "Hüseyin", "Murat", "Esra"));

        int toplam = uzunluk(set1, set2);
        System.out.println(toplam);

    }

    public static int uzunluk(HashSet<String> a, HashSet<String> b) {
        HashSet<String> total = new HashSet<>(a);
        total.addAll(b);
        return total.size();
    }


}
