package vehicles;

import components.EngineType;
import components.Engine;
import components.Tyres;

public class Vehicle {

    private CarType type;
    private Engine engine;
    private Tyres tyres;
    private double price;
    private String colour;
    private String make;
    private boolean damage;



        public Vehicle(String make, CarType type, Engine engine, Tyres tyres, double price, String colour) {

            this.make = make;
            this.type = type;
            this.engine = engine;
            this.tyres = tyres;
            this.price = price;
            this.colour = colour;
            this.damage = false;
        }

    public CarType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public String getMake() {
        return make;
    }

    public boolean checkForDamage() {
            return this.damage;
    }

    public void damageVehicle(int damageValue) {
            this.damage = true;
            this.price -= damageValue;
    }

    public void fix(int fixingCost) {
            this.damage = false;
            this.price += fixingCost;
    }
}
