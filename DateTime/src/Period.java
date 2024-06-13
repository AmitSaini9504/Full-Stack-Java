import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Period {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println("Current Date : " + calendar.getTime());

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number : ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Day / month / Year ");
        String choice = sc.nextLine();

        switch (choice.toLowerCase()) {

            case "day":

                System.out.println("Plus (1) or minus(2)");

                int dayPlus = sc.nextInt();
                if (dayPlus == 1) {
                    calendar.add(Calendar.DATE, +num);
                    System.out.println(num + "Days later : " + calendar.getTime());
                } else if (dayPlus == 2) {
                    calendar.add(Calendar.DATE, -num);
                    System.out.println(num + "Days ago : " + calendar.getTime());

                }

                break;

            case "month":

                System.out.println("Plus (1) or minus(2)");

                int monthPlus = sc.nextInt();
                if (monthPlus == 1) {
                    calendar.add(Calendar.MONTH, +num);
                    System.out.println(num + "Month later : " + calendar.getTime());
                } else if (monthPlus == 2) {
                    calendar.add(Calendar.MONTH, -num);
                    System.out.println(num + "Month ago : " + calendar.getTime());

                }
                    break;

            case "year":

                System.out.println("Plus (1) or minus(2)");

                int YearPlus = sc.nextInt();
                if (YearPlus == 1) {
                    calendar.add(Calendar.YEAR, +num);
                    System.out.println(num + "Year later : " + calendar.getTime());
                } else if (YearPlus == 2) {
                    calendar.add(Calendar.YEAR, -num);
                    System.out.println(num + "Year ago : " + calendar.getTime());

                }
                        break;
        }

    }

    }




