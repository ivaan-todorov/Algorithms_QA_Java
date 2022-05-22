package HW_9_Tests;

import HW_9.SumArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumArrayTest {

    @Test
    public void sumArrayPositiveTest() {
        int[] arr = {0, 1, 2, 3, 4, 5};

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.sum(arr);
        int expectedResult = 15;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void sumArrayNegativeTest() {
        int[] arr = {-7, -3};

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.sum(arr);
        int expectedResult = -10;

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
