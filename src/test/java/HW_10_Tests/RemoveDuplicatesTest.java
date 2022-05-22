package HW_10_Tests;

import HW_10.RemoveDuplicates;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        String str = "AABBCCaabbcc";

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        String actualResult = removeDuplicates.removeDuplicates(str);
        String expectedResult = "abc";

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
