package HW_9_Tests;

import HW_9.KthLargest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthLargestTest {

    @Test
    public void testKthLargest() {
        int[] arr = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 3;

        KthLargest kthLargest = new KthLargest();
        int actualResult = kthLargest.kthLargest(arr, k);
        int expectedResult = 9;

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
