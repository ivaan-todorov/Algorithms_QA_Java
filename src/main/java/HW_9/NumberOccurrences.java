package HW_9;

import java.util.Arrays;

public class NumberOccurrences {

    public int[][] numberOccurrences(int[] arr) {
        SortArray sortArray = new SortArray();
        arr = sortArray.sortArray(arr);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
          if (i == arr.length - 1) {
            count++;
        } else if (arr[i] != arr[i+1]) {
                count++;
            }
        }

        int[][] result = new int[count][2];
        for (int i = 0, j = 0, s = 0; i < arr.length; i++) {
            s++;
           if (i == arr.length - 1) {
            result[j][0] = arr[i];
            result[j][1] = s;
            s = 0;
            j++;
        } else if (arr[i] != arr[i+1]) {
                result[j][0] = arr[i];
                result[j][1] = s;
                s = 0;
                j++;
           }
        }

        return result;
    }


}
