package HW_9;

public class NegativeOnTheRight {

    public int[] negativeOnTheRight(int[] arr) {
        int countNegative = 0;
        int countPositive = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                countPositive++;
            } else {
                countNegative++;
            }
        }

        int[] arrNegative = new int[countNegative];
        int[] arrPositive = new int[countPositive];
        for (int i = 0, n = 0, p = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arrPositive[p] = arr[i];
                p++;
            } else {
                arrNegative[n] = arr[i];
                n++;
            }
        }

        for (int i = 0; i < arrPositive.length; i++) {
            arr[i] = arrPositive[i];
        }
        for (int i = arrPositive.length, j = 0; i < arr.length; i++, j++) {
            arr[i] = arrNegative[j];
        }

        return arr;
    }


}
