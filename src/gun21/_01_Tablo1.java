package gun21;

public class _01_Tablo1 {
    public static void main(String[] args) {
        int sayi=0;//Hafiza bir sayilik yer ayiriyor ve adina sayi diyor
        int[] dizi=new int[5];//5 sayilik yer ayiriyor(0,1,2,3,4)
        int [][] tablo=new int[4][5];//bu hafizada 4 satir ve 5 sutun seklinde 20 tane int ayirir
        //1.satira deger atamak icin
        tablo[0][0]=65;
        tablo[0][1]=85;
        tablo[0][2]=7;
        tablo[0][3]=5;
        tablo[0][4]=77;
        //2.satira deger atamak icin
        tablo[1][0]=6;
        tablo[1][1]=8;
        tablo[1][2]=76;
        tablo[1][3]=56;
        tablo[1][4]=7;

        for (int satir=0;satir<4;satir++)
        {for (int sutun=0;sutun<5;sutun++)
        {
            tablo[satir][sutun]=(int)(Math.random()*100);
        }
        }

        for (int satir=0;satir<4;satir++)
        {for (int sutun=0;sutun<5;sutun++)
        {
            System.out.print(tablo[satir][sutun]+"\t");
        }
            System.out.println();
        }






    }
}
