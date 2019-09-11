package people;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer extends Person {

    private double wallet;
    private ArrayList<Vehicle> vehicles;

    public Customer(String name, double wallet){
        super(name);
        this.wallet = wallet;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public int numberOfVehicles(){
        return this.vehicles.size();
    }

    public void buy(Vehicle vehicle){
        this.vehicles.add(vehicle);
        this.wallet -= vehicle.getPrice();
    }
}
