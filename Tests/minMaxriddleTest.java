
import com.LeetCode.Solutions.HackerTest.minMaxriddle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import com.LeetCode.Solutions.HackerTest.minMaxriddle.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class minMaxriddleTest {
        @Test
        void minMaxriddleTest(){
            long[][] inputs = new long[][]{{3,5,4,7,6,2},{}};
            assertEquals(new long[] {7,6,4,4,3,2}, minMaxriddle.riddle(inputs[0]));
        }
}
