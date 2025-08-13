import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int b =sc.nextInt();
        System.out.println("Enter the exponent number: ");
        int e =sc.nextInt();
        System.out.println(Math.pow(b,e));
        sc.close();
    }
}
