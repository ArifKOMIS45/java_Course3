package gun23;

import java.util.Scanner;

public class _02_JavaMethod {

    public static void main(String[] args) {

        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra mainClass de yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("1.sayi=");int sayi1= oku.nextInt();
        System.out.print("2.sayi=");int sayi2= oku.nextInt();





int enb=enBuyukBul(sayi1,sayi2);//Mtah.max gibi yaptik


    }

    public static int enBuyukBul(int a, int b){
//       int enb=0;
//        if (a>b) enb=a; else enb=b;
//        return enb;
    //2.yontem
        if (a>b)
            return a;
        else
            return b;



    }



}