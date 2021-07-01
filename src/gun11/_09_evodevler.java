package gun11;

import java.util.Scanner;

public class _09_evodevler {
    public static void main(String[] args) {
        //1
        int s1 = 35;
        int s2 = 23;
        if (s1 > s2) {System.out.println("int 1 is greater than 2"); }
        else { System.out.println("int 1 is smaller than 2"); }

        //2
        int a1 = 26;
        int a2 = 35;
        if (a1 > a2) { System.out.println("\"int 1 is greater than 2 \"");
        } else { System.out.println("\"int 1 is smaller than 2\""); }

        //3
        String str1 = "Kararsiz";
        String str2 = "Kararsiz";
        if (str1 == str2) { System.out.println("\"String 1 is equal to String 2 \"");
        } else { System.out.println(" \"String 1 is NOT equal to String 2\" ");        }

        //4
        double d1 = 35.5;
        double d2 = 47.7;
        if (d1 > d2) {System.out.println("\"double 1 is greater than double 2\" ");
        } else {  System.out.println(" \"double 1 is smaller than double 2\" "); }

        //5
        String stt = "98765465789998767889876545678987657";
        if (stt.charAt(1) % 2 > 0) {System.out.println("\"number is a ODD number\"");
        } else {System.out.println("\"number is a EVEN number\"");        }

        //6
        int sayi = 33;
        if (sayi % 4 == 3) {System.out.println(" \"Reminder is 3\""); }
        else {if (sayi % 4 == 2) { System.out.println("\"Reminder is 2\""); }
            else {if (sayi % 4 == 1) {System.out.println("\"Reminder is 1\"");}
            else { System.out.println("\"Reminder is 0\""); } }}

            //7
        Scanner oku = new Scanner(System.in);
        System.out.print("bir cumle giriniz=");
        String cumle = oku.nextLine();
        if (!cumle.isEmpty() && cumle.length() >= 14 && cumle.contains("i love you java"))
        {System.out.println("\"String is i love java and 14 character.\" "); }

            //8
        String para = "883€";
        if (para.contains("€")) {System.out.println("This is euro"); }
        else { if (para.contains("$")) {System.out.println("This is dolar"); }
        else {System.out.println("no money"); } }

        //9
        double bolunen=45;
        if (bolunen%5==0 && bolunen%8==0){
          System.out.println("\"able to divide by 5 and 8\" "); }
          else {if (bolunen%10==5 && bolunen%9==0){
         System.out.println("\"able to divide by 9 and divide by 10 reminder is 5\" "); }}
        }

    }
