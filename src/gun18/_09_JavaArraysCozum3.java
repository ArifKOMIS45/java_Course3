package gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _09_JavaArraysCozum3 {
    public static void main(String[] args) {


        Scanner oku=new Scanner(System.in);
        System.out.println("bir cumle yaziniz=");
        String str= oku.nextLine();
        String[] kelimeler=str.split(" ");

        System.out.print(Arrays.toString(kelimeler));
    }
}
