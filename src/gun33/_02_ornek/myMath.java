package gun33._02_ornek;

public class myMath {


    public static int getMin(int number1, int number2) {
        return Math.min(number1, number2);
    }

    public static int getMax(int number1, int number2) {
        return Math.max(number1, number2);
    }

    public static int getMutlak(int num) {
        return Math.abs(num);
    }

    public static double getUs(int number1, int number2) {
        return Math.pow(number1, number2);
    }

    public static int tumTopla(int... num) {
        int toplam = 0;
        for (int b : num) {
            toplam += b;
        }
        return toplam;
    }
}
