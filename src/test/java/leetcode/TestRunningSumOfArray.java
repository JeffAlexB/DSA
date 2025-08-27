package leetcode;

import app.leetcode.RunningSumOfArray;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestRunningSumOfArray {
    @Test
    public void test1() {
        // arrange
        RunningSumOfArray checker = new RunningSumOfArray();
        int[] testInput = {1, 2, 3, 4};
        int[] expectedOutput = {1,3,6,10};
        // act
        int[] testOutput = checker.runningSum(testInput);
        // assert
        assertArrayEquals(expectedOutput, checker.runningSum(testInput));
    }

    @Test
    public void test2() {
        // arrange
        RunningSumOfArray checker = new RunningSumOfArray();
        int[] testInput = {1,1,1,1,1};
        int[] expectedOutput = {1,2,3,4,5};
        // act
        int[] testOutput = checker.runningSum(testInput);
        // assert
        assertArrayEquals(expectedOutput, testOutput);
    }

    @Test
    public void test3() {
        // arrange
        RunningSumOfArray checker = new RunningSumOfArray();
        int[] testInput = {3,1,2,10,1};
        int[] expectedOutput = {3,4,6,16,17};
        // act
        int[] testOutput = checker.runningSum(testInput);
        // assert
        assertArrayEquals(expectedOutput, testOutput);
    }
}
