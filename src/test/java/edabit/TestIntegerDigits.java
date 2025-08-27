package edabit;

import app.edabit.IntegerDigits;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestIntegerDigits {

    @Test
    public void test01() {
        IntegerDigits checker = new IntegerDigits();
        int test = 4666;
        assertEquals(4, checker.count(test));
    }

    @Test
    public void test02() {
        IntegerDigits checker = new IntegerDigits();
        int test = 544;
        assertEquals(3, checker.count(test));
    }

    @Test
    public void test03() {
        IntegerDigits checker = new IntegerDigits();
        int test = 0;
        assertEquals(1, checker.count(test));
    }

    @Test
    public void test04() {
        IntegerDigits checker = new IntegerDigits();
        int test = 318;
        assertEquals(3, checker.count(test));
    }

    @Test
    public void test05() {
        IntegerDigits checker = new IntegerDigits();
        int test = -92563;
        assertEquals(5, checker.count(test));
    }

    @Test
    public void test06() {
        IntegerDigits checker = new IntegerDigits();
        int test = 314890;
        assertEquals(6, checker.count(test));
    }

    @Test
    public void test07() {
        IntegerDigits checker = new IntegerDigits();
        int test = 654321;
        assertEquals(6, checker.count(test));
    }

    @Test
    public void test08() {
        IntegerDigits checker = new IntegerDigits();
        int test = 638476;
        assertEquals(6, checker.count(test));
    }

    @Test
    public void test09() {
        IntegerDigits checker = new IntegerDigits();
        int test = 12345;
        assertEquals(5, checker.count(test));
    }

    @Test
    public void test10() {
        IntegerDigits checker = new IntegerDigits();
        int test = 1289396;
        assertEquals(7, checker.count(test));
    }

    @Test
    public void test11() {
        IntegerDigits checker = new IntegerDigits();
        int test = -1232323;
        assertEquals(7, checker.count(test));
    }

    @Test
    public void test12() {
        IntegerDigits checker = new IntegerDigits();
        int test = 12839393;
        assertEquals(8, checker.count(test));
    }

    @Test
    public void test13() {
        IntegerDigits checker = new IntegerDigits();
        int test = -231273683;
        assertEquals(9, checker.count(test));
    }
}
// end of tests
