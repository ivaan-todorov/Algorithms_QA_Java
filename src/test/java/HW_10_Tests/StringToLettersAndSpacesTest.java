package HW_10_Tests;

import HW_10.StringToLettersAndSpaces;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToLettersAndSpacesTest {

    @Test
    public void testStringToLettersAndSpaces() {
        String str = "a b c1 23D";

        StringToLettersAndSpaces stringToLettersAndSpaces = new StringToLettersAndSpaces();
        String actualResult = stringToLettersAndSpaces.stringToLettersAndSpaces(str);
        String expectedResult = "a b c D";

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
