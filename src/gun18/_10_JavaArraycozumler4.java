package gun18;

public class _10_JavaArraycozumler4 {
    public static void main(String[] args) {
////1
//        Scanner read = new Scanner(System.in);
//        String[] arr = new String[5];
//
//        String max = "";
//        for (int i = 0; i < 5; i++) {
//
//            System.out.print("Bir kelime giriniz:");
//            arr[i] = read.nextLine();
//        }
//
//        for (int j = 0; j < arr.length; j++) {
//
//            if (arr[j].length() > max.length())
//                max = arr[j];
//        }
//
//
//
//        char[] ch = max.toCharArray();
//
//
//        if (ch[0] >= 'a' && ch[0] <= 'z') {
//            ch[0] = (char) (ch[0] - 'a' + 'A');
//        } else {
//            if (ch[0] >= 'A' && ch[0] <= 'Z')
//                ch[0] = (char) (ch[0] + 'a' - 'A');
//
//            if (ch[max.length() - 1] >= 'a' && ch[max.length() - 1] <= 'z') {
//                ch[max.length() - 1] = (char) (ch[max.length() - 1] - 'a' + 'A');
//            } else if (ch[max.length() - 1] >= 'A' && ch[max.length() - 1] <= 'Z')
//                ch[max.length() - 1] = (char) (ch[max.length() - 1] + 'a' - 'A');
//
//
//        }
//        System.out.println(ch);

//        //2- Kullanıcıdan alacağınız bir cümlenin sadece ilk harflerini bir diziye atayınız.
//
//        Scanner oku=new Scanner(System.in);
//        System.out.println("bir cumle yaziniz=");
//        String str= oku.nextLine();
//        String[] kelimeler=str.split(" ");
//        String[] yeni = new String[kelimeler.length];
//        for (int i = 0; i < kelimeler.length; i++) {
//            yeni[i]= kelimeler[i].substring(0,1);
//
//        } System.out.println("yeni = " + Arrays.toString(yeni));
////2. yontem
//        for (int i = 0; i < kelimeler.length; i++) {
//            char basharf= kelimeler[i].charAt(0);
//            System.out.print(basharf);
//        }

//       3
//        Scanner oku=new Scanner(System.in);
//        System.out.println("bir cumle yaziniz=");
//        String str= oku.nextLine();
//        String[] kelimeler=str.split(" ");
//
//        System.out.print(Arrays.toString(kelimeler));
//    }
//}
//
//  4.kullanicidan alacaginiz bir cumleyi kelimelerine gore tersten yazdiriniz
//
//        Scanner oku=new Scanner(System.in);
//        System.out.println("bir cumle yaziniz=");
//        String str= oku.nextLine();
//        String[] kelimeler=str.split(" ");
//
//        String[] yeni=new String[kelimeler.length];
//        int j=0;
//        for (int i= kelimeler.length-1;i>=0;i--){
//
//            yeni[j]= kelimeler[i];
//            j++;
//
//        }
//        System.out.println(Arrays.toString(yeni));

//5
//        String str = "Removes white space from both ends of a string";
//
//        String[] kelimeler = str.split(" ");
//        int sayac=0;
//        for (int i = 0; i < kelimeler.length-1; i++) {
//            if (!kelimeler[i].equals(""))
//        sayac++;
//        }
//        System.out.println("kelime sayisi"+ sayac);

//6
//        String str = "Hello World";
//        String yeni ="";
//        for (int i = str.length()-1 ; i >= 0; i--) {
//            yeni += str.charAt(i);
//        }
//        System.out.println("Tersi = " + yeni);

// 7
//        int[] arr={25,30,30,35,100};
//        int toplam=0;
//        for (int i=0;i<=arr.length-1;i++){
//            toplam+=arr[i];
//
//        }
//        System.out.println("toplam = " + toplam);

//8
//        int[] arr = {13, 15, 14, 16, 16};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("elemanlar = " + arr[i]);
//        }
//9
//   String[] str={"new jersey" , "new york", "boston","California",};
//   int kelime=0;
//   for (int i = 0; i < str.length ; i++) {
//            if (str[i] !="")
//                kelime++;
//        }
//        System.out.println("kelime sayisi = " + kelime);

//10
//String[] dizi={"Apple" ,"Orange"  ,"Babana", "Kiwi"};
//        for (String s : dizi) {
//            System.out.println("kelimeler = " + s);
//        }

//11
//        int[] dizi={12, 14 , 21 ,23 , 10 ,4};
//        int toplam=0;
//        for (int i: dizi) {
//            toplam+=i;
//        }
//        System.out.println("ortalama = " + toplam/ dizi.length);
// 12
//        int[] array = {1, 2, 3, 4};
//        int[] yeni = {array[0], array[array.length - 1]};
//        System.out.println(Arrays.toString(yeni));

//13
//        int[] arr = {5, 6, 8, 12, 14, 19};
//        int toplam = 0;
//        for (int j : arr) {
//            if (j % 2 == 0)
//                toplam += j;
//            else toplam -= j;
//        }System.out.println("toplam = " + toplam);

//14
//        int[] arr = {15, 25, 22, 18, 30};
//        Arrays.sort(arr);
//        int enb = arr[0];
//        int sayac=0;
//        for (int j : arr) {
//            if (j > enb) {
//                enb = j;
//                sayac++; }
//        }System.out.println("arr[i] = " + arr[sayac-1]);

// 15
//        int[] arr = {14, 19, 5, 21};
//        Arrays.sort(arr);
//        int enk = arr[0];
//        for (int j : arr) {
//            if (j < enk)
//                enk = j;
//            }
//            System.out.println("enkucuk = " + enk);

//16
//        int[] arr = {12,2,5,15,8};
//        int enb = arr[0];
//        for (int j : arr) {
//            if (j > enb)  enb = j;
//
//        }System.out.println("En buyuk = " + enb);

//17
//        String[] arr = {"Apple", "Orange", "Banana", "Pineapple"};
//        String k = "Apple";
//
//        for (String i : arr) {
//            if (i == k) System.out.println("True");
//        }

//18
        String arr = "$12 $23 $10 $2 $5 $2";
        String[] sayi = arr.split(" ");
        int toplam = 0;
        for (int i = 0; i < sayi.length; i++) {
            toplam += Integer.parseInt(sayi[i].replace("$", ""));
        } System.out.println("toplam = " + toplam);


    }
}
