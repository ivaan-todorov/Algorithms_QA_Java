package HW_10_Tests;

import HW_10.StringToNumbersAndSpaces;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToNumbersAndSpacesTest {

    @Test
    public void testStringToNumbersAndSpaces() {
        String str = "asdA 1H 2g 3 fsdgsd";

        StringToNumbersAndSpaces stringToNumbersAndSpaces = new StringToNumbersAndSpaces();
        String actualResult = stringToNumbersAndSpaces.stringToNumbersAndSpaces(str);
        String expectedResult = " 1 2 3 ";

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
