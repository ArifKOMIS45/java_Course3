package gun18;

import java.util.Scanner;

public class _00_mentoring {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
//        int sayi = oku.nextInt();
//        int s = 1;
//        for (int i = 1; i <= sayi; i++) {
//            s = s * i; }
//        System.out.println("faktoriyel = " + s);

//        int girilen = oku.nextInt();
//        System.out.println(girilen + "'in carpim tablosu");
//        for (int i=1;i<=10;i++){
//            int tablo=i*girilen;
//            System.out.println(i+"x"+girilen+ "=" +tablo ); }

    /*
Kullanıcıdan bir kelime girmesini isteyin.
Yazdıgınız program sayesinde girilen kelimenin son karakterinden başlayarak ilk karaktere kadar sırayla "artarak yazdırsın"
ve en sonda asıl kelimeye ulaşsın.

Konsol örneği :

Kelime gir :  Almanya
a
ya
nya
anya
manya
lmanya
Almanya

 */
        Scanner o=new Scanner(System.in);
        String kelime= o.nextLine();
         String yeniString="";

         for (int i= kelime.length();i>=0;i--){
            yeniString=kelime.substring(i);
            System.out.println(yeniString );
        }

    }

}
