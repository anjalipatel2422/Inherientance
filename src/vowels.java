import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class vowels
{
    public static void main(String[] args) // main method
    {
        Scanner scanner = new Scanner((System.in)); //createing class
        System.out.print("Enter any alphabate   ");  // user enters the alphabet of his choice
        char ch = scanner.next().charAt(0);
        if(ch == 'a' || ch=='e' || ch =='i' || ch == 'o' || ch == 'u')

        {
            System.out.println(ch+     "  is vowel" );
        }
        else

        System.out.println(ch+   "  is consonant");
    }
}
