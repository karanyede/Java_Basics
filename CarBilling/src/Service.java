public class Service {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Service(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
