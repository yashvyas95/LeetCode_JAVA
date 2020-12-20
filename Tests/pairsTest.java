import com.LeetCode.Solutions.HackerTest.SherlockValid;
import org.junit.jupiter.api.Test;
import com.LeetCode.Solutions.HackerTest.pairs.*;

import static com.LeetCode.Solutions.HackerTest.pairs.pairsmethod;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class pairsTest {
    @Test
    public void pairsTest(){
        int[][] inputs = new int[][]{{1,5,3,4,2}};
        int[] output = new int[]{3};
        assertEquals(output[0], pairsmethod(2,inputs[0]));
    }
}
