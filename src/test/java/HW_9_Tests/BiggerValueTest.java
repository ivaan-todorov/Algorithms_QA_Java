package HW_9_Tests;

import HW_9.BiggerValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {

    @Test
    public void biggerValueTest() {
        int lowerValue = 3333;
        int biggerValue = 9999;

        BiggerValue biggerValue1 = new BiggerValue();
        int actualResult = biggerValue1.biggerValue(lowerValue, biggerValue);
        int expectedResult = 9999;

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
