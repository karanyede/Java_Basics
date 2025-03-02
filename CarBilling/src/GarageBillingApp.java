import java.util.Scanner;

public class GarageBillingApp {
    public static void main(String[] args) {
        GarageServices garageServices = new GarageServices();
        Scanner sc = new Scanner(System.in);
        System.out.println("---------Karan Car Service Center---------");
        while(true)
        {
            System.out.println("1. Add Customer");
            System.out.println("2. Display Services");
            System.out.println("3. Exit");
            System.out.println("Enter Your Choice:- ");
            int Choice= sc.nextInt();
            switch (Choice){
                case 1:
                    System.out.println("Enter Customer Name: ");
                    String Name = sc.next();
                    System.out.println("Enter Phone Number: ");
                    String Number = sc.next();
                    System.out.println("Enter Car Number: ");
                    String carNumber = sc.next();
                    System.out.println("Enter Car Model: ");
                    String Model = sc.next();
                    garageServices.addCustomer(Name,Number,carNumber,Model);
                    break;
                case 2:
                    System.out.println("Enter Car Number: ");
                    String carNo = sc.next();
                    Car car;


                    garageServices.createInvoice(carNo);
                    break;
                case 3:
                    System.out.println("Exiting ... Thank You!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice. Try again.");
            }
        }
    }
}
