package gun38.finalModifier.Ornek2;

public class Person {
   String isim;
   static int sayac= 1;
   final int tcNo=sayac;

    public Person(String isim) {
        this.isim = isim;
        sayac++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
