package gun5;

public class _05_Scopeinceleme {
    public static void main(String[] args) {

            int a=5; // a aşağıdaki scopun dışında olduğundan global gibi oluyor
            // her yerde geçerli oluyor.

            { // bu parantezlerin arasında tanımlanan değişkenler sadece burada geçerli olur
                // b sadece bu parantezler(Scope) arasında geçerli
                int b= 75;
                a=7;

                System.out.println("b = " + b);
                System.out.println("a = " + a);
            }

           // b=80;  b değişkeni sadece yukarıdaki scope da geçerli

            System.out.println("a = " + a);
            //System.out.println("b = " + b); // b değişkeni sadece yukarıdaki scope da geçerli
        }

}
