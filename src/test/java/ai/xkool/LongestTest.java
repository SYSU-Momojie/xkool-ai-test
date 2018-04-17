package ai.xkool;

import org.junit.Assert;
import org.junit.Test;

public class LongestTest {

    @Test
    public void test1() {
        Integer[] arr = {1, 2, 3, 8, 9, 10, 11};
        Integer[] expected = {8, 9, 10, 11};
        Integer[] ans = LongestIncrement.find(arr, 1);
        Assert.assertArrayEquals(ans, expected);
    }

    @Test
    public void test2() {
        Integer[] arr = {3, 2, 4, 5, 6, 1, 9};
        Integer[] expected = {4, 5, 6};
        Integer[] ans = LongestIncrement.find(arr, 1);
        Assert.assertArrayEquals(ans, expected);
    }
}
