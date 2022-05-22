package HW_9;

public class OddIndices {

    public int[] oddIndices(int[] arr) {
        int[] result = new int[arr.length/2];

        for (int i = 1, j = 0; i < arr.length; i += 2) {
            result[j] = arr[i];
            j++;
        }

        return result;
    }



}
