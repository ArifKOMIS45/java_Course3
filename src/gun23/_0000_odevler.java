package gun23;

public class _0000_odevler {
    public static void main(String[] args) {
//1
//        randomNum(7);
//
// 2
//        String cumle = "Ben Java'yı seviyorum";
//        System.out.println(ortaKelime(cumle));
//
//        //3
//        String cumle = "Hello world";
//        reverseString(cumle);
//
//        4
//        String cumle = "Hello world";
//        reverseWord(cumle);
//
//        5
//        String str="6678421312";
//        EvenOddNums(str);
//
//        6
//        tersi(123);
//
//        7
//        System.out.println(powerOfThree(81));
//
//        8
//        int[] a={1,2,3,4,5};
//        int[] b={6,7,8,9};
//        append(a,b);
//
//        int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
//        int[] list1 = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
//        isUnique(list);
//        isUnique(list1);
//
//
//    }
//
//        public static void randomNum(int max){
//
//        max= (int) (Math.random()*max);
//        System.out.println(max);
// }
//    public static String ortaKelime(String a) {
//        String[] kelimeler = a.split(" ");
//        int ortaKelime = (kelimeler.length - 1) / 2;
//
//        for (int i = 0; i < kelimeler.length; i++) {
//            if (i == ortaKelime)
//                break; }
//        return kelimeler[ortaKelime]; }
//
//    public static String reverseString(String a) {
//        String tersi = "";
//        String yeni = "";
//        for (int i = 0; i < a.length(); i++) {
//            tersi = a.substring(a.length() - (i + 1), a.length() - i);
//            System.out.print(tersi); }
//        yeni = tersi.trim().replace("5", "");
//        return yeni;
//
//    public static void reverseWord(String a) {
//        String[] kelimeler = a.split(" ");
//        String yeni = "";
//        for (int i = kelimeler.length-1; i >=0; i--) {
//            yeni = kelimeler[i];
//            System.out.print(yeni+ " ");} }
//
//            public static void EvenOddNums(String str) {
//        int toplam = 0;
//        for (int i = 0; i < 10; i++) {
//            int a = Integer.parseInt(String.valueOf(str.charAt(i)));
//            if (a % 2 == 0) toplam += a;
//            else toplam -= a;
//        }
//        System.out.print(toplam);}
//    public static void tersi(int a) {
//        String uzunuk = String.valueOf(a);
//        int tersi;
//        System.out.print("sayinin tersi=");
//        for (int i = 1; i < a; i *= 10) {
//            tersi = a / i % 10;
//            System.out.print(tersi);
//        }}
//
//    public static boolean powerOfThree(int a) {
//        return a%3==0 ;    }
//
//    public static void append(int[] a, int[] b) {
//    int uz=a.length+ b.length;
//        int[] toplam=new int[uz];
//         int sira=0;
//        for (int i: a) {toplam[sira]=i; sira++;}
//        for (int i: b) {toplam[sira]=i; sira++;}
//        System.out.println(Arrays.toString(toplam));}
//    public static void isUnique(int[] arr) {
//    boolean a = true;
//
//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = 0; j < i ; j++) {
//                if (arr[i]==arr[j]){ a=false;break;} }
//            }
//
//                System.out.println(a);
}



}
