package euler;

import app.euler.Euler15LatticePaths;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEuler15LatticePaths {
    @Test
    public void test1(){
        Euler15LatticePaths euler = new Euler15LatticePaths();
        long testResult = euler.LatticePaths(2);
        long expectedResult = 6L;
        assertEquals(expectedResult, testResult);
    }

    @Test
    public void test2(){
        Euler15LatticePaths euler = new Euler15LatticePaths();
        long testResult = euler.LatticePaths(10);
        long expectedResult = 184756L;
        assertEquals(expectedResult, testResult);
    }

    @Test
    public void test3(){
        Euler15LatticePaths euler = new Euler15LatticePaths();
        long testResult = euler.LatticePaths(20);
        long expectedResult = 137846528820L;
        assertEquals(expectedResult, testResult);
    }
}
