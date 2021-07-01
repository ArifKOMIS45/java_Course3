package gun41.CreatingandFormating;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class _04_ZonedDateTime {
    public static void main(String[] args) {
        //Baska zaman bolgesinin saat dilimlerini alma
        ZonedDateTime zdtLocal = ZonedDateTime.now();//lokal DateTime alir

        //Zonelari sistemden nasil alabilirim

        Set<String> zamanBolgeleri = ZoneId.getAvailableZoneIds();

        for (String z : zamanBolgeleri) {
            if (z.toLowerCase().contains("honol"))
                System.out.println("z = " + z);
        }

        ZoneId istenilenBolge = ZoneId.of("Pacific/Honolulu");
        ZonedDateTime ztd = ZonedDateTime.now(istenilenBolge);
        System.out.println("ztd = " + ztd);

        DateTimeFormatter gosterimSablonu = DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy HH:mm");
        System.out.println("ztd=  " + ztd.format(gosterimSablonu));
    }
}
