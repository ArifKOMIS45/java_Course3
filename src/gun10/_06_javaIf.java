package gun10;

import java.util.Scanner;

public class _06_javaIf {
    public static void main(String[] args) {
        //Girilen bir sayinin 10 dan buyu ise ekrana 10 dan buyu diye yaz
        //Algoritma
        //1-Basla
        //2-Sayi Oku
        //3-Sayi>10 ==>"10 dan buyuk yaz"
        //4-Dur
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz:"); int sayi= oku.nextInt(); //15,5
        if (sayi>10){// sart saglaniyorsa parantezlerin arasi calisir.degilse gec
            System.out.println("10 dan buyuk");
        }
    }
}
