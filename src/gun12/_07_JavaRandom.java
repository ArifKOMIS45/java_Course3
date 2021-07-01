package gun12;

import java.util.Scanner;
public class _07_JavaRandom {
    public static void main(String[] args) {
        //kullanicidan alt ve ust degeri isteyerekrandom sayi uretiniz
        //uretilen sayiyi ekrana yazdiriniz
        //(int)(Math.random()*((max-min)+1)) +min

        Scanner oku = new Scanner(System.in);

        System.out.print("min =");
        int min = oku.nextInt();

        System.out.print("max=");
        int max = oku.nextInt();

        int NumberInRange = (int) (Math.random() * ((max - min) + 1)) + min;
        //3 ile 7 arasi uretmek istersek
        //min e bakalim-->0*(...)+ min => min
        // max bakalim --> (0.99*5) + min =>4+3=7

        System.out.println("NumberInRange = " + NumberInRange);

    }
}
