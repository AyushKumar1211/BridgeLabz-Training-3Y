import java.util.Scanner;
public class OnlineShopingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char nextcustomer = 'y';
        while(nextcustomer=='y' || nextcustomer == 'Y'){
            System.out.println("Product Menu: ");
            System.out.println("1. DAC Connector 1300");
            System.out.println("2. Earphones 2000");
            System.out.println("3. Mobile case 1500");
            System.out.println("4. charger 1200");
            System.out.println("5. usb cable 950");
            System.out.println("6. mobile skins 900");
            int n;
            do{
                System.out.println("Enter the number of items you want to buy: ");
                n=sc.nextInt();
            }while(n<=0);
            int price =0;
            for(int i=0;i<n;i++){
                System.out.println("Enter choice of product: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                    price = price+1300;
                    break;
                    case 2:
                    price =price+2000;
                    break;
                    case 3:
                    price = price+1500;
                    break;
                    case 4:
                    price =price+1200;
                    break;
                    case 5:
                    price =price+950;
                    break;
                    case 6:
                    price =price+900;
                    break;
                    default:
                    System.out.println("You have selected the wrong item.");
                    break;
                }
            }
            if(price>5000){
                double Discount = price*0.1;
                System.out.println("Total Amount: "+price);
                System.out.println("Discounted Amount: "+Discount);
                System.out.println("Final Amount: "+(price-Discount));
            }
            else{
                System.out.println("Final Amount: "+price);
            }
            System.out.println("Next Customer (Y/N)?  ");
            nextcustomer=sc.next().charAt(0);
        }
    }
}
    