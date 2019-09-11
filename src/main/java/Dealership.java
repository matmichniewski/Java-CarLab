import behaviours.IParts;
import people.Customer;
import people.Dealer;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> vehicles;
    private Till till;
    private Dealer dealer;
    private ArrayList<Customer> customers;
    private ArrayList<IParts> parts;
    private String name;

    public Dealership(String name, Till till, Dealer dealer){
        this.name = name;
        this.till = till;
        this.dealer = dealer;
        this.customers = new ArrayList<Customer>();
        this.vehicles = new ArrayList<Vehicle>();
        this.parts = new ArrayList<IParts>();
    }

    public String getName() {
        return name;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public int numberOfVehicles(){
        return this.vehicles.size();
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public int numberOfCustomers(){
        return this.customers.size();
    }

    public void sell(Vehicle vehicle, Customer customer) {
        if(vehicles.contains(vehicle) && customers.contains(customer)){
            customer.buy(vehicle);
            vehicles.remove(vehicle);
            this.till.addMoney(vehicle.getPrice());
        }
    }

    public void addMoneyToTill(int amount) {
        this.till.addMoney(amount);
    }

    public void buy(Vehicle vehicle) {
        if(this.till.getMoney() >= vehicle.getPrice()){
            this.vehicles.add(vehicle);
            this.till.addMoney(- vehicle.getPrice());
        }
    }

    public void repairVehicle(Vehicle vehicle, int fixingCost) {
        if(vehicle.checkForDamage()){
            this.till.addMoney(-fixingCost);
            vehicle.fix(fixingCost);
        }
    }
}
