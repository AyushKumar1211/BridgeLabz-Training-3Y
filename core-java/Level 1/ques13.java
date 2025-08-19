import java.util.Scanner;

public class ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the perimeter of the Square: ");
        int peri = sc.nextInt();
        int side = peri/4;
        System.out.println("The length of the side is "+side+" whose perimeter is "+peri);
        sc.close();
    }
}
