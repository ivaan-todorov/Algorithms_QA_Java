package HW_9;

public class ReverseArray {

    public int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            result[i] = arr[j];
        }

        return result;
    }

}
