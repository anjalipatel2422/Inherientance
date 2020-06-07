import java.util.Scanner;

public class SubjectiveFailour
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Roll No. ");
        int rollno = scanner.nextInt();

        System.out.print("marks of maths:       ");  // user enters the  marks
        int maths = scanner.nextInt();
        System.out.print("marks of science:     ");  // user enters the marks
        int sci = scanner.nextInt();
        System.out.print("marks of english:     ");  // user enters the marks
        int eng = scanner.nextInt();
        System.out.print("marks of geography:   ");  // user enters the marks
        int geo = scanner.nextInt();
        int total = maths + sci + eng + geo;
        System.out.println("Total of marks:       " + total);
        double percentage = total / 4;
        System.out.println("percentage of marks:  " + percentage);
        if (maths<35 || sci<35 || eng<35 || geo<35)
        {
            System.out.println(" fail");
        }
        else if (maths>=35 && sci>=35 && eng>=35 && geo>=35)
        {
            System.out.println("pass");
        }
    }







}
