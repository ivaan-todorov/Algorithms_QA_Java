package HW_10_Tests;

import HW_10.StringToNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToNumbersTest {

    @Test
    public void testStringToNumbers() {
        String str = "abc 1 2 3 ";

        StringToNumbers stringToNumbers = new StringToNumbers();
        String actualResult = stringToNumbers.stringToNumbers(str);
        String expectedResult = "123";

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
