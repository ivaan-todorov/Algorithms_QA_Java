package HW_9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Intersection {

    public int[] intersection(int[] arr1, int[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                }
            }
        }

        int[] result = new int[count];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0, r = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    result[r] = arr2[j];
                    r++;
                }
            }
        }

        return result;
    }

}
