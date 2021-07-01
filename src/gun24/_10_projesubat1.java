package gun24;

public class _10_projesubat1 {
   /* 1- Bizim 3 saatimiz vardir.Birinci saatimiz tam dogru çalismaktadir,
    ikincisi her 1 saatte  20 dakika geç kalmaktadir.
    Üçincüsü ise her 1 saatte 15 dakika ileri gitmektedir.
    Her üçüde saat 3 de çalistirilmaya baslandiginda,
    kaç saat sonra ayni saati gösterirler.Bu programi yaziniz.*/
   public static void main(String[] args) {

float ileriSaat=180;
float normalSaat=180;
float geriSaat=180;
 int sayac=0;
    do {
          ileriSaat+=75;
          normalSaat+=60;
          geriSaat+=40;

sayac++;

      }while ((ileriSaat/60)%12 !=(normalSaat/60)%12 || (ileriSaat/60)%12!=(geriSaat/60)%12);

    System.out.println("bulusma saati= "+sayac);


        }


}
