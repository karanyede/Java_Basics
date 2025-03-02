import java.util.*;

public class GarageServices {
    private Map<String,Customer> customerMap;
    private List<Service> AvailableServices;

    public GarageServices() {
        customerMap = new HashMap<>();
        AvailableServices = new ArrayList<>();
        LoadServices();
    }

    public void LoadServices()
    {
        AvailableServices.add(new Service("Car wash",500));
        AvailableServices.add(new Service("Oil Change",700));
        AvailableServices.add(new Service("Wheel Alignment",300));
        AvailableServices.add(new Service("Tyre Replacement",3000));
        AvailableServices.add(new Service("Car Puncture",100));


    }
    public void addCustomer(String name, String phoneNo, String carNumber, String Model){
        Car car= new Car(carNumber,Model);
        Customer customer= new Customer(name,phoneNo,car);
        customerMap.put(carNumber,customer);
        System.out.println("Customer Added Successfully!");
    }
    public void createInvoice(String carNumber){
        if(!customerMap.containsKey(carNumber))
        {
            System.out.println("No Customer Found with Car Number "+carNumber);
            return;
        }

        Scanner sc = new Scanner(System.in);
        Customer customer= customerMap.get(carNumber);
        Invoice invoice = new Invoice(customer);

        System.out.println("Available Services:");
        for (int i=0;i<AvailableServices.size();i++)
        {
            System.out.println((i+1)+". "+AvailableServices.get(i).getName()+" - ₹"+
                    AvailableServices.get(i).getPrice());
        }
        while(true)
        {
            System.out.println("Enter Service Number to add(or 0 to Finish)");
            int Choice= sc.nextInt();
            if (Choice==0) break;
            if(Choice>0 && Choice<=AvailableServices.size())
            {
                invoice.addService(AvailableServices.get(Choice-1));
                System.out.println("Service Done");
            }
            if(Choice>AvailableServices.size()) {
                System.out.println("Invalid Choice");
            }

        }
        invoice.printInvoice();
    }

}
