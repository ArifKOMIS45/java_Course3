package gun17;

public class _03_javaNestedLoop {
    public static void main(String[] args) {
        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yuarıdaki çarpım tablosunu 10 a kadar ekrana yazdırınız.


        for (int i = 1; i <= 10; i++) {
            for (int t = 1; t <= 10; t++)
                System.out.println(i + " * " + t + " = " + (i * t));
            System.out.println();
        }

    }

}
