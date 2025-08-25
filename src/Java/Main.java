package Java;

import Java.edabit.SevenBoom;

public class Main {
    public static void main(String[] args) {
        /*
        TwoSum checker = new TwoSum();
        int[] testArray1 = {3,2,4};
        int testTarget1 = 6;
        System.out.println("Test 1: " + Arrays.toString(checker.TwoSum(testArray1, testTarget1))); //
        int[] testArray2 = {3,3};
        int testTarget2 = 6;
        System.out.println("Test 1: " + Arrays.toString(checker.TwoSum(testArray2, testTarget2))); //
        */
        /*Java.leetcode.ContainsDuplicate checker = new Java.leetcode.ContainsDuplicate();

        int[] testArray1 = {1, 2, 3, 4};         // No duplicates
        int[] testArray2 = {1, 2, 3, 1};         // Has duplicate

        System.out.println("Test 1: " + checker.containsDuplicate(testArray1)); // false
        System.out.println("Test 2: " + checker.containsDuplicate(testArray2)); // true*/

        /*
        Java.leetcode.RansomNote checker = new Java.leetcode.RansomNote();
        String note1 = "aa", magazine1 = "aab";  // tests true
        String note2 = "aa", magazine2 = "ab";   // tests false

        System.out.println("Test 1: " + checker.canConstruct(note1, magazine1));
        System.out.println("Test 2: " + checker.canConstruct(note2, magazine2));
        */
        /*
        LonelyNumbers checker = new LonelyNumbers();

        var test1 = checker.numbersNeedFriendsToo(4666);
        System.out.println("Test 1: " + test1);
        var test2 = checker.numbersNeedFriendsToo(544);
        System.out.println("Test 2: " + test2);
        var test3 = checker.numbersNeedFriendsToo(123);
        System.out.println("Test 3: " + test3);
        var test4 = checker.numbersNeedFriendsToo(56657);
        System.out.println("Test 4: " + test4);
        var test5 = checker.numbersNeedFriendsToo(33);
        System.out.println("Test 5: " + test5);
        */
        /*
        int number = 4_000_000;
        EvenFibonacciSum fibonacciSum = new EvenFibonacciSum();
        System.out.println(fibonacciSum.recursiveEvenFibonacciSum(number));
        var test1 = new SearchingForPrimes();
        System.out.println(test1.findPrimes(10001));*/

        SevenBoom checker = new SevenBoom();
        int[] testArray1 = new int[] {1, 2, 3, 4, 5, 6, 7};
        int[] testArray2 = new int[] {8, 6, 33, 100};
        int[] testArray3 = new int[] {35, 4, 9, 37};
        System.out.println("Test 1: " + checker.SevenBoom(testArray1)); // Boom!
        System.out.println("Test 2: " + checker.SevenBoom(testArray2)); // No 7's found
        System.out.println("Test 1: " + checker.SevenBoom(testArray1)); // Boom!
    }
}
