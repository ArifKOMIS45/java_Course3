package gun13;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        //kullanicin girdigi gun sayisina karsilik gelen gunun adini yaziniz.
        //1. gun pazartesi olsun
        Scanner oku = new Scanner(System.in);
        System.out.print("gun no="); int gunNo= oku.nextInt();
       // if (gunNo==1) System.out.println("Pazartesi");
        //if...
        switch (gunNo){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamaba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatali giris");

        }



    }
}
