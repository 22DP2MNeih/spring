package lv.rvt;

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
        assertEquals(23, macins3.cents());

    }
}
