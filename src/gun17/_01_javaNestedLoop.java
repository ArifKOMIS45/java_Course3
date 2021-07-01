package gun17;

public class _01_javaNestedLoop {
    public static void main(String[] args) {
// 1 dan 5 e kadar (5 dahil) olan sayıların  toplamını aşağıdaki yazdırınız. toplama tablosu
        // 1 + 1 = 2
        // 1 + 2 = 3
        // 1 + 3 = 4
        // 1 + 4 = 5
        // 1 + 5 = 6

        // 2 + 1 = 3
        // 2 + 2 = 4
        // 2 + 3 = 5
        // 2 + 4 = 6
        // 2 + 5 = 7
        // ......

        for (int i = 1; i <= 5; i++) {
            for (int t = 1; t <= 5; t++)
                System.out.println(i + "+" + t + "=" + (i + t));
            System.out.println();
        }


    }

}
