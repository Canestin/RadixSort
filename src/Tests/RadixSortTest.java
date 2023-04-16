package Tests;
import RS.RadixSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadixSortTest {

    @Test
    void testRadixSortWithPositiveNumbers() {
        int[] input = {10, 5, 7, 2, 15};
        int[] expected = {2, 5, 7, 10, 15};
        RadixSort.radixSort(input, 10);
        assertArrayEquals(expected, input);
    }

    @Test
    void testRadixSortWithDuplicates() {
        int[] input = {10, 5, 7, 2, 5};
        int[] expected = {2, 5, 5, 7, 10};
        RadixSort.radixSort(input, 10);
        assertArrayEquals(expected, input);
    }

    @Test
    void testRadixSortWithZero() {
        int[] input = {0, 10, 5, 7, 2};
        int[] expected = {0, 2, 5, 7, 10};
        RadixSort.radixSort(input, 10);
        assertArrayEquals(expected, input);
    }

    @Test
    void testRadixSortWithSingleElementArray() {
        int[] input = {10};
        int[] expected = {10};
        RadixSort.radixSort(input, 10);
        assertArrayEquals(expected, input);
    }

    @Test
    void testRadixSortWithEmptyArray() {
        int[] input = {};
        int[] expected = {};
        RadixSort.radixSort(input, 10);
        assertArrayEquals(expected, input);
    }

    @Test
    void testRadixSortWithSameRadixAndBase() {
        int[] input = {10, 5, 7, 2, 15};
        int[] expected = {2, 5, 7, 10, 15};
        RadixSort.radixSort(input, 2);
        assertArrayEquals(expected, input);
    }
}
