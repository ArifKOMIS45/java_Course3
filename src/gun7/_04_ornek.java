package gun7;

import java.util.Scanner;

public class _04_ornek {
    public static void main(String[] args) {
        //Kullanicidan ad ve soyad alarak ekrana yazdiriniz
        Scanner oku=new Scanner(System.in);//okuyucuyu bi kere tanimlamaniz gerekir
        System.out.print("Ad ve Soyad giriniz:");//ekrana ne icin veri girilecek

        String isim=oku.nextLine();//okuma isi bu noktada yapiliyor bizde okunan degeri degiskene
        //esitliyor
        System.out.println("Girilen isim = " + isim);//alinan isimi kontrol icin


    }
}
