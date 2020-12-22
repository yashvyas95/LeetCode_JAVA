import com.LeetCode.Solutions.HackerTest.makeAnagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class makeAnagramTest {
    @Test
    void makeAnagramTest(){
        String[] s = new String[]{"cde","acf","fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke"};
     //   assertEquals(4,makeAnagram.makeAnagram(s[0],s[1]));
        assertEquals(30,makeAnagram.makeAnagram(s[2],s[3]));

    }
}
