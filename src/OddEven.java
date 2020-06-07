import java.util.Scanner;

public class OddEven
{

public static void main(String[] args)
    {
        System.out.println("Detect odd even number");  //this is odd even program

        System.out.print("Enter an integer number of your choice : " ); //enter the number of your choice
        //input by user is stored in num

        Scanner scanner = new Scanner(System.in);

        int num = scanner. nextInt();

        /*if number is divisible by 2 then it is an even number
        *else odd number*/

        if(num%2 == 0)

         System.out.println("Entered number is even");

         else
             System.out.println("Entered Number is odd");
    }



}




