package HW_10_Tests;

import HW_10.StringToLetters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToLettersTest {

    @Test
    public void testStringToLetters() {
        String str = "sak;d2342H";

        StringToLetters stringToLetters = new StringToLetters();
        String actualResult = stringToLetters.stringToLetters(str);
        String expectedResult = "sakdH";

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
