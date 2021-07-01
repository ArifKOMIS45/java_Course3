package gun31;

import java.util.HashSet;
import java.util.Scanner;

public class _03mentor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        HashSet<String> hs=new HashSet<>();
hs.add("Burak");
hs.add("Gulsum");
hs.add("Mustafa");
hs.add("Elif");
hs.add("Busra");
hs.add("Fatih");

boolean usernameAccepted=false;
        System.out.print("Kullanici adi giriniz: ");
       do {
       String usurname=sc.nextLine();
       if (hs.add(usurname)){
           System.out.println("Kullanici adi gecerli...");
           usernameAccepted=true;
       }
       else System.out.println("Bu kullanici Adi alinmis, tekrar deneyiniz...");
        }while (!usernameAccepted);
        System.out.println("hs = " + hs);




    }
}
