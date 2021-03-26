import static com.LeetCode.Solutions.HackerTest.SherlockandAnagram.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SherlockAnagramTest {
    @Test
    void Test() {
        String[] s = new String[]{"abba", "acf", "fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"};
        //   assertEquals(4,makeAnagram.makeAnagram(s[0],s[1]));
        assertEquals(4, sherlockAndAnagrams(s[0]));

    }
}
