package gun16;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
// kullanicin girecegi bir rakama kada olan sayilarin toplamini bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayi giriniz=");
        int sayi= oku.nextInt();

         int toplam=1;
        for(int i =1; i<=sayi; i++){
            toplam=toplam*i;

        }System.out.println("toplam = " + toplam);






    }
}
