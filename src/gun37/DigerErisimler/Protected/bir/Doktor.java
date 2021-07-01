package gun37.DigerErisimler.Protected.bir;

public class Doktor {
   protected String ad;//default gibi hemen hemen ayni paketten ulasilabiliyor ama disari vermiyor
    //eger private olsa ayni paket icinde bile ulasilmaz sadece kendi classin icinde calisir.


    protected Doktor() {

    }

    public Doktor(String ad) {
        this.ad = ad;
    }

    public void print(){
        System.out.println("ad = " + ad);
    }



}
