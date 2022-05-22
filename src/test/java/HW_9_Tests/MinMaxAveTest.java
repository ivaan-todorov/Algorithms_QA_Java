package HW_9_Tests;

import HW_9.MinMaxAve;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {

    @Test
    public void testMinMaxAve() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 2;
        int end = 6;

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.minMaxAve(arr, start, end);
        int[] expectedResult = {3, 7, 5};

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
