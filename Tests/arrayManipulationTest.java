import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.LeetCode.Solutions.HackerTest.ArrayManipulation;


public class arrayManipulationTest {

        @Test
        void methodTest(){
            int[][] a = new int[3][];
            a[0] = new int[3];
            a[0] = new int[]{1, 2, 100};
            a[1] = new int[3];
            a[1] = new int[]{2, 5, 100};
            a[2] = new int[3];
            a[2] = new int[]{3, 4, 100};
            assertEquals(200, ArrayManipulation.arrayManipulation(10, a));

        }
}
