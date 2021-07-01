package gun14;

public class _00mentor {
    public static void main(String[] args) {
//        Scanner read=new Scanner(System.in);
//        System.out.print("bir sayi giriniz"); int sayi= read.nextInt();

        int sayi=(int)(Math.random()*20+1);//scanner kullanmadan da bu sayi kendisi verebilir

        if (sayi>0) {
            System.out.println(sayi + "" + "pozitif");

        }else if (sayi<0) {System.out.println(sayi+ "negatif");}

        else System.out.println(sayi + "sifir");





    }
}
