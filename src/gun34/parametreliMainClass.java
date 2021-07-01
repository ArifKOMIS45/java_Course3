package gun34;

public class parametreliMainClass {


    public static void topla(int a, int b) {

        System.out.println(a + b);
    }

    public static void cikar(int a, int b) {

        System.out.println(Math.abs(a - b));
    }

    public static void main(String[] args) {
        topla(20, 40);
        cikar(10, 5);

        parametreliMainClass p = new parametreliMainClass();

        p.carp(4, 5);
        p.bolme(20, 6);


    }

    public void carp(int a, int b) {
        System.out.println(a * b);
    }

    public void bolme(int a, int b) {
        System.out.println(a / b);
    }


}
