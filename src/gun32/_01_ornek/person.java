package gun32._01_ornek;

public class person {
    String name;
    String surname;
    int age;

    public void BilgiYazdir() {

        System.out.println("Ad = " + name);
        System.out.println("Soyad = " + surname);
        System.out.println("Yas = " + age);
        System.out.println("--------------");
    }
    public void getBirthYear() {
        System.out.println(name.toUpperCase()+" "+surname.toUpperCase()+"'in "+"dogum yili= "+ (2021 - age)); }

    public void getInitials() {
        System.out.println(name.toUpperCase().charAt(0)+","+surname.toUpperCase().charAt(0));

    }



}
