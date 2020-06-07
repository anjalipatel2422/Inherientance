import java.util.Scanner;

public class SalarySlip
{
    public static void main(String[] args) // Creating main method
    {
        Scanner scanner = new Scanner(System.in); // Createing new class
        // Enter the Employee number
        System.out.println("Employee Id");

        int a = scanner.nextInt();
        // // Enter the Employee Name
        System.out.println("Name of Employee");
        char name = scanner.next().charAt(0);
        // Enter the  basic salary
        System.out.println("Basic pay");
        double basic = scanner.nextInt();
        //Calculation of HRA
        double hra=+0.1*basic;
        System.out.println("HRA  " + hra);
      // Calculation of DA
        double da = + 0.08*basic;
        System.out.println("DA  "    +da);
      //calculation of PF
        double pf = + 0.2*basic;
        System.out.println("PF   "  +pf) ;
        //Calculation of TA
        double ta = +0.09*basic;
        System.out.println("TA  "  +ta);
        //Calculation of Gross salary
        double grs = +basic+da+ta+hra;
        System.out.println("Gross salary  " +grs);
        //Calculation of Net salary
        double net = +grs-pf;
        System.out.println("Net salary  " +net);






    }






}
