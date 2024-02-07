package lv.rvt;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import rvt.Sorting;

public class SortingTest {
    

    @Test
    public void testSmallestMethod() {

        int[] arr = {9, 4, 6, 7, 2, 6, 3, 10};
        assertEquals(2, Sorting.smallest(arr));

        int[] arr2 = {4, 454, 577, 67, 90};
        assertEquals(4, Sorting.smallest(arr2));
    }

    @Test
    public void testIndexOfSmallestMethod() {

        int[] arr = {9, 4, 6, 7, 2, 6, 3, 10};
        assertEquals(4, Sorting.indexOfSmallest(arr));

        int[] arr2 = {4, 454, 577, 67, 90};
        assertEquals(0, Sorting.indexOfSmallest(arr2));
    }

    @Test
    public void testIndexOfSmallestFromMethod() {

        int[] arr = {9, 4, 6, 7, 2, 6, 3, 10};
        assertEquals(6, Sorting.indexOfSmallestFrom(arr, 5));

        int[] arr2 = {4, 454, 577, 67, 90};
        assertEquals(3, Sorting.indexOfSmallestFrom(arr2, 3));
    }

    @Test
    public void testSwapMethod() {

        int[] arr11 = {9, 4, 6, 7, 2, 6, 3, 10};
        int[] arr12 = {9, 4, 2, 7, 6, 6, 3, 10};
        Sorting.swap(arr11, 2, 4);

        assertArrayEquals(arr12, arr11);

        int[] arr21 = {4, 454, 577, 67, 90};
        int[] arr22 = {4, 67, 577, 454, 90};
        Sorting.swap(arr21, 1, 3);

        assertArrayEquals(arr22, arr21);
    }

    @Test
    public void testSortMethod() {

        int[] arr11 = {1, 4, 6, 2, 3};
        int[] arr12 = {1, 2, 3, 4, 6};
        Sorting.sort(arr11);

        assertArrayEquals(arr12, arr11);

        int[] arr21 = {91, 454, 577, 67, 90};
        int[] arr22 = {67, 90, 91, 454, 577};
        Sorting.sort(arr21);
        
        assertArrayEquals(arr22, arr21);
    }
}
