package Java.leetcode;

import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        String sSorted = new String(sArray);
        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);
        String tSorted = new String(tArray);

        if (sSorted.equals(tSorted)){
            return true;
        } else {
            return false;
        }
    };
}
