package gun33.odevEv;

import java.util.ArrayList;

public class student {
    String name;
    int maxCredit;
    Lesson credit;
    ArrayList<Lesson> dersListesi;
    int toplamKredi = 0;
    String str = "";

//    public int toplamKredisi() {
//        int toplamKredi = 0;
//        for (Lesson ders : dersListesi) {
//            toplamKredi += ders.credit;
//        }
//        return toplamKredi;
//    }

    public void dersEkle(Lesson ders) {
        int z = toplamKredi + ders.credit;
        if (z <= 10) {
            dersListesi.add(ders);
            toplamKredi += ders.credit;
            str += ders.name + ",";
            System.out.println("Ders eklendi");
        } else {System.out.println(ders.name+ "Krediniz limiti astigi icin dersiniz eklenmedi"); }
        System.out.println("*********Eklenen dersler ve krediniz***********");
        System.out.println("Derslerin Listesi: " + str.substring(0, str.length() - 1));
        System.out.println("Toplam krediniz= " + toplamKredi);
    }

}


