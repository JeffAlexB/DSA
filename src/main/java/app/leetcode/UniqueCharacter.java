package app.leetcode;

public class UniqueCharacter {
    /**
     * Given a string s, find the first non-repeating character in it
     * and return its index. If it does not exist, return -1.
     *      Input: s = "leetcode"
     *      Output: 0
     * The character 'l' at index 0 is the first character that does not occur at any other index.
     */
    public int firstUniqChar(String s){
        if (s==null || s.isEmpty()){
            return -1;
        }
        // counting 'a' through 'z'
        int[] frequency = new int[26];
        for (int i = 0; i < s.length(); i++){
            frequency[s.charAt(i)-'a']++;
        }
        for  (int i = 0; i < s.length(); i++){
            if (frequency[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;

        /**
        char[] array = s.toCharArray();
        //System.out.println(array);
        for(int i=0;i<array.length;i++){
            //System.out.println(array[i]);
            if (array[i] != array[i + 1]){
                //System.out.println(array[i]);
                return i;
            }
        }
        return -1;*/
    }
}
