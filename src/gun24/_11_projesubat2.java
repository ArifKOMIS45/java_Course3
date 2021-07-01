package gun24;

public class _11_projesubat2 {

   public static void main(String[] args) {
       /*Bir top 220m yükseklikten atilmaktadir. Atildiktan sonra,
       atildigi yüksekligin ¾ ü kadar yerden yukari dogru ziplamaktadir.
       Top ziplama  yüksekligi 1 metrenin altina indiginde durmaktadir.
       Bu ana kadar aldigi yolu ve yere vurma sayisini bulunuz.*/

       int vurmaSayisi=0;
       double alinanYol=0;
       for (double i =220; i >=1 ; i=i-(i*0.25)) {

            alinanYol+=i+i-(i*0.25);
           vurmaSayisi++;
       }
       System.out.println("Vurma Sayisi = " + vurmaSayisi+ " defa");
       System.out.println("Alinan Yol = " + (int)alinanYol+ " metre");
        }


}
