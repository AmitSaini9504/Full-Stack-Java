import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Example3 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();

        String d2 = d1.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("Date is String "+d2);


       

    }
}
