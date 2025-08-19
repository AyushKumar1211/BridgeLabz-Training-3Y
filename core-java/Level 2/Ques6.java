import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        int quot = num1/num2;
        int rem = num1%num2;
        System.out.println("The Quotient is "+quot+" and Reminder is "+rem+" of two number "+num1+" and "+num2);
        sc.close();
    }
}
