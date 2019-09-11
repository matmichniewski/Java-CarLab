import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import people.Dealer;
import vehicles.CarType;
import vehicles.Vehicle;
import components.EngineType;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Till till;
    Dealer dealer;
    Customer customer;
    Engine engine;
    Tyres tyres;
    Vehicle vehicle;

    @Before
    public void before(){
        engine = new Engine(200, EngineType.ELECTRIC);
        tyres = new Tyres("Pirelli", 18);
        vehicle = new Vehicle("Honda", CarType.VAN, engine, tyres, 5000, "yellow");
        dealer = new Dealer("John");
        customer = new Customer("Rana", 10000);
        till = new Till();
        dealership = new Dealership("Arnold", till, dealer);
    }

    @Test
    public void hasName(){
        assertEquals("Arnold", dealership.getName());
    }

    @Test
    public void canAddVehicle(){
        dealership.addVehicle(vehicle);
        assertEquals(1, dealership.numberOfVehicles());
    }

    @Test
    public void canAddCustomer(){
        dealership.addCustomer(customer);
        assertEquals(1, dealership.numberOfCustomers());
    }

    @Test
    public void canSellVehicle(){
        dealership.addCustomer(customer);
        dealership.addVehicle(vehicle);
        dealership.sell(vehicle, customer);
        assertEquals(5000, till.getMoney(), 0.01);
        assertEquals(1, customer.numberOfVehicles());
        assertEquals(0, dealership.numberOfVehicles());
        assertEquals(5000, customer.getWallet(), 0.01);
    }

    @Test
    public void canAddMoneyToTill(){
        dealership.addMoneyToTill(20000);
        assertEquals(20000, till.getMoney(), 0.01);
    }

    @Test
    public void canBuyVehicle(){
        dealership.addMoneyToTill(20000);
        dealership.buy(vehicle);
        assertEquals(15000, till.getMoney(), 0.01);
        assertEquals(1, dealership.numberOfVehicles());
    }

    @Test
    public void canRepairVehicle() {
        dealership.addMoneyToTill(3000);
        dealership.addVehicle(vehicle);
        vehicle.damageVehicle(500);
        dealership.repairVehicle(vehicle, 500);
        assertEquals(2500, till.getMoney(), 0.01);
        assertEquals(false, vehicle.checkForDamage());
        assertEquals(5000, vehicle.getPrice(), 0.01);
    }
}
