import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.LeetCode.Solutions.HackerTest.comString.commonChild;


public class comStringTest {
    @Test
    public void testMethod(){
        String[] s = new String[2];
        s[0]="AA";s[1]="BB";
        int result = 0;
     //   assertEquals(0, commonChild(s[0],s[1]));
        //assertEquals(2, commonChild("Harry","Sally"));
        assertEquals(4, commonChild("SHINCHAN","NOHARAAA"));


    }
}
