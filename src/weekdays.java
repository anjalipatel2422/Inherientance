import java.nio.file.Watchable;
import java.util.Scanner;

public class weekdays
{
    public static void main(String[] args) //to creat main method

    {
        Scanner scanner = new Scanner(System.in);// createing new week days scanner class
        System.out.println("Enter week days number 1 t0 7 "); // user enters the week days number
        int weekday = scanner.nextInt();
        if (weekday == 1) {
            System.out.println("monday");
        } else if (weekday == 2) {
            System.out.println("Tuesday");

        } else if (weekday == 3) {
            System.out.println("Wednesday");
        } else if (weekday == 4) {
            System.out.println("Thursday");

        } else if (weekday == 5) {

            System.out.println(" Friday");

        } else if (weekday == 6) {

            System.out.println("Saturday");
        } else if (weekday == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("expect of 1-7 number invalid day");

        }

    }

}