import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.LeetCode.Solutions.HackerTest.FlippingBits;

public class FlippingBitsTest {

    @Test
    void testmethod(){
        long input =   4;
        String output = "4294967291";
        assertEquals(output,FlippingBits.flippingBits(input));
    }

}
