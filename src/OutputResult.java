import java.util.Scanner;

public class OutputResult{
    public static void main(String[] args) //creat main method
    {
        Scanner scanner = new Scanner(System.in); //createing object for scanner class
        System.out.println("Enter your value or character or symbol as per choice "); //user enter's number or character
        // or symbol
        char a = scanner.next().charAt(0);

        if ((a>='0') && a<='9') {// to apply if else condition
        System.out.println("charecter is number");

    }
    else if (a>= 'a' && a<= 'z' || a>='A' && a<='Z'){


            System.out.println("character is alphabet");
        }else{
            System.out.println("character is symbol");

    }
    }
}
