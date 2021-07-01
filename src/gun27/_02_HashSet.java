package gun27;

import java.util.HashSet;
import java.util.Iterator;

public class _02_HashSet {
    public static void main(String[] args) {
        HashSet<String> renkler = new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("rED");
        //1.yontem
        System.out.println("renkler = " + renkler);
        //2.yontem
        for (String s : renkler) {
            System.out.println("renkler = " + s);
        }
        //3.yontem
        Iterator gosterge = renkler.iterator();//renkler isimli dizinin basina konumlaniyor
        while (gosterge.hasNext())//sonraki eleman var ise
        {
            System.out.println("sonraki eleman = " + gosterge.next());
            if (gosterge.next()=="Blue") gosterge.remove();//o anda gosterdigi elemani silebiliyor.
        }

        renkler.remove("Red");
        System.out.println("renkler = " + renkler);

        renkler.clear();
        System.out.println("clear sonrasi = " + renkler);


    }
}
