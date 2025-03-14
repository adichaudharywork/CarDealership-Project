package CarDealership;

public class Customers {
    private String name;
    private String address;
    private double cashInHand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address+="dealership city";
        this.address = address;
    }

    public double getCashInHand() {
        return cashInHand;
    }

    public void setCashInHand(double cashInHand) {
        cashInHand+=500;
        this.cashInHand = cashInHand;
    }

    public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance){
        emp.handleCustomer(this,finance,vehicle);

    }
}
