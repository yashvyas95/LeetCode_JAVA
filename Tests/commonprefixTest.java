
import com.LeetCode.Solutions.HackerTest.Stringprefix;
import com.LeetCode.Solutions.HackerTest.minMaxriddle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import com.LeetCode.Solutions.HackerTest.Stringprefix.*;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class commonprefixTest {
    @Test
    void comomprefixTest(){
            String a = "abcabcd";
            ArrayList<String> a1 = new ArrayList<>();
            a1.add(a);
        assertEquals(10, Stringprefix.commonPrefix(a1));

    }
}
