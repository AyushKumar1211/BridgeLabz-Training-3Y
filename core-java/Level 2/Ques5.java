import java.util.*;
public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units: ");
        int units = sc.nextInt();
        System.out.println("Enter the price of an item: ");
        int price = sc.nextInt();
        int total = price*units;
        System.out.println("The total purchase price is INR "+total+" if the quantity "+units+" and unit price is INR "+price);
        sc.close();
    }
}
