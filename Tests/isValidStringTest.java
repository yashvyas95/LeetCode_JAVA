import com.LeetCode.Solutions.HackerTest.SherlockValid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class isValidStringTest {
    @Test
    void isValidStringTest(){
        String[] inputs = {"abcdefghhgfedecba","aabbccddeefghi","aabbccd","aabbccc","abcd","aabbcccc"};
        assertEquals("NO",SherlockValid.isValid(inputs[1]));
        assertEquals("YES",SherlockValid.isValid(inputs[2]));
        assertEquals("YES",SherlockValid.isValid(inputs[3]));
        assertEquals("YES",SherlockValid.isValid(inputs[4]));
        assertEquals("NO",SherlockValid.isValid(inputs[5]));
        assertEquals("YES",SherlockValid.isValid(inputs[0]));

    }
}
