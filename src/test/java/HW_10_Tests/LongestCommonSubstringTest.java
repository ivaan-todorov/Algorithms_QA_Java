package HW_10_Tests;

import HW_10.LongestCommonSubstring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonSubstringTest {

    @Test
    public void testLongestCommonSubstring() {
        String s1 = "Smazea";
        String s2 = "amazing";
        String s3 = "amazon";

        LongestCommonSubstring longestCommonSubstring = new LongestCommonSubstring();
        String actualResult = longestCommonSubstring.longestCommonSubstring(s1, s2, s3);
        String expectedResult = "maz";

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
