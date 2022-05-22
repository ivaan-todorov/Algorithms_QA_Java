package HW_9;

public class MinMaxAve {

    public int[] minMaxAve(int[] arr, int start, int end) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int ave = 0;

        for (int i = start; i < end + 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }

            ave += arr[i];
        }
        ave /= (end - start + 1);

        return new int[]{min, max, ave};
    }

}
