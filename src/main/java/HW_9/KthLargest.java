package HW_9;

public class KthLargest {

    public int kthLargest(int[] arr,int k) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int result = arr[arr.length - k];

        return result;
    }



}
