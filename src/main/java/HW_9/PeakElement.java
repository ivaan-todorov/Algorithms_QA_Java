package HW_9;

public class PeakElement {

    public int[] peakElement(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 && arr[i] > arr[i+1]) {
                count++;
            } else if (i == arr.length - 1 && arr[i] > arr[i-1]) {
                count++;
            } else if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                count++;
            }
        }

        int[] result = new int[count];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == 0 && arr[i] > arr[i+1]) {
                result[j] = arr[i];
                j++;
            } else if (i == arr.length - 1 && arr[i] > arr[i-1]) {
                result[j] = arr[i];
                j++;
            } else if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                result[j] = arr[i];
                j++;
            }
        }

        return result;
    }

}
