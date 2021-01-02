import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.LeetCode.Solutions.HackerTest.tripleSum;

public class tripleSumTest {
    @Test
    void triplesumtest(){
        int[][] inputs = new int[][]{{3,2,3},{1,3,5},{2,3},{1,2,3}};
        assertEquals(8, tripleSum.triplets(inputs[0],inputs[1],inputs[2]));
    }
}