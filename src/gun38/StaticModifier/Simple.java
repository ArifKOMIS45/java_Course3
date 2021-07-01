package gun38.StaticModifier;

public class Simple {
    int a;//olusturulacak nesneye ait degisken
    static int b;//Class ait degisken nesneye degil

    void arttir(){
        a++;
        b++;
    }


    public static void main(String[] args) {
        Simple ornek1=new Simple();
        ornek1.a=5;

        Simple ornek2=new Simple();
        ornek2.a=7;

        Simple.b=6;//ayni metodlarda oldugu gibi direk Class adi ile ulasilir.
        Simple.b=8;

        System.out.println("ornek1 = " + ornek1.a);  //5
        System.out.println("ornek2 = " + ornek2.a);//7
        System.out.println("Simple b = " + Simple.b);//8
        System.out.println("_________________________________");
        ornek1.arttir();
        ornek2.arttir();

        System.out.println("ornek1 = " + ornek1.a);  //6
        System.out.println("ornek2 = " + ornek2.a);//8
        System.out.println("Simple b = " + Simple.b);//10

    }


}
