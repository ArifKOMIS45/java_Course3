package gun17;

public class _05_javaNestedLoop {
    public static void main(String[] args) {

        // Aşağıdaki görüntüyü veren programı yazınız
        //     *    1. satirda 4 bosluk 1 yildiz
        //    **    2. satirda 3 bosluk 2 yildiz
        //   ***    3. satirda 2 bosluk 3 yildiz
        //  ****    4. satirda 1 bosluk 4 yildiz
        // *****    5. satirda 0 bosluk 5 yildiz

        for (int satir = 1; satir <= 5; satir++)
        {
//            for (int bosluk =1; bosluk <=satir ; bosluk++)//bu degisik bir sekil cikariyor
//               System.out.print(" ");
            for (int bosluk =1; bosluk<=5-satir ; bosluk++)
                System.out.print(" ");

            for (int sutun=1;sutun<=satir;sutun++)//yildizlar icin
                System.out.print("*");

                System.out.println();
        }


}}
