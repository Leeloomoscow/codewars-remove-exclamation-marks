import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void testSimpleString1() {
        assertEquals("Hello World", Solution.removeExclamationMarks("Hello World!"));
    }

    private static class Solution {
        public static String removeExclamationMarks(String s) {
            return s.replace("!", "");
        }
    }
}