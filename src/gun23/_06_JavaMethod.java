package gun23;

public class _06_JavaMethod {

    public static void main(String[] args) {
        ortalamaBulYaz("Ali",60,80,85,95,100,60);
        ortalamaBulYaz("veli",60,90,85,60);
        ortalamaBulYaz("Ayse",65,86,75,90,50,40);
        ortalamaBulYaz("Ahmet",45,78,85);

        ortalamaBulYaz(45,45,78,85,90);



    }
    //...ile ilgili 2 kural var
    //1- Bir metodda paramete olarak sadece 1 tane olabilir.
    //2- Her zaman son parametre olmali
    public static void ortalamaBulYaz(String isim,int...notlar){

        int toplam=0;
        for (int not:notlar)
        {
        toplam+=not;
        }
        System.out.println(isim+ "="+ toplam/ notlar.length);
    }
    public static void ortalamaBulYaz (int yas,int...notlar){




    }
}