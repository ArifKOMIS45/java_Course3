package gun8;

import java.util.Arrays;
import java.util.Scanner;

public class _deneme {
    public static void main(String[] args) {
//4.kullanicidan alacaginiz bir cumleyi kelimelerine gore tersten yazdiriniz

        Scanner oku=new Scanner(System.in);
        System.out.println("bir cumle yaziniz=");
        String str= oku.nextLine();
        String[] kelimeler=str.split(" ");

          String[] yeni=new String[kelimeler.length];
int j=0;
          for (int i= kelimeler.length-1;i>=0;i--){

                     yeni[j]= kelimeler[i];
                   j++;

          }
        System.out.println(Arrays.toString(yeni));



        }



}
