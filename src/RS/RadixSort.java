package RS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort {
    public static void radixSort(int[] input, int radix) {
        final int RADIX = radix;
        // Determine maximum number of digits
        boolean maxLength = false;
        int temp = -1, place = 1;
        List<Integer>[] bucket = new ArrayList[RADIX];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<Integer>();
        }
        // Loop over all digits
        while (!maxLength) {
            maxLength = true;
            // Split input between buckets
            for (Integer i : input) {
                temp = i / place;
                bucket[temp % RADIX].add(i);
                if (maxLength && temp > 0) {
                    maxLength = false;
                }
            }
            // Empty buckets back into input array
            int a = 0;
            for (int b = 0; b < RADIX; b++) {
                for (Integer i : bucket[b]) {
                    input[a++] = i;
                }
                bucket[b].clear();
            }
            // Move to next digit
            place *= RADIX;
        }
    }
}
