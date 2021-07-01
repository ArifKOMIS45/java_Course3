package gun41.CreatingandFormating;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_JavaLocalDate {
    public static void main(String[] args) {
//Tarih icermez sadeee saat,dak,san,nanosan icerir
        LocalTime saat = LocalTime.now();//o andaki saati aldi

        System.out.println("saat = " + saat);
        System.out.println("saat.getHour() = " + saat.getHour());
        System.out.println("saat.getMinute() = " + saat.getMinute());
        System.out.println("saat.getNano() = " + saat.getNano());

        DateTimeFormatter ozelformat = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println("saat.format(ozelformat) = " + saat.format(ozelformat));

        DateTimeFormatter ozelformat2 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("saat.format(ozelformat) = " + saat.format(ozelformat2));

        LocalTime saat2 = LocalTime.of(21, 12);//kendimizde saat olusturabiliyoruz
        LocalTime saat3 = LocalTime.of(23, 54, 44);


    }

}
