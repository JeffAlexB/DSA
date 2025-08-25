### main.java.app.leetcode.TwoSum Solution?
Initial solution and thoughts towards twosum is easy: <i> add numbers, then check</i> - which resulted in teh
following initial solution 
````
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + nums[i + 1] == target) {
                return new int[]{i, i + 1};
            } 
        }
        return new int[]{};
    }
}
````
An obviously egregious error is the simple index adding, which only gives correct results if the numbers are 
neighbours in the array. So obviously I forgot that its completely possible (and necessary) to have each first 
integer act as the 'anchor' for the next comparison, not just compare it to the next in line. That resulted in 
the next iteration:
````
    for (int i = 0; i < nums.length - 1; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
                return new int[]{i, j};
            }
        }
    }
    return new int[]{};
````
Now, this obviously works as a brute-force method, and solves all the edge cases thrown at it from main.java.app.leetcode's 
wonderful array of testcases - but the big question is: <i>can it go faster?</i>. So far, the solution is O($n^2$)
which isn't great, but to be expected when running a loop within a loop. A more optimal solution might be to 
use HashMaps, where the script (program?) iterates over the given array once and checks if the target integer
minus the array int exits in the hashmap. If so, a valid pair exist, if not: add the integer to the hashtable.
````
        HashMap<Integer, Integer> integerMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) { 
            integerMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int change = target - nums[i];
            if (integerMap.containsKey(change) && integerMap.get(change) != i) {
                return new int[]{i, integerMap.get(change)};
            }
        }
        return new int[]{};
````
This should be slightly faster, hashmap lookups are typically O($1$) on average, making the full solution O($n$) time 
complexity overall. HashMaps have average-case O($1$) but can degrade to O($n$) in worst case due to hash collisions, 
though this is rare with good hashing and doesn't typically affect java’s built-in implementation.

Implementing this, the solution creates an
empty hashtable to store elements and their index, then iterating over the array. Then for the "math" or algorithm (rule?)
the basic calculation is `change = target - nums[i];` and then immediately checks if the change integer exists in the 
hash table, if so - the solution pair is found. And at the end, if there is no solution, simply return an empty 
array to indicate a lack of paired integers as requested by the solution suggestions / prompts. 