import java.util.*;
public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a= sc.nextInt();
         System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
         System.out.println("Enter the value of c: ");
         int c = sc.nextInt();
        System.out.println("The results of Int Operations(a + b *c, a * b + c, c + a / b, and a % b + c.) are "+(a + b *c)+", "+(a * b + c)+",and "+(a % b + c));
         sc.close();
    }
}
