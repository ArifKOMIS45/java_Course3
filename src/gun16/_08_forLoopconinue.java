package gun16;

import java.util.Scanner;

public class _08_forLoopconinue {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("bir cimle giriniz");
        String cumle= oku.nextLine();

        for(int i=0 ;i<cumle.length(); i++) {
            if (cumle.charAt(i) == ' ')//B  u  g  u  n  sirayla bakacak
                continue;//calistigi andan devam eden satirlari pas gecilir ve sonraki adim devam edilir

            System.out.println(cumle.charAt(i));
        }




    }
}
