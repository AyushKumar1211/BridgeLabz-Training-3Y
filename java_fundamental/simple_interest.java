import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount : ");
        int a =sc.nextInt();
        System.out.println("Enter the rate of interest : ");
        int r =sc.nextInt();
        System.out.println("Enter the time: ");
        int t =sc.nextInt();
        System.out.println((t*r*a)/100);
        sc.close();
    }
}
