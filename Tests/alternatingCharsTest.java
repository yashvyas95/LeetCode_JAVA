import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import com.LeetCode.Solutions.HackerTest.alternatingCharacter;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class alternatingCharsTest {
    @Test
    void alternatingCharsTest(){
        String[] s = new String[]{"AAABBB","ABABAB"};

        assertEquals(4,alternatingCharacter.alternatingCharactersmethod(s[0]));
    }
}
