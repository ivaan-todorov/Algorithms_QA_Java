package HW_10;

public class StringToLetters {

    public String stringToLetters(String str) {

        return str.replaceAll("[^a-zA-Z]","");
    }

}
