import org.junit.jupiter.api.Test;
import com.LeetCode.Solutions.HackerTest.greedyFlorist;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class greedyFloristTest {
    @Test
    void getMinimumCostTest(){
        int[][] inputs = new int[][]{{1,3,5,7,9},{2,5,6},{390225,426456,688267,800389,990107,439248,240638,15991,874479,568754,729927,980985,132244,488186,5037,721765,251885,28458,23710,281490,30935,897665,768945,337228,533277,959855,927447,941485,24242,684459,312855,716170,512600,608266,779912,950103,211756,665028,642996,262173,789020,932421,390745,433434,350262,463568,668809,305781,815771,550800}};
        int[] grps = new int[]{3,2,3};
        assertEquals(163578911, greedyFlorist.getMinimumCost(grps[2],inputs[2]));
        assertEquals(15, greedyFlorist.getMinimumCost(grps[1],inputs[1]));
        assertEquals(29, greedyFlorist.getMinimumCost(grps[0],inputs[0]));

    }
}
