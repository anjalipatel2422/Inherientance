import java.util.Scanner;

public class UpperLower
{
    public static void main(String[] args) {  //Createing main class
        Scanner scanner = new Scanner(System.in); // Creating object class for upper-lower case
        char ch = scanner.next().charAt(0);
        int a = (int ) ch; // converting character into integer
        a = (ch+32); //increase integer value by 32
        char ch1 = (char)a; //converting integer into character
        System.out.println(ch1); // print character into lower case
    }
}
