package kata;

import app.kata.MineSweeper;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestMineSweeper{

    // helper function
    private void assert2DCharArrayEquals(char[][] expected, char[][] actual) {
        assertEquals("Row count differs by: ", expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals("Row " + i + " differs", expected[i], actual[i]);
        }
    }

    @Test
    public void testSmallField() {
        char[][] input = {
                "*...".toCharArray(),
                "....".toCharArray(),
                ".*..".toCharArray(),
                "....".toCharArray()
        };

        char[][] expected = {
                "*100".toCharArray(),
                "2210".toCharArray(),
                "1*10".toCharArray(),
                "1110".toCharArray()
        };

        char[][] output = MineSweeper.transform(input);
        assert2DCharArrayEquals(expected, output);
    }

    @Test
    public void testSmallField2() {
        char[][] input = {
                "**...".toCharArray(),
                ".....".toCharArray(),
                ".*...".toCharArray()
        };

        char[][] expected = {
                "**100".toCharArray(),
                "33200".toCharArray(),
                "1*100".toCharArray()
        };

        char[][] output = MineSweeper.transform(input);
        assert2DCharArrayEquals(expected, output);
    }

    @Test
    public void testEmptyField() {
        char[][] input = {
                "....".toCharArray(),
                "....".toCharArray()
        };

        char[][] expected = {
                "0000".toCharArray(),
                "0000".toCharArray()
        };

        char[][] output = MineSweeper.transform(input);
        assert2DCharArrayEquals(expected, output);
    }

    @Test
    public void testAllMines() {
        char[][] input = {
                "***".toCharArray(),
                "***".toCharArray()
        };

        char[][] expected = {
                "***".toCharArray(),
                "***".toCharArray()
        };

        char[][] output = MineSweeper.transform(input);
        assert2DCharArrayEquals(expected, output);
    }
}
