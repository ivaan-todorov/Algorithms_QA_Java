package HW_10;

public class LongestCommonSubstring {

    public String longestCommonSubstring(String s1, String s2, String s3) {
        s1 = s1.trim().toLowerCase();
        s2 = s2.trim().toLowerCase();
        s3 = s3.trim().toLowerCase();

        int start = 0;
        int max = 0;

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                for (int k = 0; k < s3.length(); k++) {

                    int x = 0;
                    while (s1.charAt(i+x) == s2.charAt(j+x) && s3.charAt(k+x) == s2.charAt(j+x)) {
                        x++;

                        if ((i+x) >= s1.length() || (j+x) >= s2.length() || (k+x) >= s3.length()) {
                            break;
                        }

                        if (x > max) {
                            max = x;
                            start = i;
                        }
                    }
                }
            }
        }

        return s1.substring(start, start + max);
    }

}
