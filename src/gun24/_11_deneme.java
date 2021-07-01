package gun24;

public class _11_deneme {
    public static void main(String[] args) {
        double mesafe=220.0;
        int sekme =0;
        double yukseklik=220.0;
        while (yukseklik>=1){
            yukseklik=yukseklik*(0.75);
            sekme++;
            mesafe= mesafe+(2*yukseklik);



        }
        System.out.println("sekme = " + sekme);
        System.out.println("Toplam mesafe = "+mesafe);

    }
}