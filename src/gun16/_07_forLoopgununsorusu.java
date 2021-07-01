package gun16;

import java.util.Scanner;

public class _07_forLoopgununsorusu {
    public static void main(String[] args) {
//girilen bir string icindeki a harfi sayisini bulunuz
        //c harfine gelirse donguden cikilsin
        //str.charAt(0)
        Scanner oku=new Scanner(System.in);
        System.out.print("bir cimle giriniz");
        String cumle= oku.nextLine();

        int aMiktar=0;
        for(int i=0 ;i<cumle.length(); i++) {
            if(cumle.toLowerCase().charAt(i)=='a')//B  u  g  u  n  sirayla bakacak
            aMiktar++;
           else
               if (cumle.toLowerCase().charAt(i) =='c')
                break;;

        }
        System.out.println("toplam = " + aMiktar);





    }
}
