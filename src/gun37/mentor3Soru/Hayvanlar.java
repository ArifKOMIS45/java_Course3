package gun37.mentor3Soru;

public class Hayvanlar {
    String hayvan;
    int yasi;
    String renk;

    public void tercihler(String hayvan){

     if (hayvan.equalsIgnoreCase("kedi")){
         System.out.println("""
                 hangi hayvan: kedi
                      yaş : 4
                      renk : beyaz  \s""");}


     else if (hayvan.equalsIgnoreCase("kopek")){
         System.out.println("""
                 hangi hayvan: köpek
                     yaş : 3
                     renk : siyah  \s""");
               } else {
         System.out.println("Barınağımızda böyle bir hayvan bulunmamaktadır..");
     }

    }
}
