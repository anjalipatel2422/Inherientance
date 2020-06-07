import java.util.Scanner;

public class NameOfCity
{
    public static void main(String[] args)   //  Craeteing main method
    {
        System.out.println("Enter any first alphabate  "); // User enters the alphabate
        Scanner scanner = new Scanner(System.in);  // Creates object for class
        char first = scanner.next().charAt(0);
        if (first=='A') //apply if - else condition
        {
            System.out.print(  "Ahmedavad"); // print out of condition
        }
        else if (first == 'B')
        {
            System.out.print("Bhavnagar");
        }
        else if (first == 'C')
        {
            System.out.print("Chennai");
        }
        else if(first == 'D')
        {
            System.out.print("Delhi");
        }
        else if(first == 'E')
        {
            System.out.print("Elora");
        }
        else if (first =='F')
        {
            System.out.print("Fatehpur");
        }
        else
        {
            System.out.print("In valid entry");
        }






    }






}