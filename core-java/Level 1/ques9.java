import java.util.Scanner;
public class ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fees value: ");
        int fee = sc.nextInt();
        System.out.println("Enter the Discount percentage: ");
        int discount_percent = sc.nextInt();
        int discount = ((fee*discount_percent)/100);
        System.out.println("The discount amount is INR "+discount +" and final discounted fee is INR "+(fee-discount));
        sc.close();
    }
}
