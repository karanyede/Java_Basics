public class Customer {
    private String Name;
    private String Number;
    private Car car;

    public Car getCar() {
        return car;
    }

    public String getNumber() {
        return Number;
    }

    public String getName() {
        return Name;
    }

    public Customer(String name, String number,Car car) {
        Name = name;
        Number = number;
        this.car = car;
    }
}
