package vehicles;

import components.EngineType;
import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Vehicle vehicle;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        engine = new Engine(2000, EngineType.ELECTRIC);
        tyres = new Tyres("michilin", 18);
        vehicle = new Vehicle("Honda",CarType.CAR, engine, tyres, 3000, "red");
    }

    @Test
    public void hasType() {
        assertEquals(CarType.CAR, vehicle.getType());
    }


    @Test
    public void hasPrice() {
        assertEquals(3000, vehicle.getPrice(), 0.01);
    }

    @Test
    public void hasColour() {
        assertEquals("red", vehicle.getColour());
    }

    @Test
    public void canCheckIfDamaged() {
        assertEquals(false, vehicle.checkForDamage());
    }

    @Test
    public void canBeDamaged() {
        vehicle.damageVehicle(500);
        assertEquals(true, vehicle.checkForDamage());
        assertEquals(2500, vehicle.getPrice(), 0.01);
    }
}
