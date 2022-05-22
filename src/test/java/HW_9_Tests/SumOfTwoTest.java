package HW_9_Tests;

import HW_9.SumOfTwo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfTwoTest {

    @Test
    public void testSumOfTwo() {
        int[] arr = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 12;

        SumOfTwo sumOfTwo = new SumOfTwo();
        int[][] actualResult = sumOfTwo.sumOfTwo(arr, n);
        int[][] expectedResult = {{3, 9}, {7, 5}};

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
