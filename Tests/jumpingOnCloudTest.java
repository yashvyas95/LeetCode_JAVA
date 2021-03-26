import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.LeetCode.Solutions.HackerTest.jumpingOnCloud.*;

public class jumpingOnCloudTest {
    @Test
    void methodTest() {
        int[] cloud = new int[]{0, 0, 1, 0, 0, 1};
        assertEquals(3, jumpingOnClouds(cloud));

    }
}
