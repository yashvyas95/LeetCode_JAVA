import static org.junit.jupiter.api.Assertions.assertEquals;

import static com.LeetCode.Solutions.HackerTest.candies.candiesMethod;
import org.junit.jupiter.api.Test;

public class candiesTest {
    @Test
    public void method(){
        int[] input = new int[]{4,6,4,5,6,2};
        //assertEquals(10, candiesMethod(6,input));
        int[] input2 = new int[]{1,2,2};
        //assertEquals(4, candiesMethod(3,input2));
        int[] input3 = new int[]{2,4,2,6,1,7,8,9,2,1};
        assertEquals(19, candiesMethod(10,input3));
    }
}
