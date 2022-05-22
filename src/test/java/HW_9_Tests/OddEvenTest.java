package HW_9_Tests;

import HW_9.OddEven;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

    @Test
    public void testOddEvenResultOdd() {
        long x = -345L;

        OddEven oddEven1 = new OddEven();
        String actualResult = oddEven1.oddEven(x);

        Assertions.assertEquals("Odd", actualResult);
    }

    @Test
    public void testOddEvenResultEven() {
        long x = 0L;

        OddEven oddEven1 = new OddEven();
        String actualResult = oddEven1.oddEven(x);

        Assertions.assertEquals("Even", actualResult);
    }

    @Test
    public void testOddEvenCheck222222() {
        long x = 222222L;

        OddEven oddEven1 = new OddEven();
        String actualResult = oddEven1.oddEven(x);

        Assertions.assertEquals("Even", actualResult);
    }

    @Test
    public void testOddEvenResultUndefined() {
        long x = 2147483647 + 1L;

        OddEven oddEven1 = new OddEven();
        String actualResult = oddEven1.oddEven(x);

        Assertions.assertEquals("Undefined", actualResult);
    }

}
