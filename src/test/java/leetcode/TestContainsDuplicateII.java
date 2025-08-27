package leetcode;

import app.leetcode.ContainsDuplicateII;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestContainsDuplicateII {
    @Test
    public void test1() {
        ContainsDuplicateII checker = new ContainsDuplicateII();
        int[] testArray = {1,2,3,1};
        int testInteger = 3;
        assertTrue("true", checker.containsDuplicate(testArray, testInteger));
    }

    @Test
    public void test2() {
        ContainsDuplicateII checker = new ContainsDuplicateII();
        int[] testArray = {1,0,1,1};
        int testInteger = 1;
        assertTrue("true", checker.containsDuplicate(testArray, testInteger));
    }

    @Test
    public void test3() {
        ContainsDuplicateII checker = new ContainsDuplicateII();
        int[] testArray = {1,2,3,1,2,3};
        int testInteger = 2;
        assertFalse("false", checker.containsDuplicate(testArray, testInteger));
    }
}
