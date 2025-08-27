package app.leetcode;

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
        return false;
    }
}
