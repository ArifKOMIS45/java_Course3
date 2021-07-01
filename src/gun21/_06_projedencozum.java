package gun21;

import java.util.Arrays;

public class _06_projedencozum {
    public static void main(String[] args) {
 /*
       Verilen int array


       duplicated(tekrarlanan) öğeleri array den kaldır

      non-duplicated(tekrarlanmayan) öğe sayisini print et

       Örnek:

       Array is 1,2,2,2,3,3,3,4,4,4,5,5,5 => 1,2,3,4,5

       //1 2 2 2 3 3 3 4 4 4 5 5 5

       result  5 olmalı

       NOT: resultu print ederken for loop kullanmayın
       System.out.println(Arrays.toString(your_array_name));  kullanın
    */

//        Scanner scan = new Scanner(System.in);
//
//        String myStr = scan.nextLine();
//
//        String[] arr = myStr.split(" ");



//        for(int i = 0 ; i < useThisArray.length ; i++){
//
//            int num = Integer.parseInt(arr[i]);
//
//            useThisArray[i] = num;
//
//        }

//        code start here
//        dont change anything before this line
//        your Array is useThisLine

        // Kodlamaya burdan başla.bu satırdan önceki satirlarda hicbirşeyi  degiştirme.
        //   useThisLine arrayini kullan


        // bu dizideki tekrarlayanlar çıkarıldıktan sonra kalanları sayısı

        int[] useThisArray = {1,2,2,2,3,3,3,4,4,4,5,5,5};
        int miktar=0;
        boolean tekrarVar=false;

        for(int i=0; i< useThisArray.length;i++)
        {
            tekrarVar=false;
            for(int j=i+1; j < useThisArray.length; j++)
            {
                if (useThisArray[i]==useThisArray[j]) // tekrar ediyor demektir
                {
                    tekrarVar = true;
                    break;
                }
            }

            if (!tekrarVar)
                miktar++;
        }

        System.out.println("miktar = " + miktar);


        // yeni dizi olarak tekrarsızları bulma
        int[] tekrarsizDizi=new int[miktar];
        int yeniDiziIndex=0;
        for(int i=0; i< useThisArray.length;i++)
        {
            for(int j=i+1; j < useThisArray.length; j++)
            {
                if (useThisArray[i]==useThisArray[j]) // tekrar ediyor demektir
                {
                    tekrarVar = true;
                    break;
                }
            }

            if (!tekrarVar) // tekrar yoksa
                tekrarsizDizi[yeniDiziIndex++]=useThisArray[i];
            else // tekrar edenler
            {
                // tekrarı bulunan eleman yeni dizi de yok ise atıver

                boolean varMi=false;
                // yeni dizide yok ise
                for(int k=0;k< tekrarsizDizi.length;k++)
                {
                    if (tekrarsizDizi[k] == useThisArray[i])
                    {
                        varMi=true;
                        break;
                    }
                }
                // yukarıdaki for un sonucunda bu eleman daha önce atılmamışsa
                // yani
                if (!varMi) // eleman yok ise at
                    tekrarsizDizi[yeniDiziIndex++]=useThisArray[i];


            }


        }


        System.out.println("tekrarsizDizi = " + Arrays.toString(tekrarsizDizi));





    }
}
