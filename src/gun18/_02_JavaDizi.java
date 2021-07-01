package gun18;

public class _02_JavaDizi {
    public static void main(String[] args) {
        int sayi;//daha once bir degiskeni boyle tanimliyorduk
        int[] dizi1 = new int[5];//0,1,2,3,4 indexli 5 adet sayilik yer actik

        System.out.println("dizi1.length = " + dizi1.length);
        for (int i = 0; i < dizi1.length; i++) {
            System.out.println("dizi nin" + i + ".Elemani=" + dizi1[i]);
        }


        System.out.println("dizi1[4] = " + dizi1[4]);//1 tane eleman icin ornegin 4. elemani bu sekilde
        //yazdirabilirz.4. indexe gore aslinda adet acisindan 5. eleman


    }

}
