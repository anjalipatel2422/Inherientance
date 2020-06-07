import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        //Average on five numbers
        System.out.print("enter first number:   ");//Enter the number
        int num1 = scanner.nextInt();
        System.out.print("enter first number:   ");//Enter the number
        int num2 = scanner.nextInt();
        System.out.print("enter first number:   ");//Enter the number
        int num3 = scanner.nextInt();
        System.out.print("enter first number:   ");//Enter the number
        int num4 = scanner.nextInt();
        System.out.print("enter first number:   ");//Enter the number
        int num5 = scanner.nextInt();
        int total = num1+num2+num3+num4+num5;      //Total of the entered number
        System.out.println("Total =  "  +total);
        System.out.print("average of 5 numbers=   " +total/5);

    }





}
