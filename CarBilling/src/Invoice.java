import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private  Customer customer;
    private List<Service> serviceList;
    private double totalAmount;

    public void addService(Service service){
        serviceList.add(service);
        totalAmount+=service.getPrice();
    }

    public Invoice(Customer customer) {
        this.customer = customer;
        this.serviceList = new ArrayList<>();
        this.totalAmount = 0;
    }

    public void printInvoice(){
        System.out.println("-----------Invoice-----------");
        System.out.println();
        System.out.println("Customer :"+customer.getName()+" | Phone : "+customer.getNumber()+" | Car : "+customer.getCar().getCarModel()+" | Number : "+customer.getCar().getCarNumber());
        System.out.println("---------------------------------");
        System.out.println("Services : ");
        System.out.println("----------");
        for(int i=0;i<serviceList.size();i++){
            System.out.println((i+1)+". "+serviceList.get(i).getName()+" ₹"+serviceList.get(i).getPrice());
        }
        System.out.println("---------------------------------");
        System.out.println("Total Ammount : ₹"+totalAmount);
        System.out.println("---------------------------------");
        System.out.println("----- Thank You Visit Again -----\n\n");
    }
}
