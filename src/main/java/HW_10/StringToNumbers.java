package HW_10;

public class StringToNumbers {

    public String stringToNumbers(String str) {

        return str.replaceAll("[^0-9]","");
    }

}
