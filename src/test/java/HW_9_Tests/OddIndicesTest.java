package HW_9_Tests;

import HW_9.OddIndices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {

    @Test
    public void oddIndicesTest() {
        int[] arr = {-45, 590, 234, 985, 12, 68};

        OddIndices oddIndices = new OddIndices();
        int[] actualResult = oddIndices.oddIndices(arr);
        int[] expectedResult = {590, 985, 68};

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }



}
