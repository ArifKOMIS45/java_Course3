package gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _08_JavaArrayscozum2 {
    public static void main(String[] args) {


//2- Kullanıcıdan alacağınız bir cümlenin sadece ilk harflerini bir diziye atayınız.

    Scanner oku=new Scanner(System.in);
        System.out.println("bir cumle yaziniz=");
    String str= oku.nextLine();
    String[] kelimeler=str.split(" ");
    String[] yeni = new String[kelimeler.length];
        for (int i = 0; i < kelimeler.length; i++) {
        yeni[i]= kelimeler[i].substring(0,1);

    } System.out.println("yeni = " + Arrays.toString(yeni));
//2. yontem
        for (int i = 0; i < kelimeler.length; i++) {
            char basharf= kelimeler[i].charAt(0);
            System.out.print(basharf);
        }





}

}
