package people;

import components.Engine;
import components.EngineType;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.CarType;
import vehicles.Vehicle;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Vehicle vehicle;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        customer = new Customer("Matt", 10000);
        engine = new Engine(200, EngineType.ELECTRIC);
        tyres = new Tyres("Pirelli", 18);
        vehicle = new Vehicle("Honda", CarType.VAN, engine, tyres, 5000, "yellow");
    }

    @Test
    public void hasName() {
        assertEquals("Matt", customer.getName());
    }

    @Test
    public void getWallet() {
        assertEquals(10000, customer.getWallet(), 0.01);
    }

    @Test
    public void canBuyVehicle(){
        customer.buy(vehicle);
        assertEquals(5000, customer.getWallet(), 0.01);
        assertEquals(1, customer.numberOfVehicles());
    }
}
