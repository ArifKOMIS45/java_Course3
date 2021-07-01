package gun18;

public class _03_JavaDizi {
    public static void main(String[] args) {
        //dizileri asagidaki sekillerde tanimlayabiliriz
        int[] dizi1=new int[5];//int sayi; gibi
        int[] dizi2={5,77,4,786,0,-1,4,5,6,7,323,4,55};//eleman sayisi kadar uzunlukta dizi tanimlandi
        //int sayi=5; gibi
        String[] dizi3=new String[5];//String tipinde 5 elemnli ici bos dizi tanimlandi
        boolean[] dizi4=new boolean[6];//boolean tipinde 6 elemanli bir dii tanimlandi
        double[] dizi5= new double[5];//double tipinde 5 elemanli bir dizi

        for (int i=0;i<dizi1.length;i++)
            System.out.println("dizi1 int = " + dizi1[i]);

        for (int i=0;i<dizi2.length;i++)
            System.out.println("dizi1 int = " + dizi2[i]);

        for (int i=0;i<dizi3.length;i++)
            System.out.println("dizi1 int = " + dizi3[i]);

        for (int i=0;i<dizi4.length;i++)
            System.out.println("dizi1 int = " + dizi4[i]);

        for (int i=0;i<dizi5.length;i++)
            System.out.println("dizi1 int = " + dizi5[i]);
    }

}
