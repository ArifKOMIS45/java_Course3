package gun24;

import java.util.ArrayList;
import java.util.Scanner;

public class _06_ArrayList_Soru {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 6 elemanli bir dizinin
        //sadece tek elemanlarini ayr bir diziye bir metodla atarakmainde yazdiriniz

     Scanner sc=new Scanner(System.in);
        int[] dizi=new int[6];
        for (int i=0; i< dizi.length; i++){
            dizi[i]= sc.nextInt();
        }
        tekElemanlar(dizi);

    }
    public static void tekElemanlar(int[] sayi)
    {
        ArrayList<Integer> dizi2=new ArrayList<>();
        for (int i=0; i< sayi.length; i++){
            if(sayi[i]%2==1){
                dizi2.add(sayi[i]);
            }
        }
        System.out.println("dizi2 = " + dizi2);
    }


}