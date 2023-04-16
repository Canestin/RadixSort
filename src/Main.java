import RS.RadixSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] input = {170, 45, 75, 90, 2, 802, 2, 66};
        RadixSort RS = new RadixSort();
        System.out.println("Before sorting: " + Arrays.toString(input));
        RS.radixSort(input, 10);
        System.out.println("After sorting: " + Arrays.toString(input));
    }
}