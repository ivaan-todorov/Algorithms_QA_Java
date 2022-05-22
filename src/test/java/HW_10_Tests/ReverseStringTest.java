package HW_10_Tests;

import HW_10.ReverseString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {

    @Test
    public void testReverseString() {
        String str = "Abracadabra";

        ReverseString reverseString = new ReverseString();
        String actualResult = reverseString.reverseString(str);
        String expectedResult = "arbadacarbA";

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
