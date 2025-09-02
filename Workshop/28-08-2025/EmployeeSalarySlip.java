import java.util.Scanner;

public class EmployeeSalarySlip {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of Employees: ");
        int n =sc.nextInt();
        String[] names = new String[n];
        System.out.println("Enter the names of Employees: ");
        for(int i=0;i<n;i++){
            names[i] = sc.nextLine();
        }
        System.out.println("Enter the Salary of Employees: ");
        int[] basicSalary = new int[n];
        for(int i=0;i<n;i++){
            basicSalary[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            String name = names[i];
            int basic = basicSalary[i];
            double hra = 0.20 * basic;
            double da = 0.10 * basic;
            double netSalary = basic + hra + da;
            if (netSalary > 50000) {
                double tax = 0.10 * netSalary;
                netSalary -= tax;
            }
            System.out.println("====================================");
            System.out.println("Salary Slip for Employee: " + name);
            System.out.println("Basic Salary : " + basic);
            System.out.println("HRA (20%)    : " + hra);
            System.out.println("DA (10%)     : " + da);
            System.out.println("Net Salary   : " + netSalary);
            System.out.println("====================================");
        }
    }
}
