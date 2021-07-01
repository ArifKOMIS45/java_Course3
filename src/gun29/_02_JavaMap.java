package gun29;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        Map<String,String> semih=new HashMap<>();
        semih.put("isim","Semih nerde");
        semih.put("email","Semih@hotmail.com");
        semih.put("adres","Frankfurt/Almanya");
        semih.put("telefon","0 532 230000");

        System.out.println("semih.get(isim)) = " + semih.get("isim"));
        System.out.println("semih.get(\"telefon\") = " + semih.get("telefon"));

        Map<String,String> ismail=new HashMap<>();
        ismail.put("isim","Ismail Demir");
        ismail.put("email","ismail@hotmail.com");
        ismail.put("adres","Amsterdam/Hollanda");
        ismail.put("telefon","0 546 768887888");

        System.out.println("ismail) = " + ismail.get("isim"));
        System.out.println("ismail tel = " + ismail.get("telefon"));

        System.out.println("ismail = " + ismail);
        System.out.println("semih = " + semih);

        Map<String,Map<String,String>> kartvizitler=new HashMap<>();
        kartvizitler.put("semih",semih);
        kartvizitler.put("ismail",ismail);

        System.out.println("kartvizitler.get(\"semih\").get(semih) = " + kartvizitler.get("semih").get("telefon"));
        System.out.println("kartvizitler = " + kartvizitler);


















    }
}
