package gun37.DigerErisimler.Private;

public class Calisan {

    int id;
    String name;
    String surName;
   private String password;


    public void sifreBelirle(String sifre){
        if (sifre.length()>=8 ){
            this.password=sifre;
        }else {
            System.out.println("En az8 karakter olmali");
        }
        }

    public void sifreGoster(){
        System.out.println("****"+ password.substring(4));
    }

}
