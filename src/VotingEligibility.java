
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[]args)
    {
        // Creat object for scanner class

        Scanner scanner = new Scanner(System.in);
          // user enters his age
        System.out.print("Enter your age   ");

        int age = scanner. nextInt();

        //check if age is greater then 18

        if (age>=18)
        {
            System.out.println("yuo are eligible to vote");
        }
        else
        {
            System.out.println("You are not eligible to vote ");   //you are younger
        }
    }
}
