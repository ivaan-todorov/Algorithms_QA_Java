package HW_9_Tests;

import HW_9.ReverseArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {

    @Test
    public void testReverseArray() {
        int[] arr = {2, 7, 3, 10};

        ReverseArray reverseArray = new ReverseArray();
        int[] actualResult = reverseArray.reverseArray(arr);
        int[] expectedResult = {10, 3, 7, 2};

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
