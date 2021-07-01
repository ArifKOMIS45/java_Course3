package gun38.StaticModifier.Ornek2;

public class Student {
    static int sayac = 0;
    int id;
    String ad;
    String soyad;

    public Student(String ad, String soyad) {
        this.id = ++sayac;
        this.ad = ad;
        this.soyad = soyad;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }
}
