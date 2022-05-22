package HW_10;

public class RemoveDuplicates {

    public String removeDuplicates(String str) {
        String result = "";
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(String.valueOf(str.charAt(i)))) {
                result += String.valueOf(str.charAt(i));
            }
        }

        return result;
    }

}





//        if (!str.equals("")) {
//            str = str.toLowerCase();
//            for(int i = 0; i < str.length();) {
//                result += String.valueOf(str.charAt(i));
//                str = str.replace(String.valueOf(str.charAt(i)), "");
//            }
//        }