import org.omg.CORBA.WStringSeqHelper;

import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Roll No. ");
        int rollno = scanner.nextInt();

        System.out.print("marks of maths:       ");
        int maths = scanner.nextInt();
        System.out.print("marks of science:     ");
        int sci = scanner.nextInt();
        System.out.print("marks of english:     ");
        int eng = scanner.nextInt();
        System.out.print("marks of geography:   ");
        int geo = scanner.nextInt();
        int total = maths + sci + eng + geo;
        System.out.println("Total of marks:       " + total);
        double percentage = total / 4;
        System.out.println("percentage of marks:  " + percentage);

        if (percentage >= 80 && percentage < 100) {
            System.out.print("Grade: A+    pass");
        } else if (percentage >= 60 && percentage < 80) {
            System.out.print("Grade:  A    pass");
        } else if (percentage >= 50 && percentage < 60) {
            System.out.println("Grade:  B   pass");

        } else if (percentage >= 35 && percentage < 50) {
            System.out.println("Grade:  C    pass");
        } else if (percentage >= 0 && percentage < 35) {
            System.out.println("Fail;  ");
        } else
            System.out.println("invalid");
        }












}