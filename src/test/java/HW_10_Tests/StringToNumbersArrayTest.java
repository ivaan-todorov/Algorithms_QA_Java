package HW_10_Tests;

import HW_10.StringToNumbersArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToNumbersArrayTest {

    //Test Data:
    //“1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}

    @Test
    public void testStringToNumbers() {
        String strNumbers = "1, 2, 3, 4, 5";

        StringToNumbersArray stringToNumbers = new StringToNumbersArray();
        int[] actualResult = stringToNumbers.stringToNumbersArray(strNumbers);
        int[] expectedResult = {1, 2, 3, 4, 5};

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
