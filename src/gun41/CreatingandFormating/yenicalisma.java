package gun41.CreatingandFormating;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class yenicalisma {
    public static void main(String[] args) {
        String str="21/03/1976";
        LocalDate today=LocalDate.now();
        DateTimeFormatter ozelFormat=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        today.format(ozelFormat);
        LocalDate tarih=LocalDate.parse(str,ozelFormat);
       int fark= today.compareTo(tarih);
        System.out.println(fark);
    }
}
