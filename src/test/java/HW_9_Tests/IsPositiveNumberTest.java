package HW_9_Tests;

import HW_9.IsPositiveNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {

    @Test
    public void isPositiveNumberHappyTest() {
        double number = 555;

        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.isPositiveNumber(number);
        boolean expectedResult = true;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void isPositiveNumberZeroTest() {
        double number = 0;

        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.isPositiveNumber(number);
        boolean expectedResult = true;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void isPositiveNumberNegativeTest() {
        double number = -555;

        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.isPositiveNumber(number);
        boolean expectedResult = false;

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
