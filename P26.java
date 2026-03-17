import java.util.Scanner;

class Payment{
    void processPayment(int amount){
        System.out.println("Processing payment...");
    }
}

class CreditCardPayment extends Payment{
    void processPayment(int amount){
        System.out.println("Payment of Rs. " + amount + " done Using Credit Card");
    }
}

class UPIPayment extends Payment{
    void processPayment(int amount){
        System.out.println("Payment of Rs. " + amount + " done using UPI");
    }
}

public class P26{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Preksha Patel");
        System.out.println("240390107031");
        System.out.println("Enter Payment Method");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");

        int choice = sc.nextInt();

        System.out.println("Enter Amount");
        int amount = sc.nextInt();

        if(choice == 1){
            CreditCardPayment c = new CreditCardPayment();
            c.processPayment(amount);
        }
        else if(choice == 2){
            UPIPayment u = new UPIPayment();
            u.processPayment(amount);
        }
        else{
            System.out.println("Invalid Choice");
        }
    }
}