package gun13;

import java.util.Scanner;

public class _05_IfElseIf {
    public static void main(String[] args) {
        // Soru : Kullanıcıdan  Fizik: 90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        //Scanner oku = new Scanner(System.in);
        //System.out.print("Ders ve Notu=");
        //String Dersnot= oku.nextLine();
        //int bosluk=Dersnot.indexOf(" ");
        //String notStr=Dersnot.substring(bosluk+1);
        //int not=Integer.parseInt(notStr);

         //int  sonuc=not>=90 ? "A": not>=80 ? "B": not>=70 ? "C":not>=60 ? "D": not>=40 ? "E": not<40 ? "F";
           // System.out.println("sonuc = " + sonuc);

        //benim yaptigim
        //Scanner oku = new Scanner(System.in);
        //System.out.print("Ders ve Notu=");
        //String Dersnot= oku.nextLine();
        //int bosluk=Dersnot.indexOf(" ");
        //String notStr=Dersnot.substring(bosluk+1);
        //int not=Integer.parseInt(notStr);

        //String sonuc=not>=90 ? "A": not>=80 ? "B": not>=70 ? "C":not>=60 ? "D": not>=40 ? "E":  "F";
        //System.out.println("sonuc = " + sonuc);


            Scanner oku = new Scanner(System.in);
            System.out.print("Ders ve Notu =");  // Fizik:  77
            String dersNot = oku.nextLine(); // Fizik:  45

            int ogrNot = Integer.parseInt(dersNot.replaceAll("[^0-9]", ""));
            String dersAd = dersNot.replaceAll("[0-9]", "");

            System.out.println("ogrNot = " + ogrNot);
            System.out.println("dersAd = " + dersAd);

            if (ogrNot >= 90)
                System.out.println("A");
            else
            if (ogrNot >= 80)
                System.out.println("B");
            else
            if (ogrNot >= 70)
                System.out.println("C");
            else
            if (ogrNot >= 60)
                System.out.println("D");
            else
            if (ogrNot >= 40)
                System.out.println("E");
            else
                System.out.println("F");
        }


    }

