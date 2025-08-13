import java.util.Scanner;
import java.lang.Math;
public class Area_of_cricle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        int r =sc.nextInt();
        System.out.println(Math.PI* (r*r));
        sc.close();
    }
}
