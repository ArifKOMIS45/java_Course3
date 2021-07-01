package gun10;

import java.util.Scanner;

public class _09_JavaIf {
    public static void main(String[] args) {
        //Girilen bir sayinin tekmi ciftmi oldugunu yazdiriniz
        Scanner oku=new Scanner(System.in);
        System.out.print("bir sayi giriniz = "); int s=oku.nextInt();
        if (s<0){
            s=-s;//negatif sayi verilirse,eksi degerler icin pozitife donusturulur
        }

        if (s%2==0){//ikilik tabanda 0,yada1 dir
            System.out.println("sayi ciftir");
        }
        if (s%2>0){  //if (s%2==1) yada
            // Todo// s%2!=0 boyle olunca -,+ degerli sayi olmasi farketmez
            System.out.println("sayi tektir");
        }
    }
}
