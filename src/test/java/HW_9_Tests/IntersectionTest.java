package HW_9_Tests;

import HW_9.Intersection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersectionTest {

    @Test
    public void testIntersection() {
        int[] arr1 = {8, 9, 4, 2};
        int[] arr2 = {1, 2, 4, 5, 89};

        Intersection intersection = new Intersection();
        int[] actualResult = intersection.intersection(arr1, arr2);
        int[] expectedResult = {2, 4};

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
