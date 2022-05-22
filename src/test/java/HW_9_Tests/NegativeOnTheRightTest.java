package HW_9_Tests;

import HW_9.NegativeOnTheRight;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NegativeOnTheRightTest {

    @Test
    public void testNegativeOnTheRight() {
        int[] arr = {4, -3, 7, -12, 5, -2, 9, 4, 12};

        NegativeOnTheRight negativeOnTheRight = new NegativeOnTheRight();
        int[] actualResult = negativeOnTheRight.negativeOnTheRight(arr);
        int[] expectedResult = {4, 7, 5, 9, 4, 12, -3, -12, -2};

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
