import java.util.Scanner;
public class add_two_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Sum of two numbers is: "+ (a+b));
        sc.close();
    }
}
