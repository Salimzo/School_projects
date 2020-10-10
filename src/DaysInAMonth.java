import java.util.Scanner;

public class DaysInAMonth {

    public static void main(String[] args) {

        // create scanner
        Scanner input = new Scanner(System.in);

        // prompts the user to enter inputs
        System.out.print("Year? : ");
        int year = input.nextInt();
        input.nextLine(); // remove the newline in the input buffer
        System.out.print("Month? (3 chars): ");
        String month = input.next();

        if(month.trim().length() != 3 || (year < 0 || year > 9999)) {
            System.out.println("Month does not exist");
        } else {
            int days = daysInAMonth(year, month.trim());
            if(days > 0) {
                System.out.printf("The month has %d days", days);
            } else {
                System.out.println("Month does not exist");
            }
        }
    }

    // find the number of days in a month
    static int daysInAMonth(int year, String month) {
        int days = -1;
        // lowercase month name
        month = month.toLowerCase();
        if(month.equals("jan") || month.equals("mar") || month.equals("may")
                || month.equals("jul") || month.equals("aug") || month.equals("oct")
                || month.equals("dec")) {
            days = 31;

        } else if(month.equals("apr") || month.equals("jun")
                || month.equals("sep") || month.equals("nov")) {
            days = 30;
        } else if(month.equals("feb")) {
            // check for leap year
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                days = 29;
            } else {
                days = 28;
            }
        }
        return days;
    }

}
