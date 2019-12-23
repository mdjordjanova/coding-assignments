package binarygap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {

    static String bin(int n) {
        String s = "";
        while (n > 0)
        {
            s =  ( (n % 2 ) == 0 ? "0" : "1") + s;
            n = n / 2;
        }
        return s;
    }


    public int solution(int n) {
        // write your code in Java SE 8
        String s = Solution.bin(n);

        Pattern pattern = Pattern.compile("1[0]+1");
        Matcher matcher = pattern.matcher(s);

        int maxLength = 0;
        while (matcher.find()) {
            // Get the matching string
            String match = matcher.group();
            if (match.length() > maxLength) {
                maxLength = match.length();
            }
        }
        return (maxLength - 2) > 0 ? (maxLength - 2) : 0;
    }
}