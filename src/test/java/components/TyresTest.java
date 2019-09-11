package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres("Pirelli", 18);
    }

    @Test
    public void canGetMake(){
        assertEquals("Pirelli", tyres.getMake());
    }

    @Test
    public void canGetSize() {
        assertEquals(18, tyres.getSize());
    }
}
