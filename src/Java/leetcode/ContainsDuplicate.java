package Java.leetcode;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> list = new HashSet<Integer>();
        for (int element: nums){
            // if .add() returns false, it means it was already in the set
            // easier (better?) then try / catch, or if / else statements.
            if(!list.add(element)){
                return true;
            }
        }
        return false;
    }
}
