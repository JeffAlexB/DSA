package main.java.app.leetcode;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        // catch case
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

                                        // counts each letter in the magazine variable
        int[] count = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            count[c - 'a']++;
            //System.out.println(c);
        }

        // decrements the magazine variable based on each letter in ransomeNote
        for (int j = 0; j < ransomNote.length(); j++) {
            char c = ransomNote.charAt(j);
            count[c - 'a']--;           // checks against the occurence of the letter
            if(count[c - 'a'] < 0){     // if the count goes < 0, no extra letter in magazine
                return false;
            }
        }

        return true;                    // if all letters in ransomeNote are found, returns true
    }
}

