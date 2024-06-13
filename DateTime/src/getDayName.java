import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class getDayName {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println("Enter Date for getting Day Name Format (DD-MM-YYYY )");
        Scanner sc = new Scanner(System.in);
        String enterDate = sc.next();

        //constructor
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date = simpleDateFormat.parse(enterDate);

            //displaying full day name

            Format f = new SimpleDateFormat("EEEE");

            String printDay = f.format(date);


            System.out.println( "On this Date " + enterDate + " Day is " +printDay);
            // System.out.println(date);


        } catch (ParseException e) {
            throw new RuntimeException(e);
        }




    }
}
