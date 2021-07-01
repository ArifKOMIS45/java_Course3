package gun29;
// Kullanıcıya
// 1-Ekleme
// 2-Listeleme
// 3-Arama
// 4-Düzeltme
// 5-Çıkış
// Seçeneklerini vererek username,password, userType (Müdür, çalışan) dan oluşan bir Map tanımlayınız.
// Kullanıcının seçimine göre Her bir işlemi ayrı metodda yaptırınız.
// Mainde sadece Seçenekler ve metodların çağrılması olsun.

// Bölüm bölüm gidiyoruz önce mainin içini tasarlayınız.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {

        Map<String, Map<String, String>> users = new HashMap<>();
        Scanner oku = new Scanner(System.in);
        int secim=0;
         do {
            System.out.println("**************Menu************");
            System.out.println("1-Ekleme");
            System.out.println("2-Listeleme");
            System.out.println("3-Arama");
            System.out.println("4-Duzeltme");
            System.out.println("5-Cikis");
            System.out.println();
            System.out.print("Yapmak istediginiz islemi secin=");
            secim= oku.nextInt();

            switch (secim) {
                case 1: Ekleme(users); break;
                case 2: Listeleme(users); break;//butun bilgiler olmali
                case 3: Arama(users); break;//isme gore arayacak
                case 4: Duzeltme(users); break; }
                    } while (secim<5);




    }

    public static void Ekleme(Map<String, Map<String, String>> users) {

        Scanner oku = new Scanner(System.in);
        System.out.print("username=");
        String username = oku.nextLine();

        System.out.print("password= ");
        String password = oku.nextLine();

        System.out.print("User type= ");
        String usertype = oku.nextLine();

        Map<String, String> user = new HashMap<>();
        user.put("password", password);
        user.put("User type", usertype);

        users.put(username, user);}

    public static void Listeleme(Map<String, Map<String, String>> users) {

            System.out.println("Butun elemanlarin listesi = " + users); }

    public static void Arama(Map<String, Map<String, String>> users) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Aranacak ismi girin=");
        String isim = oku.nextLine();
       System.out.println("Aranan ismin bilgileri = " + users.get(isim)); }

    public static void Duzeltme(Map<String, Map<String, String>> users) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Nerede duzeltme yapacaksiniz,yaziniz.1-password,2-user type =");
        int secim = oku.nextInt();
        Scanner oku1 = new Scanner(System.in);
        Map<String, String> user=new HashMap<>();
       if (secim==1){
               System.out.print("Degisiklik yapilacak usurname girin="); String isim= oku1.nextLine();
               System.out.print("yeni password girin="); String yeni1= oku1.nextLine();
               user.put("password", yeni1);
               users.put(isim,user);
           System.out.println(isim+"yeni bilgileri"+users.get(isim));  }
            else if(secim==2){
                System.out.print("Degisiklik yapilacak usurname girin="); String es= oku1.nextLine();
                System.out.print("yeni user type girin="); String yeni2= oku1.nextLine();
                user.put("user type",yeni2);
                users.put(es,user);
           System.out.println(es+"yeni bilgileri"+users.get(es));}
        }

    }


