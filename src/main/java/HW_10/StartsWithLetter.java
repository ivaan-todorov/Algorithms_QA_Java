package HW_10;

public class StartsWithLetter {

    public String startsWithLetter(String str) {
        String result = "";
        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) == 'l' || arr[i].charAt(0) == 'L') {
                result += arr[i] + " ";
            }
        }

        result = result.strip();
        result = result.replaceAll("[^a-zA-Z ]", "");
        result = result.replace(" ", ", ");

        return result;
    }

}
