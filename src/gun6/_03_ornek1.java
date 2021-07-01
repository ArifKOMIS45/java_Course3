package gun6;

public class _03_ornek1 {
    public static void main(String[] args) {
        int sayi = 5;
        System.out.println("sayi = " + sayi);
        
        char ilkHarf = 'A';
        // char tipinde veri saklandi. nasil saklandi?
        char basHarf = 65; // A=65,B,C......a=97,b,c //yukardaki islemler ayni

        System.out.println("ilkHarf = " + ilkHarf);
        System.out.println("basHarf = " + basHarf);


        String ilkHarf2 = "A";// bilgisayar kelimelerin bitisini saklamak zorunda
        // hafizaya yerlestirikenbunun "A"--> 'A'+'\n' burasi kelime sonu isareti
        String isim = "ahmet"; // ahmet +'\n' sinirini gosteren kelimenin sonunu gosteren isaret var

        ilkHarf = 'C';
//(65) ben buna 32 eklersem bu harfin kucuk halini bulurum
        char kucukHarf = (char) (ilkHarf + 32); // int-->char
        System.out.println("kucukHarf = " + kucukHarf);


        boolean acikMi = true;
        System.out.println("acikMi = " + acikMi);  // acikMi=true
        

    }

}
