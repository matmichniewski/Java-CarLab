import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TillTest {

    Till till;

    @Before
    public void before(){
        till = new Till();
    }

    @Test
    public void tillStartsEmpty(){
        assertEquals(0, till.getMoney(), 0.01);
    }

    @Test
    public void canSetMoney(){
        till.setMoney(100);
        assertEquals(100, till.getMoney(), 0.01);
    }

    @Test
    public void canAddMoneyToTheTill(){
        till.setMoney(100);
        till.addMoney(100);
        assertEquals(200, till.getMoney(), 0.01);
    }
}
