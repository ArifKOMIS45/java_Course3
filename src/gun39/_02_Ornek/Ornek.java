package gun39._02_Ornek;

public class Ornek {
    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.ADMIN yetkili kullanıcıya
    // SILME işlemi kontrolü yapınız bir metod için.


    public static void main(String[] args) {
        User mudur=new User("Ragip",Role.ADMIN,Statu.AKTIF);
        User satis=new User("Hamza",Role.SATIS,Statu.AKTIF);
        User kul=new User("Necdet",Role.PERSONEL,Statu.PASIF);

        userSilme(mudur);//mudur admin yetkisi verirsek silme islemini yapar
        userSilme(satis);//silme yapamaz
        userSilme(kul);//silme yapamaz

    }
public static void userSilme(User kullanici){
        if (kullanici.role==Role.ADMIN){
            System.out.println("Silme islemi yapildi");
        }



}


}
