import java.util.Scanner;

public class peri_of_rec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of rectangle: ");
        int l =sc.nextInt();
        System.out.println("Enter the width of rectangle: ");
        int b =sc.nextInt();
        System.out.println(2*(l+b));
        sc.close();
    }
}
