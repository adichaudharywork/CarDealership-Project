package CarDealership;

public class Dealership {
    public static void main(String[] args) {
        Customers cust1=new Customers();
        cust1.setName("aditya");
       cust1.setAddress("123 street");
       cust1.setCashInHand(16000);

       Vehicle vehicle =new Vehicle("honda","2015",14000);

       Employee emp1=new Employee();

       cust1.purchaseCar(vehicle,emp1,false);






    }
}
