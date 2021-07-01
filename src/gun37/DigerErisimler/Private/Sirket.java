package gun37.DigerErisimler.Private;

public class Sirket {
    public static void main(String[] args) {
       Calisan isci = new Calisan();
        isci.id = 1;
        isci.name = "Gulcan";
        isci.surName = "Demir";
       // isci.password="1234";//bu direk kullanilmasin

        isci.sifreBelirle("1a4f_67dfgh");

        //System.out.println(isci.password);
       // isci.password="1234";//hala kullaniyor
    //private yazinca kullanamaz artik

        isci.sifreGoster();

    }


}
