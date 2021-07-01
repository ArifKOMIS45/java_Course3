package gun41.CreatingandFormating;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
//Localdate sinifi Sadece gun ay yil bilgisi tutar
        LocalDate tarih=LocalDate.now();

        System.out.println(LocalDate.now());
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfWeek()) = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfYear()) = " + tarih.getDayOfYear());

        System.out.println("tarih.format(DateTimeFormatter.ISO_DATE) = " + tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println("Full Locale.Germany= " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));

//Sistemde kullanilabilir lokalleri asidaki kod ile aldik,ilgili ulkeyi if ile bulduk
        Locale[] kullanilabilirLocaller=Locale.getAvailableLocales();
        for (Locale l:kullanilabilirLocaller) {
            if (l.getDisplayCountry().toLowerCase().contains("ice"))
            System.out.println("l.getDisplayCountry() = " + l.getDisplayCountry()+" "+l);
        }

        Locale localIzlanda=new Locale("is","IS");
        System.out.println("Full Locale.Germany= " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(localIzlanda)));


        LocalDate tarih1=LocalDate.of(2020,3,29);//tarif olusturabiliyorsun
        LocalDate tarih2=LocalDate.of(2020, Month.MARCH,29);

//istedigin formatta yzdirma
        DateTimeFormatter ozelFormat=DateTimeFormatter.ofPattern("EEEE dd.MM/yyyy");
        System.out.println("tarih = " + tarih.format(ozelFormat));


    }

}
