package gun9;

public class _12_JavaAritmetikoperators {
    public static void main(String[] args) {
        int a=10;

        int sonuc = a +   ++a   +   a++   +   --a   -    a--;
        //           10      11       11         10         10 => 32
        // sonuc =  10  +    11   +   11    +    10  -      10

        System.out.println("sonuc = " + sonuc); // ? 32
        System.out.println("a = " + a); // 10



    }
}
