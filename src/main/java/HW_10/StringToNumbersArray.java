package HW_10;

public class StringToNumbersArray {

    public int[] stringToNumbersArray(String numbers) {
        String[] numbersArr = numbers.split(", ");
        int[] intArr = new int[numbersArr.length];

        for (int i = 0; i < numbersArr.length; i++) {
            intArr[i] = Integer.parseInt(numbersArr[i]);
        }

        return intArr;
    }


}
