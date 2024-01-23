package lv.rvt;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import rvt.Money;

public class MoneyTest {

    @Test
    public void testPlusMethod() {

        Money macins1 = new Money(10, 4);
        Money macins2 = new Money(12, 98);
        Money macins3 = macins1.plus(macins2);

        assertEquals(23, macins3.euros());
        assertEquals(2, macins3.cents());

    }
    @Test
    public void testMinusMethod() {

        Money macins1 = new Money(10, 4);
        Money macins2 = new Money(12, 98);

        Money macins3 = macins1.minus(macins2);
        Money macins4 = macins2.minus(macins1);

        assertEquals(0, macins3.euros());
        assertEquals(0, macins3.cents());

        assertEquals(2, macins4.euros());
        assertEquals(94, macins4.cents());

    }

    @Test
    public void testLessThanMethod() {

        Money macins1 = new Money(10, 4);
        Money macins2 = new Money(12, 98);

        assertTrue(macins1.lessThan(macins2));
        assertFalse(macins2.lessThan(macins1));
        
    }
}
