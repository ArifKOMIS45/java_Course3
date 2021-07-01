package gun36.Constructor;

import java.util.ArrayList;

public class Bankalar {
    // Bir banka class ı tanımlayınız.
    // 3 adet field ekleyiniz.
    // 3 adet constructor ekleyin.
    // toString metodu oluşturun.
    // 3 tane nesne oluşturup mainde yazdırınız.

    public static void main(String[] args) {
        banka banka1 = new banka("Yapı Kredi", 1900, 1980);
        banka banka2 = new banka("İş bankası", 1960);
        banka banka3 = new banka("Ziraat Bankası");

//
//        System.out.println("banka1 = " + banka1);
//        System.out.println("banka2 = " + banka2);
//        System.out.println("banka3 = " + banka3);


        ArrayList<String> bankalar = new ArrayList<>();
        bankalar.add(new banka("Yapı Kredi", 1900, 1980).toString());
        bankalar.add(new banka("İş bankası", 1960).toString());
        bankalar.add(new banka("Ziraat Bankası").toString());

        bankalar.forEach(System.out::println);
        //System.out.println(Arrays.toString(bankalar.toArray()));
    }


}
