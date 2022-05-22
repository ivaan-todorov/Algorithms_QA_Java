package HW_10;

public class StringToLettersAndSpaces {

    public String stringToLettersAndSpaces(String str) {

        return str.replaceAll("[^a-zA-Z ]","");
    }

}
