package CarDealership;

public class Employee {
    public void handleCustomer(Customers cust, boolean finance,Vehicle vehicle){
          if(finance==true){
              double loan=vehicle.getPrice()-cust.getCashInHand();
              runCreditHistory(cust,loan);

          }else if(vehicle.getPrice()<= cust.getCashInHand()){
              processTranscation(cust,vehicle);
          }else{
              System.out.println("Customer will need more money");
          }
    }
    public void runCreditHistory(Customers cust,double loan){
        System.out.println("Ran Credit Check");
        System.out.println("Loan of "+ loan +" Approved");



    }
    public void processTranscation(Customers cust,Vehicle vehicle){
        System.out.println("Customer has purchased the vehicle: "+ vehicle+" for the price "+vehicle.getPrice());
    }
}
