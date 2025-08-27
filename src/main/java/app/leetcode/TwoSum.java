package main.java.app.leetcode;

public class TwoSum {
    public int[] TwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}

        /*HashMap<Integer, Integer> integerMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            integerMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int change = target - nums[i];
            if (integerMap.containsKey(change) && integerMap.get(change) != i) {
                return new int[]{i, integerMap.get(change)};
            }
        }
        return new int[]{};*/