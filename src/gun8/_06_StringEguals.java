package gun8;

public class _06_StringEguals {
    public static void main(String[] args) {
         // iki stringin birbirine esit olup olmadigini kontrol eder
        //sonuc boolean olarak doner
        String s1="Merhaba";
        String s2="MERHABA";

        System.out.println("s1.equals(s2) = " + s1.equals(s2));//Esit mi?
        System.out.println("s1.equals(s2) = " + s1.equals("Merhaba"));// esit mi?

    }
}
