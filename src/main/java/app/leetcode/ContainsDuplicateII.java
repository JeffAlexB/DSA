package app.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
    public boolean containsDuplicate(int[] nums, int k) {
        /** Given an integer array nums and an integer k, return true if
         * there are two distinct indices i and j in the array such that
         * nums[i] == nums[j] and abs(i - j) <= k.
         // nums == null || null.length < 0
            // return false
         // for int i < nums.length
            // for int j=i+1 < nums.length <<<-- error, where I was thinking K was just abs(i-j), not index
                // if nums[i] - nums[j] <= k
                    // return true
         // return false
         */
        /*
        if (nums == null || nums.length == 0) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= i + k && j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        */
        if (nums == null || nums.length == 0 || k <= 0) {
            return false;
        }
        Set<Integer> arrayWindow = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            // if nums[i] is already in the set -> return true
            if(!arrayWindow.add(nums[i])) {
                return true;
            }
            // if the sets size becomes k+1, removes the element that slides out of range
            // to range nums[i-k] so the window follows L->R
            if (arrayWindow.size() > k) {
                // does the sliding of the window
                arrayWindow.remove(nums[i-k]);
            }
        }
        return false;
    }
}
