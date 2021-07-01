package gun11;

import java.util.Scanner;

public class _04_IfElse {

    public static void main(String[] args) {
    //Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        // hayır yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.println("Bir seyler yazin="); String girilen=oku.nextLine();


        if (girilen.length()>10 && girilen.contains("study")){
            System.out.println("evet");
        }
        else
        {
            System.out.println("Hayir");
        }
    }
}
