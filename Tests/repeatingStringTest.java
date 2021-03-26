import org.junit.jupiter.api.Test;

import static com.LeetCode.Solutions.HackerTest.repeatingString.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class repeatingStringTest {
    @Test
    public void method() {
        assertEquals(7, repeatedString("aba", 10));
    }
}
