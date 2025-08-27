package edabit;

import main.java.app.edabit.SevenBoom;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSevenBoom {
    @Test
    public void test1() {
        SevenBoom checker = new SevenBoom();
        int[] testArray1 = {2, 6, 7, 9, 3};
        assertEquals("Boom!", checker.SevenBoom(testArray1));
    }

    @Test
    public void test2() {
        SevenBoom checker = new SevenBoom();
        int[] testArray1 = {33, 68, 400, 5};
        assertEquals("there is no 7 in the array", checker.SevenBoom(testArray1));
    }

    @Test
    public void test3() {
        SevenBoom checker = new SevenBoom();
        int[] testArray1 = {86, 48, 100, 66};
        assertEquals("there is no 7 in the array", checker.SevenBoom(testArray1));
    }

    @Test
    public void test4() {
        SevenBoom checker = new SevenBoom();
        int[] testArray1 = {76, 55, 44, 32};
        assertEquals("Boom!", checker.SevenBoom(testArray1));
    }

    @Test
    public void test5() {
        SevenBoom checker = new SevenBoom();
        int[] testArray1 = {35, 4, 9, 37};
        assertEquals("Boom!", checker.SevenBoom(testArray1));
    }
}
