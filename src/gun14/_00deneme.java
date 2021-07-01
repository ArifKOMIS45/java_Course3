package gun14;

import java.util.Scanner;

public class _00deneme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        int a=1;
        int  b=1;


    do {a = a + (b + 2);
    b += 2;

    } while (a<input); if(a==input) System.out.println("true");else System.out.println("false");
    }


}
