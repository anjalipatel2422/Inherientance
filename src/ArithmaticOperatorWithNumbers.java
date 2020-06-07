import java.util.Scanner;

public class ArithmaticOperatorWithNumbers
{
    public static void main(String[] args) // to create main method
    {
        Scanner scanner = new Scanner(System.in); // creation of new scanner class
        System.out.println("Enter first number=  "); //user input's first number
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number=  ");// user input's the second number
        int num2 = scanner.nextInt();

        System.out.println("Enter the symbol(+ , - , * , / )");

        char symbol = scanner.next().charAt(0);
        if (symbol == '+')
        {
            System.out.println("The addition of number" +num1+ "and" +num2+ "is "+(num1+num2));

        }
        else if(symbol=='-')

        {
            System.out.println("The subtraction of number" +num1+ "and" +num2+ "is "+(num1-num2));

        }
        else if (symbol=='*')
        {
            System.out.println("The multiplication of number" +num1+ "and" +num2+ "is "+(num1*num2));
        }
        else if (symbol=='/')
        {
            System.out.println("The division of number" +num1+ "and" +num2+ "is "+(num1/num2));
        }


    }







}
