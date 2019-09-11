package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine(2000, EngineType.ELECTRIC);
    }

    @Test
    public void canGetEngineSize() {
        assertEquals(2000, engine.getSize());
    }
}
