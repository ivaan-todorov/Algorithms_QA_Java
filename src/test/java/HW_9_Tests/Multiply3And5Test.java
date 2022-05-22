package HW_9_Tests;

import HW_9.Multiply3And5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Multiply3And5Test {

    @Test
    public void testMultiply3And5Positive() {
        int m = 15;

        Multiply3And5 multiply3And5 = new Multiply3And5();
        String actualResult = multiply3And5.multiply3And5(m);
        String expectedResult = "Good Number";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiply3And5Only3() {
        int m = 3;

        Multiply3And5 multiply3And5 = new Multiply3And5();
        String actualResult = multiply3And5.multiply3And5(m);
        String expectedResult = "Bad Number";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiply3And5Only5() {
        int m = 5;

        Multiply3And5 multiply3And5 = new Multiply3And5();
        String actualResult = multiply3And5.multiply3And5(m);
        String expectedResult = "Poor Number";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiply3And5Fail() {
        int m = 2;

        Multiply3And5 multiply3And5 = new Multiply3And5();
        String actualResult = multiply3And5.multiply3And5(m);
        String expectedResult = "-1";

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
