package gun19;

public class _06_Java2Darrays {
    public static void main(String[] args) {
        //2 boyutlu diziyi random 1-10 sayilari arasi doldurupbaska donguye yazdiriniz

        int[][] tablo=new int[3][4];

         for(int satir=0; satir<3; satir++)
         {
             for (int sutun = 0; sutun < 4; sutun++)
             {
                 tablo[satir][sutun] = (int) (Math.random() * 10);
             }
         }

         for(int satir=0; satir<3; satir++)
         {
            for (int sutun = 0; sutun < 4; sutun++)
            {
                System.out.print(tablo[satir][sutun]+"\t");
            }
            System.out.println();
         }


    }
}


