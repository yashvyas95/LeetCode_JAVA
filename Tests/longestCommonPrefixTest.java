import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import com.LeetCode.Solutions.LongestCommonPrefx.longestCommonPrefix;
class longestCommonPrefixTest {

    @Test
    void longestCommonPrefixTest1(){

        String[] strs = {"aa","a"};
        assertEquals("a",longestCommonPrefix.longestCommonPrefix(strs));
    }
}