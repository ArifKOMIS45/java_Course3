package gun8;

public class _08_StringIndexOf {
    public static void main(String[] args) {
        // Verilen karakter veya karakterlerin stiring icindeki index nosunuzu verir
        //contaons size var veya yok diyordu bu ise indexini veriri,yok ise -1 verir
        // ayni karakterden fazla olursa ilkini verir.
        String s1="Merhaba Dunya";
        System.out.println("s1.indexOf(e) = " + s1.indexOf("e"));
        System.out.println("s1.indexOf(ha) = " + s1.indexOf("ha"));
        System.out.println("s1.indexOf(ny) = " + s1.indexOf("ny"));
        System.out.println("s1.indexOf() = " + s1.indexOf(" "));
        System.out.println("s1.indexOf(k) = " + s1.indexOf("k"));
        System.out.println("s1.indexOf(A) = " + s1.indexOf("A"));






    }
}
