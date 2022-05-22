package HW_10_Tests;

import HW_10.StringIntersection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringIntersectionTest {

    @Test
    public void testStringIntersection() {
        String str1 = "Carrot";
        String str2 = "carwash";

        StringIntersection stringIntersection = new StringIntersection();
        String actualResult = stringIntersection.stringIntersection(str1, str2);
        String expectedResult = "car";

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
