import java.util.Scanner;

public class IntigerProperty
{
    public static void main(String[] args) { // Createing main method
        System.out.println("Enter the number of your chice"); // user inputs the number of his choice
        Scanner scanner = new Scanner(System.in); // Createing new Object for class
        int number = scanner.nextInt();
        if (number>0)  // Appling if - else condition
        {
            System.out.println(" The number is positive   ");
        }
        else if (number<0)
        {
            System.out.println("The number is nagative");
        }
        else
        {
            System.out.println("The number is Zero");
        }
    }


}
