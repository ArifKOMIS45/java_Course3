package gun10;

import java.util.Scanner;

public class _10_JavaIf {
    public static void main(String[] args) {
        //Girilen bir sayinin birler basamagini yazi ile yazdiriniz
        Scanner oku=new Scanner(System.in);
        System.out.print("bir sayi giriniz = "); int s=oku.nextInt();
        if (s<0){s=-s;}
        if (s%10==1){System.out.println("Bir"); }
        if (s%10==2){System.out.println("Iki");}
        if (s%10==3){System.out.println("Uc"); }
        if (s%10==4){System.out.println("Dort");}
        if (s%10==5){System.out.println("Bes");
        }if (s%10==6){System.out.println("Alti");
        }if (s%10==7){System.out.println("Yedi");
        }if (s%10==8){System.out.println("Sekiz");}
        if (s%10==9){System.out.println("Dokuz");}
        if (s%10==0){System.out.println("Sifir");
        }
    }
}
