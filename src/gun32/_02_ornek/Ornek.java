package gun32._02_ornek;

public class Ornek {
// 1-Adım :Rectangle isminde ayrı bir dosyada olmak üzere sınıf yazınız.fields: width, length
    // 2-Adım :Çevre bulmak üzere getPerimeter isminde bir metod yazınız.
    // 3-Adım :Dikdörtgenin alanını bulan getArea isimli bir metod yazınız.

    public static void main(String[] args) {
        Rectangle dikdortgen=new Rectangle();
        dikdortgen.lenght=5;
        dikdortgen.width=4;

        System.out.println("Cevre= "+dikdortgen.Cevre());
        System.out.println("----------------------------");
        System.out.println("Alan= "+dikdortgen.Alan());



    }

}
