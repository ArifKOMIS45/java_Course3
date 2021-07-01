package gun7;

import java.util.Scanner;

public class _03_ornek {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Lutfen ismini giriniz: ");
        String isim= oku.nextLine();//next() --->kelime okumak icin
        System.out.println("Girilen isim = " + isim);
        // next yazarsak tek kelime cikiyor eger nextLine() dersek tum satir okuyor
    }
    
    

}
