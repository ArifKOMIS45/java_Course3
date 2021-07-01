package gun17;

public class _04_javaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *   1.satir bi yildiz
        // **  2.satirda iki yildiz
        // *** 3.satirda 3 yildiz
        // **** 4.satirda dort yildiz
        // ***** 5. satirda bes yildiz

        for (int satir = 1; satir <= 5; satir++)
        {
            for (int sutun = 1; sutun <=satir ; sutun++)
                System.out.print("*");
            System.out.println();
        }
        //2. yontem
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                if (j <= i) System.out.print("*");
            }
            System.out.println();
        }

        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *****
        // ****
        // ***
        // **
        // *
        for (int satir = 1; satir <= 5; satir++)
            {
            for (int sutun = 5; sutun >= satir; sutun--)
                System.out.print("*");
            System.out.println();
             }


}}
