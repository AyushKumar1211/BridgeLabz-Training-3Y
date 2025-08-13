import java.util.Scanner;
public class vol_of_cyl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a Cylinder: ");
        int r =sc.nextInt();
        System.out.println("Enter the height of a Cylinder: ");
        int h =sc.nextInt();
        System.out.println(Math.PI* (r*r)*h);
        sc.close();
    }
}
