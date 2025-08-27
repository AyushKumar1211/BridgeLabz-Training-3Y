import java.util.Scanner;

public class RailwayReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = 5;
        int booked = 0;
        int waitingList = 0;
        System.out.println("Choose a Train:");
        System.out.println("1. Express (Fare: 500)");
        System.out.println("2. SuperFast (Fare: 800)");
        System.out.println("3. Rajdhani (Fare: 1200)");
        int choice = sc.nextInt();

        int fare;
        switch (choice) {
            case 1:
                fare = 500;
                System.out.println("You selected Express Train. Fare = " + fare);
                break;
            case 2:
                fare = 800;
                System.out.println("You selected SuperFast Train. Fare = " + fare);
                break;
            case 3:
                fare = 1200;
                System.out.println("You selected Rajdhani Train. Fare = " + fare);
                break;
            default:
                fare = 0;
                System.out.println("Invalid Choice!");
                return;
        }
        do {
            System.out.println("Enter number of passengers to book: ");
            int passengers = sc.nextInt();
            for (int i = 1; i <= passengers; i++) {
                if (booked < capacity) {
                    booked++;
                    System.out.println("Seat confirmed for Passenger " + i + ". Seat No: " + booked);
                } else {
                    waitingList++;
                    System.out.println("Passenger " + i + " added to Waiting List. WL No: " + waitingList);
                }
            }
            System.out.println("Total Booked Seats: " + booked);
            System.out.println("Total Waiting List: " + waitingList);
            if (booked < capacity) {
                System.out.println("Do you want to continue booking? (yes=1 / no=0)");
            } else {
                System.out.println("Train is FULL. Booking Closed.");
                break;
            }
        } while (sc.nextInt() == 1);
        sc.close();
    }
}
