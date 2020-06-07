

import java.util.Scanner;

public class LeapYear
{
    public static void main(String[]args) {
        System.out.println("Detection of Leap year"); //this is leap year

        System.out.print("Enter the year of your choice  ");//
        //input by user is stored in year
        Scanner scanner = new Scanner(System.in);

       int year = scanner.nextInt();

        //Scan.close();

        /*if year is divisible by 4 || divisible by 400
        then it is a leap year
        * else not leap year*/

        {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))


                System.out.println("year "+year+ "is leap year");
            else
                System.out.println("year " +year+ " is not leap year");


        }



        }



    }










