package gun21;

import java.util.Arrays;
import java.util.Scanner;

public class _04_tabloprojesorularicozum {
    public static void main(String[] args) {
        /*
      Bir veya daha fazla öğe iceren int array verildiğinde, arraydeki en büyük
      ve en küçük öğeler arasındaki farkı return edin.
      Not: the built-in    Math.min(v1, v2) ve   Math.max(v1, v2) methodları
      en küçük ve en büyük öğeleri return eder.

    bigDiff([10, 3, 5, 6]) → 10-3 result = 7
    bigDiff([7, 2, 10, 9]) → 10-2 result = 8
    bigDiff([2, 10, 7, 1]) → 10-1 result = 9

    return tipi  int dir
     */
        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();

        String[] strArr = myStr.split(" "); // 4 5 12 24

        int[] useThisArray = new int[strArr.length];

        for(int i = 0 ; i< strArr.length ; i++){
            useThisArray[i] =Integer.parseInt(strArr[i]);
        }
        // useThisArray[i] 4 5 12 34
        // Kodlamaya burdan başla.Bu satırdan önceki satırlarda hiçbirşeyi kaldırma ve degiştirme.
        // Kullanacağın array 27.ci satırda  --> useThisArray

        Arrays.sort(useThisArray);//kucukten buyuge siraladi
        int fark=useThisArray[useThisArray.length-1]-useThisArray[0];
        System.out.println("fark = " + fark);

        int enb=useThisArray[0];
        int enk=useThisArray[0];
        for (int i=0;i<useThisArray[i];i++)
        {
            if(enk>useThisArray[i]) enk=useThisArray[i];
            if (enb<useThisArray[i]) enb=useThisArray[i];
            
            
        }
        System.out.println("(enb-enk) = " + (enb-enk));

    }
}
