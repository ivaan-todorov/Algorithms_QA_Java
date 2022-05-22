package HW_10;

public class CountWords {

    public int countWords(String str, String word) {
        str = str.toLowerCase();
        word = word.toLowerCase();
        String[] arr = str.split(" ");

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(word)) {
                count++;
            }
        }

        return count;
    }

}
