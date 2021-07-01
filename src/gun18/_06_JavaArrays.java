package gun18;

public class _06_JavaArrays {
    public static void main(String[] args) {
        // 5 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz.Sonrasınd aayrı bir döngü ile yazdırınız.



        int[] sayilar = new int[5];


        for (int i = 0; i < sayilar.length; i++)

        sayilar[i]=(int)(Math.random()*11);

            for (int i = 0; i < sayilar.length; i++)
                System.out.print(" " + sayilar[i]);

                }


}


