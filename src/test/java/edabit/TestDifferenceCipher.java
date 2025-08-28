package edabit;

import app.edabit.DifferenceCipher;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class TestDifferenceCipher {
    @Test
    public void test1() {
        String plainText = "?";
        int[] expectedCipher = {63};
        assertEquals(DifferenceCipher.encrypt(plainText), expectedCipher);
    }

    @Test
    public void test2() {
        String plainText = "The neighbours are strange..";
        int[] expectedCipher = {84, 20,  -3,  -69,  78,  -9,  4,  -2,  1,  -6,  13,  6,  -3,  1, -83,
                                65,  17,  -13,  -69,  83,  1,  -2,  -17,  13,  -7,  -2,  -55,  0};
        assertEquals(DifferenceCipher.encrypt(plainText), expectedCipher);
    }

    @Test
    public void test3() {
        String plainText = "It's a secret!";
        int[] expectedCipher = {73, 43, -77, 76, -83, 65, -65, 83, -14, -2, 15, -13, 15, -83};
        assertEquals(DifferenceCipher.encrypt(plainText), expectedCipher);
    }

    @Test
    public void test4() {
        String plainText = "OK";
        int[] expectedCipher = {79, -4 };
        assertEquals(DifferenceCipher.encrypt(plainText), expectedCipher);
    }

    @Test
    public void test5() {
        String plainText = "Tomorrow, 3 pm in the garden.";
        int[] expectedCipher = {84, 27,  -2,  2,  3,  0,  -3,  8,  -75,  -12,  19,  -19,  80,  -3,  -77,
                                73,  5,  -78,  84,  -12,  -3,  -69,  71,  -6,  17,  -14,  1,  9,  -64 };
        assertEquals(DifferenceCipher.encrypt(plainText), expectedCipher);
    }

    @Test
    public void test6() {
        String plainText = "Sunshine";
        int[] expectedCipher = {83, 34, -7, 5, -11, 1, 5, -9};
        assertEquals(DifferenceCipher.encrypt(plainText), expectedCipher);
    }
}
