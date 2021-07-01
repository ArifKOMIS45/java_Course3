package gun21;

public class _03_Tablo1 {
    public static void main(String[] args) {
        //  {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}  int 2D arrayini  olustur
        //   2D arrayinden max number print et



        int[][] tablo = {
                {1, 2},
                {2, 3, 1},
                {5, 5, 5,4,8},
                {2, 10, 5}};
        System.out.println("tablo.length = " + tablo.length);// satir sayisi
        System.out.println("tablo.length = " + tablo[0].length);//1.satirin eleman sayisi
        System.out.println("tablo.length = " + tablo[1].length);//2.satirin eleman sayisi
        System.out.println("tablo.length = " + tablo[2].length);//3.satirin eleman sayisi
        System.out.println("tablo.length = " + tablo[3].length);//4.satirin eleman sayisi
        for (int satir=0;satir<tablo.length;satir++)
        {
            for (int sutun=0 ; sutun<tablo[satir].length;sutun++)
            {
                System.out.print(tablo[satir][sutun]+ "\t");
            }

            System.out.println();
        }



    }
}
