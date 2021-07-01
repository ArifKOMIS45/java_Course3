package gun18;

import java.util.Scanner;

public class _07_JavaArraysSoru {
    public static void main(String[] args) {
        //1- Kullanıcıdan alacağınız 5 ayrı kelimeyi bir diziye atayınız,
        // Kelimelerden en uzun olanının ilk ve son harfini Büyük ise küçük
        // küçük ise büyük hale getiriniz.

        //2- Kullanıcıdan alacağınız bir cümlenin sadece ilk harflerini bir diziye atayınız.
        //3- Kullanıcıdana alacağınız bir cümlenin kelimelerini bir diziye atayınız.
        //4-kullanicidan alacaginiz bir cumleyi kelimelerine gore tersten yazdiriniz
//1
        Scanner read = new Scanner(System.in);
        String[] arr = new String[5];

        String max = "";
        for (int i = 0; i < 5; i++) {

            System.out.print("Bir kelime giriniz:");
            arr[i] = read.nextLine();
        }

        for (int j = 0; j < arr.length; j++) {

            if (arr[j].length() > max.length())
                max = arr[j];
        }



        char[] ch = max.toCharArray();


        if (ch[0] >= 'a' && ch[0] <= 'z') {
            ch[0] = (char) (ch[0] - 'a' + 'A');
        } else {
            if (ch[0] >= 'A' && ch[0] <= 'Z')
                ch[0] = (char) (ch[0] + 'a' - 'A');

            if (ch[max.length() - 1] >= 'a' && ch[max.length() - 1] <= 'z') {
                ch[max.length() - 1] = (char) (ch[max.length() - 1] - 'a' + 'A');
            } else if (ch[max.length() - 1] >= 'A' && ch[max.length() - 1] <= 'Z')
                ch[max.length() - 1] = (char) (ch[max.length() - 1] + 'a' - 'A');


        }
        System.out.println(ch);





    }


    }






