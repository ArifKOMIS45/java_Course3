package gun21;

public class _02_Tablo1 {
    public static void main(String[] args) {
        //  {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}  int 2D arrayini  olustur
        //   2D arrayinden max number print et

        int[][] tablo = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 10, 3}};

        int max = tablo[0][0];//1 yani ilk elemani atadik
        for (int i = 0; i < tablo.length; i++) { //tablo.lenght;satir sayisini erir

            for (int j = 0; j < tablo[i].length; j++) {// her satirin uzunlgunu verir

                if (tablo[i][j] > max) max = tablo[i][j];
            }
        }
        System.out.println("max = " + max);


    }
}
