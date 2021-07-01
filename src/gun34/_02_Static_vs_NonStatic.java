package gun34;


public class _02_Static_vs_NonStatic {
    public static void main(String[] args) {
     buMethodStatic();//static bir anahtar baska bir seye ihtiyac uymadan ulasabilirsiniz.tek class icinde ise

     _02_Static_vs_NonStatic yeniObje=new _02_Static_vs_NonStatic();//static olmayan bir metodu kullanmak icin
        //bir obje olusturmak gerek sonra kullabiliriz
     yeniObje.buMethodStaticDegil();



    }
public static void buMethodStatic(){
    System.out.println("benbir static metodum");
}

public void buMethodStaticDegil(){
    System.out.println("BU method static degil");
}


}
