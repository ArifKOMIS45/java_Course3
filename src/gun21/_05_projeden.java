package gun21;

public class _05_projeden {
    public static void main(String[] args) {
         /*
       String 2D array oluştur
       {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}
       String de $ varsa 3.2 ile çarp
       String de € varsa 4.2 ile çarp
       double return et
       */

        String[][] tablo={
                {"$12" , "$22" , "5$"},
                {"€9" , "€40" , "$1" , "$2"},
                {"€12"}
        };

        double toplam=0;
        //1.Satır için
        for(int sutun=0; sutun <3 ; sutun++)
        {
            if (tablo[0][sutun].contains("$"))
            {
                String eleman=tablo[0][sutun].replace("$","");
                toplam = toplam + Integer.parseInt(eleman)*3.2;
            }
            else
            {
                String eleman=tablo[0][sutun].replace("€","");
                toplam = toplam + Integer.parseInt(eleman)*4.2;
            }
        }


        //2.Satır için
        for(int sutun=0; sutun <4 ; sutun++)
        {
            if (tablo[1][sutun].contains("$"))
            {
                String eleman=tablo[1][sutun].replace("$","");
                toplam = toplam + Integer.parseInt(eleman)*3.2;
            }
            else
            {
                String eleman=tablo[1][sutun].replace("€","");
                toplam = toplam + Integer.parseInt(eleman)*4.2;
            }
        }

        //3.Satır için
        for(int sutun=0; sutun <1 ; sutun++)
        {
            if (tablo[2][sutun].contains("$"))
            {
                String eleman=tablo[2][sutun].replace("$","");
                toplam = toplam + Integer.parseInt(eleman)*3.2;
            }
            else
            {
                String eleman=tablo[2][sutun].replace("€","");
                toplam = toplam + Integer.parseInt(eleman)*4.2;
            }
        }
        System.out.println("toplam = " + toplam);

        toplam=0;
        // yeni yöntem
        for(int satir=0; satir < tablo.length ; satir++) {

            for (int sutun = 0; sutun < tablo[satir].length; sutun++) {

                if (tablo[satir][sutun].contains("$")) {
                    String eleman = tablo[satir][sutun].replace("$", "");
                    toplam = toplam + Integer.parseInt(eleman) * 3.2;
                } else {
                    String eleman = tablo[satir][sutun].replace("€", "");
                    toplam = toplam + Integer.parseInt(eleman) * 4.2;
                }

            }

        }

        System.out.println("toplam = " + toplam);

    }
}
