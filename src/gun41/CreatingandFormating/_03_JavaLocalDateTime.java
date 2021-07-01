package gun41.CreatingandFormating;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _03_JavaLocalDateTime {
    public static void main(String[] args) {
        //Tarih ve saat bilgisi tutar

        LocalDateTime dt=LocalDateTime.now();
        System.out.println("dt = " + dt);
        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("dt.getMonth() = " + dt.getMonth());
        System.out.println("dt.getMinute() = " + dt.getMinute());
        System.out.println("dt.getHour() = " + dt.getHour());

        System.out.println("Short) = " + dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        
        
    }
    
}
