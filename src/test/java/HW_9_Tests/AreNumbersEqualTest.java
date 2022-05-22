package HW_9_Tests;

import HW_9.AreNumbersEqual;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {

    @Test
    public void testAreNumbersEqualZero() {
        int number1 = 89;
        int number2 = 89;

        AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
        int actualResult = areNumbersEqual.areNumbersEqual(number1, number2);
        int expectedResult = 0;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqualNegative() {
        int number1 = -89;
        int number2 = 89;

        AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
        int actualResult = areNumbersEqual.areNumbersEqual(number1, number2);
        int expectedResult = -1;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqualPositive() {
        int number1 = 89;
        int number2 = -89;

        AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
        int actualResult = areNumbersEqual.areNumbersEqual(number1, number2);
        int expectedResult = 1;

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
