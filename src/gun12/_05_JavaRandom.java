package gun12;

public class _05_JavaRandom {
    public static void main(String[] args) {
        //soru: 0 ile 6 arasinda random sayi ureten programi uretiniz

        //Math.random() --> 0.000-0.9999       arasi sayi uretir

        double doubleSayi = Math.random() * 10;//0-9 arasi double  sayi uretir
        int tamSayi = (int) doubleSayi;//0-9 arasi int sayiysa donustu
        System.out.println("tamSayi(0-10) = " + tamSayi);

        tamSayi = (int) (Math.random() * 6);//0-5 arasi int sayiya donustu
        System.out.println("tamSayi(0-6) = " + tamSayi);


    }
}
