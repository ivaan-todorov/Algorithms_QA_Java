package HW_10;

public class StringToNumbersAndSpaces {

    public String stringToNumbersAndSpaces(String str) {

        return str.replaceAll("[^0-9 ]","");
    }

}
