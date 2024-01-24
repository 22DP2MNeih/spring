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

        // Money macins1 = new Money(10, 4);
        // Money macins2 = new Money(12, 98);
        // Money macins3 = macins1.plus(macins2);

        // assertEquals(23, macins3.euros());
        // assertEquals(2, macins3.cents());

        Money macins0 = new Money(0, 52);
        Money macins1 = new Money(8, 99);
        Money macins2 = macins0.plus(macins1);

        assertEquals(9, macins2.euros());
        assertEquals(51, macins2.cents());

        Money macins3 = new Money(0, 27);
        Money macins4 = new Money(6, 72);
        Money macins5 = macins3.plus(macins4);

        assertEquals(6, macins5.euros());
        assertEquals(99, macins5.cents());

        Money macins6 = new Money(7, 91);
        Money macins7 = new Money(0, 83);
        Money macins8 = macins6.plus(macins7);

        assertEquals(8, macins8.euros());
        assertEquals(74, macins8.cents());

        Money macins9 = new Money(8, 18);
        Money macins10 = new Money(0, 83);
        Money macins11 = macins9.plus(macins10);

        assertEquals(9, macins11.euros());
        assertEquals(1, macins11.cents());

        Money macins12 = new Money(5, 3);
        Money macins13 = new Money(3, 47);
        Money macins14 = macins12.plus(macins13);

        assertEquals(8, macins14.euros());
        assertEquals(50, macins14.cents());

        Money macins15 = new Money(0, 34);
        Money macins16 = new Money(3, 59);
        Money macins17 = macins15.plus(macins16);

        assertEquals(3, macins17.euros());
        assertEquals(93, macins17.cents());

        Money macins18 = new Money(9, 3);
        Money macins19 = new Money(6, 54);
        Money macins20 = macins18.plus(macins19);

        assertEquals(15, macins20.euros());
        assertEquals(57, macins20.cents());

        Money macins21 = new Money(6, 65);
        Money macins22 = new Money(5, 74);
        Money macins23 = macins21.plus(macins22);

        assertEquals(12, macins23.euros());
        assertEquals(39, macins23.cents());

        Money macins24 = new Money(4, 5);
        Money macins25 = new Money(6, 5);
        Money macins26 = macins24.plus(macins25);

        assertEquals(10, macins26.euros());
        assertEquals(10, macins26.cents());

        Money macins27 = new Money(3, 80);
        Money macins28 = new Money(1, 43);
        Money macins29 = macins27.plus(macins28);

        assertEquals(5, macins29.euros());
        assertEquals(23, macins29.cents());

        Money macins30 = new Money(7, 97);
        Money macins31 = new Money(4, 46);
        Money macins32 = macins30.plus(macins31);

        assertEquals(12, macins32.euros());
        assertEquals(43, macins32.cents());

        Money macins33 = new Money(0, 14);
        Money macins34 = new Money(4, 3);
        Money macins35 = macins33.plus(macins34);

        assertEquals(4, macins35.euros());
        assertEquals(17, macins35.cents());

        Money macins36 = new Money(3, 60);
        Money macins37 = new Money(3, 82);
        Money macins38 = macins36.plus(macins37);

        assertEquals(7, macins38.euros());
        assertEquals(42, macins38.cents());

        Money macins39 = new Money(7, 12);
        Money macins40 = new Money(3, 58);
        Money macins41 = macins39.plus(macins40);

        assertEquals(10, macins41.euros());
        assertEquals(70, macins41.cents());

        Money macins42 = new Money(8, 12);
        Money macins43 = new Money(1, 89);
        Money macins44 = macins42.plus(macins43);

        assertEquals(10, macins44.euros());
        assertEquals(1, macins44.cents());

        Money macins45 = new Money(0, 63);
        Money macins46 = new Money(4, 75);
        Money macins47 = macins45.plus(macins46);

        assertEquals(5, macins47.euros());
        assertEquals(38, macins47.cents());

        Money macins48 = new Money(9, 27);
        Money macins49 = new Money(5, 24);
        Money macins50 = macins48.plus(macins49);

        assertEquals(14, macins50.euros());
        assertEquals(51, macins50.cents());

        Money macins51 = new Money(7, 23);
        Money macins52 = new Money(7, 51);
        Money macins53 = macins51.plus(macins52);

        assertEquals(14, macins53.euros());
        assertEquals(74, macins53.cents());

        Money macins54 = new Money(2, 68);
        Money macins55 = new Money(4, 68);
        Money macins56 = macins54.plus(macins55);

        assertEquals(7, macins56.euros());
        assertEquals(36, macins56.cents());

        Money macins57 = new Money(6, 5);
        Money macins58 = new Money(8, 95);
        Money macins59 = macins57.plus(macins58);

        assertEquals(15, macins59.euros());
        assertEquals(0, macins59.cents());
    }
    @Test
    public void testMinusMethod() {

        // Money macins1 = new Money(10, 4);
        // Money macins2 = new Money(12, 98);

        // Money macins3 = macins1.minus(macins2);
        // Money macins4 = macins2.minus(macins1);

        // assertEquals(0, macins3.euros());
        // assertEquals(0, macins3.cents());

        // assertEquals(2, macins4.euros());
        // assertEquals(94, macins4.cents());

        Money macins0 = new Money(7, 19);
        Money macins1 = new Money(5, 78);
        Money macins2 = macins0.minus(macins1);

        assertEquals(1, macins2.euros());
        assertEquals(41, macins2.cents());

        Money macins3 = new Money(9, 30);
        Money macins4 = new Money(4, 75);
        Money macins5 = macins3.minus(macins4);

        assertEquals(4, macins5.euros());
        assertEquals(55, macins5.cents());

        Money macins6 = new Money(2, 67);
        Money macins7 = new Money(4, 83);
        Money macins8 = macins6.minus(macins7);

        assertEquals(0, macins8.euros());
        assertEquals(0, macins8.cents());

        Money macins9 = new Money(8, 61);
        Money macins10 = new Money(8, 82);
        Money macins11 = macins9.minus(macins10);

        assertEquals(0, macins11.euros());
        assertEquals(0, macins11.cents());

        Money macins12 = new Money(4, 4);
        Money macins13 = new Money(3, 16);
        Money macins14 = macins12.minus(macins13);

        assertEquals(0, macins14.euros());
        assertEquals(88, macins14.cents());

        Money macins15 = new Money(4, 56);
        Money macins16 = new Money(5, 14);
        Money macins17 = macins15.minus(macins16);

        assertEquals(0, macins17.euros());
        assertEquals(0, macins17.cents());

        Money macins18 = new Money(3, 91);
        Money macins19 = new Money(0, 32);
        Money macins20 = macins18.minus(macins19);

        assertEquals(3, macins20.euros());
        assertEquals(59, macins20.cents());

        Money macins21 = new Money(0, 50);
        Money macins22 = new Money(8, 33);
        Money macins23 = macins21.minus(macins22);

        assertEquals(0, macins23.euros());
        assertEquals(0, macins23.cents());

        Money macins24 = new Money(6, 92);
        Money macins25 = new Money(8, 2);
        Money macins26 = macins24.minus(macins25);

        assertEquals(0, macins26.euros());
        assertEquals(0, macins26.cents());

        Money macins27 = new Money(0, 54);
        Money macins28 = new Money(7, 10);
        Money macins29 = macins27.minus(macins28);

        assertEquals(0, macins29.euros());
        assertEquals(0, macins29.cents());

        Money macins30 = new Money(3, 76);
        Money macins31 = new Money(0, 78);
        Money macins32 = macins30.minus(macins31);

        assertEquals(2, macins32.euros());
        assertEquals(98, macins32.cents());

        Money macins33 = new Money(5, 99);
        Money macins34 = new Money(2, 38);
        Money macins35 = macins33.minus(macins34);

        assertEquals(3, macins35.euros());
        assertEquals(61, macins35.cents());

        Money macins36 = new Money(5, 27);
        Money macins37 = new Money(2, 62);
        Money macins38 = macins36.minus(macins37);

        assertEquals(2, macins38.euros());
        assertEquals(65, macins38.cents());

        Money macins39 = new Money(8, 99);
        Money macins40 = new Money(8, 90);
        Money macins41 = macins39.minus(macins40);

        assertEquals(0, macins41.euros());
        assertEquals(9, macins41.cents());

        Money macins42 = new Money(3, 42);
        Money macins43 = new Money(1, 59);
        Money macins44 = macins42.minus(macins43);

        assertEquals(1, macins44.euros());
        assertEquals(83, macins44.cents());

        Money macins45 = new Money(8, 19);
        Money macins46 = new Money(9, 5);
        Money macins47 = macins45.minus(macins46);

        assertEquals(0, macins47.euros());
        assertEquals(0, macins47.cents());

        Money macins48 = new Money(8, 2);
        Money macins49 = new Money(2, 18);
        Money macins50 = macins48.minus(macins49);

        assertEquals(5, macins50.euros());
        assertEquals(84, macins50.cents());

        Money macins51 = new Money(9, 3);
        Money macins52 = new Money(6, 72);
        Money macins53 = macins51.minus(macins52);

        assertEquals(2, macins53.euros());
        assertEquals(31, macins53.cents());

        Money macins54 = new Money(5, 79);
        Money macins55 = new Money(2, 76);
        Money macins56 = macins54.minus(macins55);

        assertEquals(3, macins56.euros());
        assertEquals(3, macins56.cents());

        Money macins57 = new Money(1, 99);
        Money macins58 = new Money(1, 65);
        Money macins59 = macins57.minus(macins58);

        assertEquals(0, macins59.euros());
        assertEquals(34, macins59.cents());


    }

    @Test
    public void testLessThanMethod() {

        Money macins1 = new Money(10, 4);
        Money macins2 = new Money(12, 98);

        assertTrue(macins1.lessThan(macins2));
        assertFalse(macins2.lessThan(macins1));
        
        // Money macins0 = new Money(6, 14);
        // Money macins1 = new Money(5, 16);
        
        // assertFalse(macins0.lessThan(macins1));
        // assertTrue(macins1.lessThan(macins0));
        
        Money macins3 = new Money(9, 76);
        Money macins4 = new Money(0, 38);
        
        assertFalse(macins3.lessThan(macins4));
        assertTrue(macins4.lessThan(macins3));
        
        Money macins6 = new Money(2, 2);
        Money macins7 = new Money(0, 11);
        
        assertFalse(macins6.lessThan(macins7));
        assertTrue(macins7.lessThan(macins6));
        
        Money macins9 = new Money(7, 84);
        Money macins10 = new Money(6, 41);
        
        assertFalse(macins9.lessThan(macins10));
        assertTrue(macins10.lessThan(macins9));
        
        Money macins12 = new Money(5, 95);
        Money macins13 = new Money(4, 40);
        
        assertFalse(macins12.lessThan(macins13));
        assertTrue(macins13.lessThan(macins12));
        
        Money macins15 = new Money(0, 41);
        Money macins16 = new Money(9, 16);
        
        assertTrue(macins15.lessThan(macins16));
        assertFalse(macins16.lessThan(macins15));
        
        Money macins18 = new Money(2, 78);
        Money macins19 = new Money(3, 44);
        
        assertTrue(macins18.lessThan(macins19));
        assertFalse(macins19.lessThan(macins18));
        
        Money macins21 = new Money(8, 12);
        Money macins22 = new Money(3, 69);
        
        assertFalse(macins21.lessThan(macins22));
        assertTrue(macins22.lessThan(macins21));
        
        Money macins24 = new Money(7, 93);
        Money macins25 = new Money(2, 89);
        
        assertFalse(macins24.lessThan(macins25));
        assertTrue(macins25.lessThan(macins24));
        
        Money macins27 = new Money(0, 71);
        Money macins28 = new Money(7, 44);
        
        assertTrue(macins27.lessThan(macins28));
        assertFalse(macins28.lessThan(macins27));
        
        Money macins30 = new Money(9, 10);
        Money macins31 = new Money(8, 75);
        
        assertFalse(macins30.lessThan(macins31));
        assertTrue(macins31.lessThan(macins30));
        
        Money macins33 = new Money(8, 96);
        Money macins34 = new Money(3, 43);
        
        assertFalse(macins33.lessThan(macins34));
        assertTrue(macins34.lessThan(macins33));
        
        Money macins36 = new Money(0, 35);
        Money macins37 = new Money(7, 10);
        
        assertTrue(macins36.lessThan(macins37));
        assertFalse(macins37.lessThan(macins36));
        
        Money macins39 = new Money(0, 68);
        Money macins40 = new Money(5, 43);
        
        assertTrue(macins39.lessThan(macins40));
        assertFalse(macins40.lessThan(macins39));
        
    }
}
