import java.util.Scanner;

public class SellerSlip {
    public static void main(String[] args)  // Creating main method

    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sale ID:  ");
        int num = scanner.nextInt();
        System.out.print("Enter Sellar's Name: ");
        char name = scanner.next().charAt(0);

        System.out.print("salary basic: ");
        int basic = scanner.nextInt();

        System.out.print(" sales amount:  ");
        int amu = scanner.nextInt();
        // System.out.print("sales commission:  ");

        double sales_comission;

        if (amu >= 50000) {
            sales_comission = amu * 0.35;
            System.out.println(name + "sales comission is:  " + sales_comission);
        } else if (amu >= 30000) {
            sales_comission = amu * 0.2;
            System.out.println(name + "sales comission is:  " + sales_comission);
        } else if (amu >= 20000) {
            sales_comission = amu * 0.1;
            System.out.println(name + "sales comission is:  " + sales_comission);
        } else if (amu >= 10000) {
            sales_comission = amu * 0.05;
            System.out.println(name + "sales comission is:  " + sales_comission);
        } else {
            sales_comission = amu * 0.02;
            System.out.println(name + "sales comission is:  " + sales_comission);

        }
    }

}











