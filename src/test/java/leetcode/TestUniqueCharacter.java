package leetcode;

import app.leetcode.UniqueCharacter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUniqueCharacter {
    @Test
    public void test1(){
        String testString ="leetcode";
        int expectedResult = 0;
        UniqueCharacter uniqueCharacter = new UniqueCharacter();
        int testResult = uniqueCharacter.firstUniqChar(testString);
        assertEquals(expectedResult, testResult);
    }
    @Test
    public void test2(){
        String testString ="loveleetcode";
        int expectedResult = 2;
        UniqueCharacter uniqueCharacter = new UniqueCharacter();
        int testResult = uniqueCharacter.firstUniqChar(testString);
        assertEquals(expectedResult, testResult);
    }
    @Test
    public void test3(){
        String testString ="aabb";
        int expectedResult = -1;
        UniqueCharacter uniqueCharacter = new UniqueCharacter();
        int testResult = uniqueCharacter.firstUniqChar(testString);
        assertEquals(expectedResult, testResult);
    }
}
