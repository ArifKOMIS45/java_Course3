package gun24;

import java.util.ArrayList;

public class _04_ArrayList {
    public static void main(String[] args) {
            int[] dizi={2,3,45,66}; // dizilerde başlangıç
            // değeri vererek tanımlama

            //ArrayList de başlangıç değerleri vererek aşağıdaki
            // gibi tanımlayabiliriz.
            ArrayList<String> list1=new ArrayList<>(){
                    {
                            add("Almanca");
                            add("Ingilizce");
                            add("Turkce");
                            add("Rusca");
                    }
            };
            System.out.println("list1 = " + list1);

            ArrayList<String> list2=new ArrayList<>();
            list2.add("Rusca");
            list2.add("Turkce");
            list2.add("Arapca");
            System.out.println("list2 = " + list2);

            list1.addAll(list2);//iki listi birbirine ekliyor
            System.out.println("list1 = " + list1);

            list1.removeAll(list2);
            System.out.println("list1 = " + list1);

        if (list1.contains("Turkce"))
                System.out.println("Turkce var");

    }


}

