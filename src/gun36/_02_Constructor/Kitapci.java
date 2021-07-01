package gun36._02_Constructor;

public class Kitapci {
    // Ayrı bir Book class ı yazınız.fields: name,publishYear,autor.
    // 3 adet Consructor ekleyiniz.
    // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
    // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.
    public static void main(String[] args) {
        book kitap1 = new book("leyleklerin Ucusu", 1998, "Jean Grange");
        book kitap2 = new book("Kizil nehirler", 2001);
        book kitap3 = new book("Mafia");

        kitap1.showInfos();
        kitap2.showInfos();
        kitap3.showInfos();


       System.out.println(kitap1.toString());

    }


}
