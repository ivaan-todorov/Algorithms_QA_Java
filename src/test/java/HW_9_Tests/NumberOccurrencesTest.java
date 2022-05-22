package HW_9_Tests;

import HW_9.NumberOccurrences;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOccurrencesTest {

    @Test
    public void testNumberOccurrences() {
        int[] arr = {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};

        NumberOccurrences numberOccurrences = new NumberOccurrences();
        int[][] actualResult = numberOccurrences.numberOccurrences(arr);
        int[][] expectedResult = {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
