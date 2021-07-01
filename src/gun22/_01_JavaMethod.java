package gun22;

public class _01_JavaMethod {
    //buraya
    public static void main(String[] args) {

        System.out.println("Merhaba dunya");//ekranan yazdirir
        System.out.println("Merhaba dunya");//ekranan yazdirir
        System.out.println("Merhaba dunya");//ekranan yazdirir

        Math.max(5, 6);//daha once yazilsmis cagiriyoruz
        //ayni bunun gibi bizde boyle metodla yazdirabiliriz
        //mesela ekrana merhaba dunya yazan bir metod yazalim ordan cagiralim
        merhabaYaz();//fonksiyon seklinde cagirma
        merhabaYaz();
        merhabaYaz();


    }//burasi mainin bittigi yer

    //veya buraya
    public static void merhabaYaz()//mainle ayni ismini ver
    {
        System.out.println("Merhaba dunya");
    }

    // metodlar tekraryan kodlardan kurtulup bir kere yazip sonra tekrar
    // cagirmak icin ve buyuk programi
    //parcalara bolup kod karisikliginin onune gecmek icin kullanilir.
}
