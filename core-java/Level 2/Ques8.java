import java.util.*;
public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        double a= sc.nextDouble();
         System.out.println("Enter the value of b: ");
        double b = sc.nextDouble();
         System.out.println("Enter the value of c: ");
         double c = sc.nextDouble();
        System.out.println("The results of Int Operations(a + b *c, a * b + c, c + a / b, and a % b + c.) are "+(a + b *c)+", "+(a * b + c)+",and "+(a % b + c));
         sc.close();
    }
}
