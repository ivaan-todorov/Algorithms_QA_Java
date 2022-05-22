package HW_10;


public class StringIntersection {

    public String stringIntersection(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        String maxStr = "";
        String subStr = "";

        if (str1.length() > str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        int len = str1.length();
        for (int i = len; i > 0; i--) {
            for (int j = 0; j < len - i + 1; j++) {
                subStr = str1.substring(j, j+i);
                if (str2.indexOf(subStr) != -1) {
                    maxStr = subStr;
                    break;
                }
            }
        }

        return maxStr;
    }

}
