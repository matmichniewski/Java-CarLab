package people;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {
    Dealer dealer;

    @Before
    public void before(){
        dealer = new Dealer("Matt");
    }

    @Test
    public void hasName() {
        assertEquals("Matt", dealer.getName());
    }
}
