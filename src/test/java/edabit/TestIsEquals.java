package edabit;

import app.edabit.IsEquals;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestIsEquals {
    @Test
    public void test1() {
        IsEquals test = new IsEquals();
        int checker1 = 2;
        int checker2 = 2;
        assertEquals(true, test.isEquals(checker1, checker2));
    }

    @Test
    public void test2() {
        IsEquals test = new IsEquals();
        int checker1 = 88;
        int checker2 = 88;
        assertEquals(true, test.isEquals(checker1, checker2));
    }

    @Test
    public void test3() {
        IsEquals test = new IsEquals();
        int checker1 = 36;
        int checker2 = 35;
        assertEquals(false, test.isEquals(checker1, checker2));
    }

    @Test
    public void test4() {
        IsEquals test = new IsEquals();
        int checker1 = 1;
        int checker2 = 1;
        assertEquals(true, test.isEquals(checker1, checker2));
    }

    @Test
    public void test5() {
        IsEquals test = new IsEquals();
        int checker1 = 5;
        int checker2 = 6;
        assertEquals(false, test.isEquals(checker1, checker2));
    }
}
