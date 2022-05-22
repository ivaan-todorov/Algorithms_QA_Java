package HW_10;

public class ReverseString {

    public String reverseString(String str) {
        char[] charArr = str.toCharArray();
        String result = "";

        for (int i = charArr.length - 1; i >= 0; i--) {
            result += charArr[i];
        }

        return result;
    }

}
